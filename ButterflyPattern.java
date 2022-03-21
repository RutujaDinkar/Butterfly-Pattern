package com.java;
import java.util.*;
  import java.util.Scanner;
public class ButterflyPattern {

  public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

       int n= sc.nextInt();
  //upper part     
  //outer loop(for no. of rows)
  for( int i=1; i<=n;i++){
  //first part
  for (int j=1; j<=i; j++){
  System.out.print("*");
    
  }
  
  
  //(for spaces)
  int spaces=2*(n-i);
  
  for(int j=1; j<=spaces; j++){
    System.out.print(" ");
  }
  //sec part for *
  for(int j=1;j<=i;j++){
    System.out.print("*");
  }
  System.out.println();
}

//lowerr part     
  //outer loop(for no. of rows)
  for( int i=n; i>=1;i--){
  //first part
  for (int j=1; j<=i; j++){
  System.out.print("*");
    
  }
  
  
  //(for spaces)
  int spaces=2*(n-i);
  
  for(int j=1; j<=spaces; j++){
    System.out.print(" ");
  }
  //sec part for *
  for(int j=1;j<=i;j++){
    System.out.print("*");
  }
  System.out.println();
}

  }

}
