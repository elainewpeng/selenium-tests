package com.itest.domain;

/**
 * @author Elaine Peng <elaine_peng@yahoo.com>
 */
public class User {
  private int id;
  private String firstName;
  private String lastName;

  public User(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
}
