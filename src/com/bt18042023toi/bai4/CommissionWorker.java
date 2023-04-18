package com.bt18042023toi.bai4;

class CommissionWorker extends Employee {
  private double baseSalary;
  private int numProductsSold;

  public CommissionWorker(String name, double baseSalary, int numProductsSold) {
    super(name);
    this.baseSalary = baseSalary;
    this.numProductsSold = numProductsSold;
  }

  public double earnings() {
    return this.baseSalary + (this.numProductsSold * 0.1);
  }
}
