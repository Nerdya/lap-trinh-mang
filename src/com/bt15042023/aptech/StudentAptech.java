package com.bt15042023.aptech;

/**
 * @author cuongnk
 * @since 15/04/2023
 */
public class StudentAptech implements IMark {
  private String stuId;
  private String stuName;
  private String gender;
  private String birthday;
  private String nativePlace;

  public StudentAptech() {
  }

  public StudentAptech(String stuId, String stuName, String gender, String birthday,
      String nativePlace) {
    this.stuId = stuId;
    this.stuName = stuName;
    this.gender = gender;
    this.birthday = birthday;
    this.nativePlace = nativePlace;
  }

  public String getStuId() {
    return this.stuId;
  }

  public void setStuId(String stuId) {
    this.stuId = stuId;
  }

  public String getStuName() {
    return this.stuName;
  }

  public void setStuName(String stuName) {
    this.stuName = stuName;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }

  public String getNativePlace() {
    return nativePlace;
  }

  public void setNativePlace(String nativePlace) {
    this.nativePlace = nativePlace;
  }

  @Override
  public void input() {

  }

  @Override
  public void display() {

  }
}
