package com.bt18042023toi.bai4;

class Boss extends Employee {
  private double monthlySalary;

  public Boss(String name, double monthlySalary) {
    super(name);
    this.monthlySalary = monthlySalary;
  }

  public double earnings() {
    return this.monthlySalary;
  }
}
