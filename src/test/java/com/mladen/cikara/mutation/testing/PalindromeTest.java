package com.mladen.cikara.mutation.testing;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromeTest {

  @Test
  public void whenPalindrom_thenAccept() {
    final Palindrome palindromeTester = new Palindrome();

    assertTrue(palindromeTester.isPalindrome("noon"));
  }

}
