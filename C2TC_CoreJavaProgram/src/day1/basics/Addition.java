package day1.basics;

import java.util.Scanner;

public class Addition {
public static void main (String[] args) { 
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the values : ");
a=sc.nextInt();
b=sc.nextInt();
c=a+b;
System.out.println("Addition of a="+a+"and b="+b+"is "+c);
}
}
