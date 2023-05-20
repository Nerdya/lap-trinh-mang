package com.kt2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame {

  private JPanel mainPanel;
  private JTextField usernameField;
  private JPasswordField passwordField;
  private JButton loginButton;
  private JButton clearButton;

  public LoginFrame() {
    initFrame();
    initListeners();
  }

  private void initFrame() {
    setTitle("Đăng nhập");
    setSize(400, 225);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setContentPane(mainPanel);
  }

  private void initListeners() {
    loginButton.addActionListener(e -> login());
    clearButton.addActionListener(e -> clear());
  }

  private void login() {
    String username = this.usernameField.getText();
    String password = new String(this.passwordField.getPassword());

    boolean result = DatabaseUtils.login(username, password);
    if (result) {
      setVisible(false);
      AdminFrame adminFrame = new AdminFrame();
      adminFrame.setVisible(true);
    }
  }

  private void clear() {
    usernameField.setText("");
    passwordField.setText("");
  }
}
