package com.first;

import java.util.*;

import rectangle.Rectangle;
public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
      for(int i=1;i<=5;i++) {
    	  System.out.println("Enter length and breadth of rectangle");
    	  int len=sc.nextInt();
    	  int bre=sc.nextInt();
		rectangle obj = new rectangle(len,bre);
		obj.displayAreaOfTestRectangle();
      }
	}

}
