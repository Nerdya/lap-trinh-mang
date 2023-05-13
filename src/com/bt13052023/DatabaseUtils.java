package com.bt13052023;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DatabaseUtils {
  private static final String DB_URL = "jdbc:mysql://localhost:3306/qlsanpham";
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

  public static ArrayList<LoaiSP> getLoaiSPs() {
    ArrayList<LoaiSP> loaiSPS = new ArrayList<>();
    String query = "SELECT * FROM loai_sp";

    try (Connection connection = getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query)) {
      while (resultSet.next()) {
        LoaiSP loaiSP = new LoaiSP(
            resultSet.getString("ma_loai"),
            resultSet.getString("ten_loai")
        );
        loaiSPS.add(loaiSP);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return loaiSPS;
  }

  public static void addLoaiSP(String maLoai, String tenLoai) {
    String query = "INSERT INTO loai_sp (ma_loai, ten_loai) VALUES (?, ?)";

    try (Connection connection = getConnection();
        PreparedStatement statement = connection.prepareStatement(query)) {
      statement.setString(1, maLoai);
      statement.setString(2, tenLoai);
      statement.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public static void updateLoaiSP(String maLoai, String tenLoai) {
    String query = "UPDATE loai_sp SET ten_loai = ? WHERE ma_loai = ?";

    try (Connection connection = getConnection();
        PreparedStatement statement = connection.prepareStatement(query)) {
      statement.setString(1, tenLoai);
      statement.setString(2, maLoai);
      statement.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public static void deleteLoaiSP(String ma_loai) {
    String query = "DELETE FROM loai_sp WHERE ma_loai = '" + ma_loai + "'";

    try (Connection connection = getConnection();
        Statement statement = connection.createStatement()) {
      statement.executeUpdate(query);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public static ArrayList<SanPham> getSanPhams() {
    ArrayList<SanPham> sanPhams = new ArrayList<>();
    String query = "SELECT * FROM san_pham";

    try (Connection connection = getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query)) {
      while (resultSet.next()) {
        SanPham sanPham = new SanPham(
            resultSet.getString("ma_sp"),
            resultSet.getString("ten_sp"),
            resultSet.getInt("don_gia"),
            resultSet.getString("ma_loai")
        );
        sanPhams.add(sanPham);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return sanPhams;
  }
}