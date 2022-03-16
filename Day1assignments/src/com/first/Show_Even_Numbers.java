package com.first;

import java.util.Scanner;

public class Show_Even_Numbers {

  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter a number : ");
    int i;
    int num = scan.nextInt();
    
    for(i=0; i<=num; i++) 
    {
      
      if(i%2 == 0) {
        System.out.print(i + "\t");
      }
    }

  }

}