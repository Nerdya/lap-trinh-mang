package com.bt06052023;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

/**
 * @author cuongnk
 * @since 24/04/2023
 */
public class StudentManagerFrame extends JFrame {
  // Variables that are bound to form
  private JPanel mainPanel;
  private JTextField codeField;
  private JTextField nameField;
  private JComboBox genderComboBox;
  private JTextField phoneField;
  private JTextField ageField;
  private JButton deleteButton;
  private JButton updateButton;
  private JTable studentTable;

  public StudentManagerFrame() {
    initFrame();
    initTable();
    initListeners();
  }

  private void initFrame() {
    setTitle("Student Manager");
    setSize(800, 450);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setContentPane(mainPanel);
  }

  private void initTable() {
    // Set column names
    String[] columnNames = {"Mã sinh viên", "Họ tên sinh viên", "Giới tính", "Điện thoại", "Tuổi"};

    // Get data from database or other data source
    ArrayList<Student> students = DatabaseUtils.getStudents();

    // Create data array with the same size as students ArrayList
    Object[][] data = new Object[students.size()][columnNames.length];

    // Populate data array with student data
    for (int i = 0; i < students.size(); i++) {
      Student student = students.get(i);
      data[i][0] = student.getMaSinhVien();
      data[i][1] = student.getHoTen();
      data[i][2] = student.getGioiTinh();
      data[i][3] = student.getSoDienThoai();
      data[i][4] = student.getTuoi();
    }

    // Create a new table model with the column names and data
    DefaultTableModel model = new DefaultTableModel(data, columnNames) {
      @Override
      public boolean isCellEditable(int row, int column) {
        return false;
      }
    };

    // Set the new table model to the table
    studentTable.setModel(model);
  }

  private void initListeners() {
    // Add onClick listener to the updateButton
    updateButton.addActionListener(e -> updateStudent());

    // Add onClick listener to the deleteButton
    deleteButton.addActionListener(e -> deleteStudent());

    // Add onClick listener to the studentTable
    studentTable.getSelectionModel().addListSelectionListener(event -> {
      if (!event.getValueIsAdjusting()) {
        int selectedRow = studentTable.getSelectedRow();
        if (selectedRow != -1) {
          DefaultTableModel model = (DefaultTableModel) studentTable.getModel();
          codeField.setText((String) model.getValueAt(selectedRow, 0));
          nameField.setText((String) model.getValueAt(selectedRow, 1));
          genderComboBox.setSelectedItem(model.getValueAt(selectedRow, 2));
          phoneField.setText((String) model.getValueAt(selectedRow, 3));
          ageField.setText(model.getValueAt(selectedRow, 4).toString());
        }
      }
    });
  }

  private void updateStudent() {
    String maSinhVien = codeField.getText();
    String hoTen = nameField.getText();
    String gioiTinh = (String) genderComboBox.getSelectedItem();
    String soDienThoai = phoneField.getText();
    int tuoi = Integer.parseInt(ageField.getText());

    DatabaseUtils.updateStudent(maSinhVien, hoTen, gioiTinh, soDienThoai, tuoi);

    initTable();
    clearFields();
  }

  private void deleteStudent() {
    String maSinhVien = codeField.getText();

    DatabaseUtils.deleteStudent(maSinhVien);

    initTable();
    clearFields();
  }

  private void clearFields() {
    codeField.setText("");
    nameField.setText("");
    genderComboBox.setSelectedIndex(0);
    phoneField.setText("");
    ageField.setText("");
  }
}
