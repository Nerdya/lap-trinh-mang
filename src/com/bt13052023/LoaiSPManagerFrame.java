package com.bt13052023;

import com.bt13052023.DatabaseUtils;
import com.bt13052023.Student;
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
  private JButton thêmButton;
  private JButton xóaButton;
  private JButton sửaButton;
  private JButton lưuButton;
  private JButton kLưuButton;
  private JButton thoátButton;
  private JTable table1;

  public LoaiSPManagerFrame() {
    initFrame();
    initTable();
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
}
