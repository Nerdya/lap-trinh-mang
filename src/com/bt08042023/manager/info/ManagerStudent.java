package com.bt08042023.manager.info;

import com.bt08042023.student.info.Student;
import java.util.Scanner;

/**
 * @author cuongnk
 * @since 08/04/2023
 */
public class ManagerStudent extends Student {

  int n;
  Student[] students;

  public ManagerStudent() {
  }

  public ManagerStudent(String name, int age, String nativePlace, String id, int n) {
    super(name, age, nativePlace, id);
    this.n = n;
  }

  public int getN() {
    return n;
  }

  public void setN(int n) {
    this.n = n;
  }

  public Student[] getStudents() {
    return students;
  }

  public void setStudents(Student[] students) {
    this.students = students;
  }

  @Override
  public void input() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhập số học sinh: ");
    n = Integer.parseInt(sc.nextLine());
    students = new Student[n];
    for (int i = 0; i < n; i++) {
       students[i] = new Student();
       students[i].input();
    }
  }

  @Override
  public void display() {
    for (int i = 0; i < n; i++) {
      System.out.println("Sinh viên thứ " + (i + 1) + ":");
      students[i].display();
      System.out.println();
    }
  }

  public void sort() {
    if (students == null || students.length == 0) {
      System.out.println("Không có dữ liệu học sinh.");
    } else {
      for (int i = 0; i < students.length - 1; i++) {
        for (int j = i + 1; j < students.length; j++) {
          if (students[i].getName().compareTo(students[j].getName()) < 0) {
            Student tg = students[i];
            students[i] = students[j];
            students[j] = tg;
          }
        }
      }
      display();
    }
  }

  public void searchByName() {
    Scanner sc = new Scanner(System.in);
    if (students == null || students.length == 0) {
      System.out.println("Không có dữ liệu học sinh.");
    } else {
      String name;
      System.out.print("Nhập tên bạn cần tìm: ");
      name = sc.nextLine();
      System.out.println("Thông tin các sinh viên cần tìm: ");
      int dem = 0;
      for (Student student : students) {
        if (student.getName().equals(name)) {
          student.display();
          System.out.println();
          dem++;
        }
      }
      if (dem == 0) {
        System.out.println("Không có sinh viên nào có tên " + name + ".");
      }
    }
  }
}
