package com.mladen.cikara.mutation.testing;

public class Palindrome {
  public boolean isPalindrome(String inputString) {
    if (inputString.length() == 0) {
      return true;
    } else {
      final char firstChar = inputString.charAt(0);
      final char lastChar = inputString.charAt(inputString.length() - 1);
      final String mid = inputString.substring(1, inputString.length() - 1);

      return (firstChar == lastChar) && isPalindrome(mid);
    }
  }
}
