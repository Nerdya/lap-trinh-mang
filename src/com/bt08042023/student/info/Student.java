package com.bt08042023.student.info;

import com.bt08042023.person.info.Person;
import com.shared.SharedMethods;
import java.util.Scanner;

/**
 * @author cuongnk
 * @since 08/04/2023
 */
public class Student implements Person {

  public static final SharedMethods sm = new SharedMethods();

  String name;
  int age;
  String nativePlace;
  String id;

  public Student() {
    super();
  }

  public Student(String name, int age, String nativePlace, String id) {
    super();
    this.name = name;
    this.age = age;
    this.nativePlace = nativePlace;
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getNativePlace() {
    return nativePlace;
  }

  public void setNativePlace(String nativePlace) {
    this.nativePlace = nativePlace;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public void input() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhập tên: ");
    name = sc.nextLine();
    System.out.print("Nhập tuổi: ");
    age = Integer.parseInt(sc.nextLine());
    System.out.print("Nhập nơi sinh: ");
    nativePlace = sc.nextLine();
    System.out.print("Nhập id: ");
    id = sc.nextLine();
  }

  @Override
  public void display() {
    System.out.println("Tên: " + name);
    System.out.println("Tuổi: " + age);
    System.out.println("Nơi sinh: " + nativePlace);
    System.out.println("Id: " + id);
  }
}
