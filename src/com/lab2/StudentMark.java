package com.lab2;

import com.shared.SharedMethods;

public class StudentMark {

  private int rollNumber;
  private String fullName;
  private String className;
  private String subjectName;
  private float mark;

  public StudentMark(int rollNumber, String fullName, String className, String subjectName,
      float mark) {
    this.rollNumber = rollNumber;
    this.fullName = fullName;
    this.className = className;
    this.subjectName = subjectName;
    this.mark = mark;
  }

  public StudentMark() {
    this.rollNumber = 0;
    this.fullName = "";
    this.className = "";
    this.subjectName = "";
    this.mark = 0;
  }

  public int getRollNumber() {
    return rollNumber;
  }

  public void setRollNumber(int rollNumber) {
    this.rollNumber = rollNumber;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  public String getSubjectName() {
    return subjectName;
  }

  public void setSubjectName(String subjectName) {
    this.subjectName = subjectName;
  }

  public float getMark() {
    return mark;
  }

  public void setMark(float mark) {
    this.mark = mark;
  }

  static SharedMethods sm = new SharedMethods();

  void input() {
    this.rollNumber = sm.inputInt("roll number");
    sm.sc.nextLine();
    this.fullName = sm.inputString("họ tên");
    this.className = sm.inputString("tên lớp");
    this.subjectName = sm.inputString("tên môn");
    this.mark = sm.inputFloat("điểm", "0..10");
  }

  void print() {
    System.out.println("Roll number: " + this.rollNumber);
    System.out.println("Họ tên: " + this.fullName);
    System.out.println("Tên lớp: " + this.className);
    System.out.println("Tên môn: " + this.subjectName);
    System.out.println("Điểm: " + this.mark);
  }
}
