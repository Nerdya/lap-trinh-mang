package com.bt15042023.aptech.mark;

import com.bt15042023.aptech.IMark;

/**
 * @author cuongnk
 * @since 15/04/2023
 */
public class StudentMark implements IMark {
  private String stuId;
  private String className;
  private String subjectName;
  private int semester;
  private float mark;

  public StudentMark() {
  }

  public StudentMark(String stuId, String className, String subjectName, int semester, float mark) {
    this.stuId = stuId;
    this.className = className;
    this.subjectName = subjectName;
    this.semester = semester;
    this.mark = mark;
  }

  public String getStuId() {
    return stuId;
  }

  public void setStuId(String stuId) {
    this.stuId = stuId;
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

  public int getSemester() {
    return semester;
  }

  public void setSemester(int semester) {
    this.semester = semester;
  }

  public float getMark() {
    return mark;
  }

  public void setMark(float mark) {
    this.mark = mark;
  }

  @Override
  public void input() {

  }

  @Override
  public void display() {

  }
}
