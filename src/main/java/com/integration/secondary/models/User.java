package com.integration.secondary.models;

import com.integration.common.domain.Common;

import javax.persistence.Entity;

@Entity
public class User extends Common {

    private String userName;

    public User() {
    }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }
}
