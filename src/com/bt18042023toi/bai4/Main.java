package com.bt18042023toi.bai4;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter boss name: ");
    String bossName = scanner.nextLine();
    System.out.print("Enter boss monthly salary: ");
    double bossSalary = scanner.nextDouble();
    Boss boss = new Boss(bossName, bossSalary);
    System.out.println(boss.name + " earns: $" + boss.earnings());

    scanner.nextLine();

    System.out.print("Enter piece worker name: ");
    String pieceWorkerName = scanner.nextLine();
    System.out.print("Enter number of products for piece worker: ");
    int numProducts = scanner.nextInt();
    PieceWorker pieceWorker = new PieceWorker(pieceWorkerName, numProducts);
    System.out.println(pieceWorker.name + " earns: $" + pieceWorker.earnings());

    scanner.nextLine();

    System.out.print("Enter commission worker name: ");
    String commissionWorkerName = scanner.nextLine();
    System.out.print("Enter commission worker base salary: ");
    double baseSalary = scanner.nextDouble();
    System.out.print("Enter number of products sold by commission worker: ");
    int numProductsSold = scanner.nextInt();
    CommissionWorker commissionWorker = new CommissionWorker(commissionWorkerName, baseSalary, numProductsSold);
    System.out.println(commissionWorker.name + " earns: $" + commissionWorker.earnings());

    scanner.close();
  }
}
