package com.rays.basics;

import java.time.LocalDate;
import java.time.Period;

public class AgeOfBhumi {
	
	public static void main(String[] args) {
		
	
	LocalDate l= LocalDate.of(1995,10,02);
	LocalDate now = LocalDate.now();
	
	Period diff= Period.between(l, now);
	
	System.out.println("year = "+diff.getYears());
    System.out.println("month = "+diff.getMonths());
	System.out.println("Date = "+ diff.getDays());
	
	}
	
	
}
