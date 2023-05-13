package com.bt13052023;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 * @author cuongnk
 * @since 13/05/2023
 */
public class AdminFrame extends JFrame {

  private JPanel mainPanel;
  private JButton loaiSPManagerButton;
  private JButton getSanPhamByLoaiSPButton;
  private JButton sanPhamManagerButton;
  private JButton searchSanPhamButton;

  public AdminFrame() {
    initFrame();
    initListeners();
  }

  private void initFrame() {
    setTitle("Admin");
    setSize(400, 300);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setContentPane(mainPanel);
  }

  private void initListeners() {
    // Add onClick listener to the updateButton
    loaiSPManagerButton.addActionListener(e -> showLoaiSPManager());

    // Add onClick listener to the deleteButton
//    deleteButton.addActionListener(e -> deleteStudent());

    // Add onClick listener to the studentTable
//    studentTable.getSelectionModel().addListSelectionListener(event -> {
//      if (!event.getValueIsAdjusting()) {
//        int selectedRow = studentTable.getSelectedRow();
//        if (selectedRow != -1) {
//          DefaultTableModel model = (DefaultTableModel) studentTable.getModel();
//          codeField.setText((String) model.getValueAt(selectedRow, 0));
//          nameField.setText((String) model.getValueAt(selectedRow, 1));
//          genderComboBox.setSelectedItem(model.getValueAt(selectedRow, 2));
//          phoneField.setText((String) model.getValueAt(selectedRow, 3));
//          ageField.setText(model.getValueAt(selectedRow, 4).toString());
//        }
//      }
//    });
  }

  private void showLoaiSPManager() {
    setVisible(false);
    LoaiSPManagerFrame loaiSPManagerFrame = new LoaiSPManagerFrame();
    loaiSPManagerFrame.setVisible(true);
  }
}
