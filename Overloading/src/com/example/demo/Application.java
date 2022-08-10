package com.example.demo;
import java.util.*;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
     	//System.out.println("Enter Name");
		//String name=sc.next();
		//System.out.println("Enter the Farenheit Temp");
		//double farenTemp=sc.nextDouble();
		Converter converter=new Converter();
		//System.out.println(converter.convert(name));
		//System.out.println("Celsius Temp:"+converter.convert(farenTemp));
		System.out.println("Enter the Amount");
		double amount=sc.nextDouble();
		System.out.println("Enter the Current to Convert 1-USD 2-EURO");
		int frm=sc.nextInt();
		System.out.println(converter.convert(amount,frm));
		sc.close();

	}

}
