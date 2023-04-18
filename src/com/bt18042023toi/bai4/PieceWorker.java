package com.bt18042023toi.bai4;

class PieceWorker extends Employee {
  private int numProducts;

  public PieceWorker(String name, int numProducts) {
    super(name);
    this.numProducts = numProducts;
  }

  public double earnings() {
    return this.numProducts * 0.5;
  }
}
