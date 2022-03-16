package com.second;
import java.util.Scanner;

public class Sum_Of_Numbers {

  public static void main(String[] args) {
    
    Scanner scan  = new Scanner(System.in);
    System.out.print("Enter 2 Numbers : ");
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    int temp,count = 0;
    int num3 = num1 + num2 ;
    System.out.print(num1 + " " + num2);
    while(count < 13) {
    num3 = num1 + num2;
    num1= num2;
    num2 =num3;
    count++;
    System.out.print(num3 + " ");
    }
  }

}