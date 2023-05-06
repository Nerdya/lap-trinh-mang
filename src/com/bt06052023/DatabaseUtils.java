package com.bt06052023;

import java.sql.*;
import java.util.ArrayList;

public class DatabaseUtils {
  private static final String DB_URL = "jdbc:mysql://localhost:3306/qllh";
  private static final String USER = "root";
  private static final String PASSWORD = "1qazXSW@2020";

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

  public static ArrayList<Student> getStudents() {
    ArrayList<Student> students = new ArrayList<>();
    String query = "SELECT * FROM sinhvien";

    try (Connection connection = getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query)) {
      while (resultSet.next()) {
        Student Student = new Student(
            resultSet.getString("MaSinhVien"),
            resultSet.getString("HoTen"),
            resultSet.getString("GioiTinh"),
            resultSet.getString("SoDienThoai"),
            resultSet.getInt("Tuoi")
        );
        students.add(Student);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return students;
  }

  public static void updateStudent(String maSinhVien, String hoTen, String gioiTinh, String soDienThoai, int tuoi) {
    String query = "UPDATE sinhvien SET HoTen = ?, GioiTinh = ?, SoDienThoai = ?, Tuoi = ? WHERE MaSinhVien = ?";

    try (Connection connection = getConnection();
        PreparedStatement statement = connection.prepareStatement(query)) {
      statement.setString(1, hoTen);
      statement.setString(2, gioiTinh);
      statement.setString(3, soDienThoai);
      statement.setInt(4, tuoi);
      statement.setString(5, maSinhVien);
      statement.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public static void deleteStudent(String maSinhVien) {
    String query = "DELETE FROM sinhvien WHERE MaSinhVien = '" + maSinhVien + "'";

    try (Connection connection = getConnection();
        Statement statement = connection.createStatement()) {
      statement.executeUpdate(query);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}