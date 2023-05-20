package com.kt2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DatabaseUtils {

  private static final String DB_URL = "jdbc:mysql://localhost:3306/qlnv";
  private static final String USER = "root";
  private static final String PASSWORD = "";

  public static Connection getConnection() {
    Connection connection = null;
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    }
    return connection;
  }

  public static ArrayList<Employee> getEmployees() {
    ArrayList<Employee> employees = new ArrayList<>();
    String query = "SELECT * FROM nhanvien";

    try (Connection connection = getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query)) {
      while (resultSet.next()) {
        Employee employee = new Employee(
            resultSet.getString("Manv"),
            resultSet.getString("Hoten"),
            resultSet.getString("Que"),
            resultSet.getFloat("Hesoluong")
        );
        employees.add(employee);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return employees;
  }

  public static ArrayList<Employee> getEmployeesByHoTen(String hoTen) {
    ArrayList<Employee> employees = new ArrayList<>();
    String query = "SELECT * FROM nhanvien WHERE Hoten LIKE ?";

    try (Connection connection = getConnection();
        PreparedStatement statement = connection.prepareStatement(query)) {
      statement.setString(1, "%" + hoTen + "%");
      ResultSet resultSet = statement.executeQuery();

      while (resultSet.next()) {
        Employee employee = new Employee(
            resultSet.getString("Manv"),
            resultSet.getString("Hoten"),
            resultSet.getString("Que"),
            resultSet.getFloat("Hesoluong")
        );
        employees.add(employee);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return employees;
  }

  public static ArrayList<Employee> getEmployeesByQueQuan(String que) {
    ArrayList<Employee> employees = new ArrayList<>();
    String query = "SELECT * FROM nhanvien WHERE Que LIKE ?";

    try (Connection connection = getConnection();
        PreparedStatement statement = connection.prepareStatement(query)) {
      statement.setString(1, "%" + que + "%");
      ResultSet resultSet = statement.executeQuery();

      while (resultSet.next()) {
        Employee employee = new Employee(
            resultSet.getString("Manv"),
            resultSet.getString("Hoten"),
            resultSet.getString("Que"),
            resultSet.getFloat("Hesoluong")
        );
        employees.add(employee);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return employees;
  }

  public static ArrayList<Employee> getEmployeesByHeSoLuong(float from, float to) {
    ArrayList<Employee> employees = new ArrayList<>();
    String query = "SELECT * FROM nhanvien WHERE Hesoluong BETWEEN ? AND ?";

    try (Connection connection = getConnection();
        PreparedStatement statement = connection.prepareStatement(query)) {
      statement.setFloat(1, from);
      statement.setFloat(2, to);
      ResultSet resultSet = statement.executeQuery();

      while (resultSet.next()) {
        Employee employee = new Employee(
            resultSet.getString("Manv"),
            resultSet.getString("Hoten"),
            resultSet.getString("Que"),
            resultSet.getFloat("Hesoluong")
        );
        employees.add(employee);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return employees;
  }

  public static void addEmployee(String maNV, String hoTen, String que, float heSoLuong) {
    String query = "INSERT INTO nhanvien (Manv, Hoten, Que, Hesoluong) VALUES (?, ?, ?, ?)";

    try (Connection connection = getConnection();
        PreparedStatement statement = connection.prepareStatement(query)) {
      statement.setString(1, maNV);
      statement.setString(2, hoTen);
      statement.setString(3, que);
      statement.setFloat(4, heSoLuong);
      statement.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public static void updateEmployee(String maNV, String hoTen, String que, float heSoLuong) {
    String query = "UPDATE nhanvien SET Hoten = ?, Que = ?, Hesoluong = ? WHERE maNV = ?";

    try (Connection connection = getConnection();
        PreparedStatement statement = connection.prepareStatement(query)) {
      statement.setString(1, hoTen);
      statement.setString(2, que);
      statement.setFloat(3, heSoLuong);
      statement.setString(4, maNV);
      statement.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public static void deleteEmployee(String maNV) {
    String query = "DELETE FROM nhanvien WHERE Manv = '" + maNV + "'";

    try (Connection connection = getConnection();
        Statement statement = connection.createStatement()) {
      statement.executeUpdate(query);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public static boolean login(String username, String password) {
    String query =
        "SELECT * FROM user WHERE username = '" + username + "' AND password = '" + password + "'";

    try (Connection connection = getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query)) {
      resultSet.next();
      if (!resultSet.wasNull()) {
        JOptionPane.showMessageDialog(null, "Đăng nhập thành công!");
        return true;
      } else {
        JOptionPane.showMessageDialog(null, "Sai tên tài khoản hoặc mật khẩu!");
        return false;
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return false;
  }
}