package com.java;

class A
{
    void method1()
    {
        System.out.println("In method 1 of Class A");
    }
}
class B extends A
{
    void method1()
    {	
        System.out.println("In method 1 of Class B");
    }
    void method2()
    {
        System.out.println("In method 2 of Class B");
    }
}

public class FibonacciSeries {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////		0,1,1,2,3,5,8,13,21,34
//		
//		int a =0;
//		int b =1;
//		
//		System.out.println(a);
//		System.out.println(b);
//		
//		int count =2;
//		while(count <10) {
//			int temp = a;
//			a=b;
//			b=b+temp;
//			System.out.println(b);
//			count++;
//			
//		}
//	}

	
	 public static void main(String[] args) {
	        B a= new B();
	        a.method2();
	    }
}
