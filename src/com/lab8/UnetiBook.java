package com.lab8;

public class UnetiBook extends Book {

  private String language;
  private int semester;

  public UnetiBook() {
  }

  public UnetiBook(String bookName, String bookAuthor, String producer, int yearPublishing,
      float price, String language, int semester) {
    super(bookName, bookAuthor, producer, yearPublishing, price);
    this.language = language;
    this.semester = semester;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public int getSemester() {
    return semester;
  }

  public void setSemester(int semester) {
    this.semester = semester;
  }

  @Override
  public void input() {
    super.input();
    setLanguage(sm.inputString("ngôn ngữ"));
    setSemester(sm.inputInt("học kì"));
  }

  @Override
  public void display() {
    super.display();
    System.out.println("Ngôn ngữ: " + getLanguage());
    System.out.println("Học kì: " + getSemester());
  }
}
