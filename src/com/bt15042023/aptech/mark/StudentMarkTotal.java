package com.bt15042023.aptech.mark;

/**
 * @author cuongnk
 * @since 15/04/2023
 */
public class StudentMarkTotal extends StudentMark {
  private int totalExamSubject;
  private float everageMark;

  public StudentMarkTotal() {
  }

  public StudentMarkTotal(String stuId, String className, String subjectName, int semester,
      float mark, int totalExamSubject, float everageMark) {
    super(stuId, className, subjectName, semester, mark);
    this.totalExamSubject = totalExamSubject;
    this.everageMark = everageMark;
  }

  public int getTotalExamSubject() {
    return totalExamSubject;
  }

  public void setTotalExamSubject(int totalExamSubject) {
    this.totalExamSubject = totalExamSubject;
  }

  public float getEverageMark() {
    return everageMark;
  }

  public void setEverageMark(float everageMark) {
    this.everageMark = everageMark;
  }

  @Override
  public void input() {
    super.input();
  }

  @Override
  public void display() {
    super.display();
  }

  public void getTotalExamSubject(StudentMarkTotal[] list) {

  }

  public void calculateAverageMark(StudentMarkTotal[] list) {

  }
}
