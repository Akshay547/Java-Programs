package com.javaprog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pangram {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string to check if its a Pangram: ");
		String Input = sc.nextLine();
		sc.close();
		if(isPangram(Input)){
			System.out.println(Input + " is Pangram");
		}else
			System.out.println(Input + " is not Pangram");
		}
	public static boolean isPangram(String s){
		StringBuilder sb= new StringBuilder(s.toLowerCase());
		List<Integer> atozascii = new ArrayList<Integer>();
		int j;
		for(int i= 0; i<sb.length();i++){
			j = (int)sb.charAt(i);
			if(j>96 && j<123){
				if(!atozascii.contains(j)){
				atozascii.add(j);}
				}
		}
			return (atozascii.size()==26);
	}
}