package simple_calc_1;

import java.util.*;
import java.io.*;
import java.text.*;

public class test_calc {
	
	int mul(int num1, int num2){return num1*num2;};
	int div(int num1, int num2){return num1/num2;};
	int sub(int num1, int num2){return num1-num2;};
	int add(int num1, int num2){return num1+num2;};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int nm1,nm2;

	System.out.println("enter the number");
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	StringTokenizer stok = new StringTokenizer(str,"+",true);
	String temp = stok.nextToken();
	System.out.println(temp);
	temp = stok.nextToken();
	System.out.println(temp);
	temp = stok.nextToken();
	System.out.println(temp);
	System.out.println("=");
	}
}