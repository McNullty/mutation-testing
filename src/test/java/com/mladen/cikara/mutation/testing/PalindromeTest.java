package com.mladen.cikara.mutation.testing;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PalindromeTest {

  @Test
  public void whenNearPalindrom_thanReject() {
    final Palindrome palindromeTester = new Palindrome();

    assertFalse(palindromeTester.isPalindrome("neon"));
  }

  @Test
  public void whenNotPalindrom_thanReject() {
    final Palindrome palindromeTester = new Palindrome();

    assertFalse(palindromeTester.isPalindrome("box"));
  }

  @Test
  public void whenPalindrom_thenAccept() {
    final Palindrome palindromeTester = new Palindrome();

    assertTrue(palindromeTester.isPalindrome("noon"));
  }
}
