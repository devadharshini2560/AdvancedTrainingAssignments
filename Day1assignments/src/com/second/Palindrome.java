package com.second;

import java.util.Scanner;

public class Palindrome {

  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a string");
    String str = scan.nextLine();
    
    int len = str.length();
    
    System.out.println("Length of the String : " + len);
    
    System.out.println("String Uppercase : " + str.toUpperCase());
    
    String rev = "";
    for(int i=len-1;i>=0;i--) {
      rev = rev + str.charAt(i);
    }

    System.out.println("Palindrome : " + rev);
    
    if(rev.equals(str)) {
      System.out.println("Entered string is palindrome");
    }
    else
      System.out.println("Not Palindrome");
  }

}