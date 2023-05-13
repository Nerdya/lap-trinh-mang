package com.bt13052023;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 * @author cuongnk
 * @since 13/05/2023
 */
public class LoaiSPManagerFrame extends JFrame {

  private JPanel mainPanel;
  private JTextField textField1;
  private JTextField textField2;
  private JButton addButton;
  private JButton deleteButton;
  private JButton updateButton;
  private JButton exitButton;
  private JTable table1;

  public LoaiSPManagerFrame() {
    initFrame();
    initTable();
    initListeners();
  }

  private void initFrame() {
    setTitle("Danh mục loại sản phẩm");
    setSize(600, 450);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setContentPane(mainPanel);
  }

  private void initTable() {
    // Set column names
    String[] columnNames = {"Mã loại", "Tên loại"};

    // Get data from database or other data source
    ArrayList<LoaiSP> loaiSPs = DatabaseUtils.getLoaiSPs();

    // Create data array with the same size as loaiSPs ArrayList
    Object[][] data = new Object[loaiSPs.size()][columnNames.length];

    // Populate data array with loaiSP data
    for (int i = 0; i < loaiSPs.size(); i++) {
      LoaiSP loaiSP = loaiSPs.get(i);
      data[i][0] = loaiSP.getMaLoai();
      data[i][1] = loaiSP.getTenLoai();
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
    addButton.addActionListener(e -> addLoaiSP());

    // Add onClick listener to the updateButton
    updateButton.addActionListener(e -> updateLoaiSP());

    // Add onClick listener to the deleteButton
    deleteButton.addActionListener(e -> deleteLoaiSP());

    // Add onClick listener to the studentTable
    table1.getSelectionModel().addListSelectionListener(event -> {
      if (!event.getValueIsAdjusting()) {
        int selectedRow = table1.getSelectedRow();
        if (selectedRow != -1) {
          DefaultTableModel model = (DefaultTableModel) table1.getModel();
          textField1.setText((String) model.getValueAt(selectedRow, 0));
          textField2.setText((String) model.getValueAt(selectedRow, 1));
        }
      }
    });
  }

  private void addLoaiSP() {
    String maLoai = textField1.getText();
    String tenLoai = textField2.getText();

    DatabaseUtils.addLoaiSP(maLoai, tenLoai);

    initTable();
    clearFields();
  }

  private void updateLoaiSP() {
    String maLoai = textField1.getText();
    String tenLoai = textField2.getText();

    DatabaseUtils.updateLoaiSP(maLoai, tenLoai);

    initTable();
    clearFields();
  }

  private void deleteLoaiSP() {
    String maLoai = textField1.getText();

    DatabaseUtils.deleteLoaiSP(maLoai);

    initTable();
    clearFields();
  }

  private void clearFields() {
    textField1.setText("");
    textField2.setText("");
  }
}
