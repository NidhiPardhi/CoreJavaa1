package com.rays.basics;

public class SumG100 {
	
	public static void main(String[] args) {
		
		int i;
		
		int sum=0;
		
		for(i=100;i<200;i++) {
			
			if(i%7==0) {
				
			System.out.println(i);
			
		    sum=sum+i;
		 
			}
			
	
	}
		System.out.println("Int are "+sum);

		
	}
}