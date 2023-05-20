package com.kt2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author cuongnk
 * @since 13/05/2023
 */
public class AdminFrame extends JFrame {

  private JPanel mainPanel;
  private JButton employeeManagerButton;
  private JButton employeeSearchButton;

  public AdminFrame() {
    initFrame();
    initListeners();
  }

  private void initFrame() {
    setTitle("Admin");
    setSize(320, 240);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setContentPane(mainPanel);
  }

  private void initListeners() {
    employeeManagerButton.addActionListener(e -> showEmployeeManagerFrame());
    employeeSearchButton.addActionListener(e -> showEmployeeSearchFrame());
  }

  private void showEmployeeManagerFrame() {
    setVisible(false);
    EmployeeManagerFrame employeeManagerFrame = new EmployeeManagerFrame();
    employeeManagerFrame.setVisible(true);
  }

  private void showEmployeeSearchFrame() {
    setVisible(false);
    EmployeeSearchFrame employeeSearchFrame = new EmployeeSearchFrame();
    employeeSearchFrame.setVisible(true);
  }
}
