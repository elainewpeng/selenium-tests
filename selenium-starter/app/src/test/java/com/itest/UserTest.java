package com.itest;

import static org.junit.Assert.assertSame;

import org.junit.Test;

import com.itest.domain.User;

public class UserTest {

  @Test
  public void testNewUser() {
    User user = new User(1);
    assertSame(user.getId(), 1);
  }

}