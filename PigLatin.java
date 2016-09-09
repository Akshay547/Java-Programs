package com.javaprog;

import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
//		Reading input
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().toLowerCase();
		sc.close();
		StringBuilder result = new StringBuilder();
		for(String s : input.split(" ")){
			result = result.append(convert(s) + " ") ;
		}
		String output = result.toString().trim();
		System.out.println(output);
	}
//		Converting English word to Pig Latin
	private static String convert(String s) {
//		Logic for identifying Vowels, "yt" and "xr" 
		if(isVowel(s.charAt(0)) || s.substring(0, 2).equals("yt") || s.substring(0, 2).equals("xr") ){
			return s + "ay";
		}else{
//		Logic for identifying Consonants
			for(int i = 1 ; i <= s.length() ; i++){
				if(isVowel(s.charAt(i))){
//		Check for "qu" scenario
					if(s.charAt(i) != 'u'){
						return s.substring(i)+ s.substring(0,i) + "ay";
					}else{
						if ( s.charAt(i-1) == 'q'){
							return s.substring(i+1)+ s.substring(0,i+1) + "ay";
						}else{
							return s.substring(i)+ s.substring(0,i) + "ay";
						}
					}
				}	
			}
		}
		return s;
	}
//		Vowel Logic for a Single character
	private static boolean isVowel(char c) {
		if( c=='a' 
				|| c == 'e' 
				|| c=='i' 
				|| c == 'o' 
				|| c == 'u' ) {
			return true;
		}
		return false;
	}
}
