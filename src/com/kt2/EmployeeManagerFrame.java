package com.kt2;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 * @author cuongnk
 * @since 13/05/2023
 */
public class EmployeeManagerFrame extends JFrame {

  private JPanel mainPanel;
  private JTextField textField1;
  private JTextField textField2;
  private JTextField textField3;
  private JTextField textField4;
  private JButton addButton;
  private JButton updateButton;
  private JButton deleteButton;
  private JButton toAdminButton;
  private JTable table1;

  public EmployeeManagerFrame() {
    initFrame();
    initTable();
    initListeners();
  }

  private void initFrame() {
    setTitle("Quản lý nhân viên");
    setSize(600, 450);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setContentPane(mainPanel);
  }

  private void initTable() {
    // Set column names
    String[] columnNames = {"Mã nhân viên", "Họ tên", "Quê quán", "Hệ số lương"};

    // Get data from database or other data source
    ArrayList<Employee> employees = DatabaseUtils.getEmployees();

    // Create data array with the same size as employees ArrayList
    Object[][] data = new Object[employees.size()][columnNames.length];

    // Populate data array with employee data
    for (int i = 0; i < employees.size(); i++) {
      Employee employee = employees.get(i);
      data[i][0] = employee.getMaNV();
      data[i][1] = employee.getHoTen();
      data[i][2] = employee.getQue();
      data[i][3] = String.valueOf(employee.getHeSoLuong());
    }

    // Create a new table model with the column names and data
    DefaultTableModel model = new DefaultTableModel(data, columnNames) {
      @Override
      public boolean isCellEditable(int row, int column) {
        return false;
      }
    };

    // Set the new table model to the table
    table1.setModel(model);
  }

  private void initListeners() {
    // Add onClick listener to the updateButton
    addButton.addActionListener(e -> addEmployee());

    // Add onClick listener to the updateButton
    updateButton.addActionListener(e -> updateEmployee());

    // Add onClick listener to the deleteButton
    deleteButton.addActionListener(e -> deleteEmployee());

    // Add onClick listener to the toAdminButton
    toAdminButton.addActionListener(e -> toAdmin());

    // Add onClick listener to the studentTable
    table1.getSelectionModel().addListSelectionListener(event -> {
      if (!event.getValueIsAdjusting()) {
        int selectedRow = table1.getSelectedRow();
        if (selectedRow != -1) {
          DefaultTableModel model = (DefaultTableModel) table1.getModel();
          textField1.setText((String) model.getValueAt(selectedRow, 0));
          textField2.setText((String) model.getValueAt(selectedRow, 1));
          textField3.setText((String) model.getValueAt(selectedRow, 2));
          textField4.setText((String) model.getValueAt(selectedRow, 3));
        }
      }
    });
  }

  private void addEmployee() {
    String maNV = textField1.getText();
    String hoTen = textField2.getText();
    String que = textField3.getText();

    try {
      float heSoLuong = Float.parseFloat(textField4.getText());
      DatabaseUtils.addEmployee(maNV, hoTen, que, heSoLuong);
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "Có lỗi xảy ra: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
      return;
    }

    initTable();
    clearFields();
  }

  private void updateEmployee() {
    String maNV = textField1.getText();
    String hoTen = textField2.getText();
    String que = textField3.getText();

    try {
      float heSoLuong = Float.parseFloat(textField4.getText());
      DatabaseUtils.updateEmployee(maNV, hoTen, que, heSoLuong);
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "Có lỗi xảy ra: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
      return;
    }

    initTable();
    clearFields();
  }

  private void deleteEmployee() {
    String maNV = textField1.getText();

    DatabaseUtils.deleteEmployee(maNV);

    initTable();
    clearFields();
  }

  private void clearFields() {
    textField1.setText("");
    textField2.setText("");
    textField3.setText("");
    textField4.setText("");
  }

  private void toAdmin() {
    setVisible(false);
    AdminFrame adminFrame = new AdminFrame();
    adminFrame.setVisible(true);
  }
}
