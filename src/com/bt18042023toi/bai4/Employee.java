package com.bt18042023toi.bai4;

abstract class Employee {
  protected String name;

  public Employee(String name) {
    this.name = name;
  }

  public abstract double earnings();
}
