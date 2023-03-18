package com.lab8;

import com.shared.SharedMethods;

public class Book {

  public static SharedMethods sm = new SharedMethods();
  private String bookName;
  private String bookAuthor;
  private String producer;
  private int yearPublishing;
  private float price;

  public Book() {
  }

  public Book(String bookName, String bookAuthor, String producer, int yearPublishing,
      float price) {
    this.bookName = bookName;
    this.bookAuthor = bookAuthor;
    this.producer = producer;
    this.yearPublishing = yearPublishing;
    this.price = price;
  }

  public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }

  public String getBookAuthor() {
    return bookAuthor;
  }

  public void setBookAuthor(String bookAuthor) {
    this.bookAuthor = bookAuthor;
  }

  public String getProducer() {
    return producer;
  }

  public void setProducer(String producer) {
    this.producer = producer;
  }

  public int getYearPublishing() {
    return yearPublishing;
  }

  public void setYearPublishing(int yearPublishing) {
    this.yearPublishing = yearPublishing;
  }

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    this.price = price;
  }

  public void input() {
    setBookName(sm.inputString("tên"));
    setBookAuthor(sm.inputString("tác giả"));
    setProducer(sm.inputString("nhà xuất bản"));
    setYearPublishing(sm.inputInt("năm xuất bản", "whole"));
    setPrice(sm.inputFloat("giá tiền", "whole"));
  }

  public void display() {
    System.out.println("Tên: " + getBookName());
    System.out.println("Tác giả: " + getBookAuthor());
    System.out.println("Nhà xuất bản: " + getProducer());
    System.out.println("Năm xuất bản: " + getYearPublishing());
    System.out.println("Giá tiền: " + getPrice());
  }
}
