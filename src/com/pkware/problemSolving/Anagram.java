package com.pkware.problemSolving;
import java.util.*;
public class Anagram {
	
	 static boolean isAnagram(String a, String b) {
	        if(a.length()!=b.length()) return false;
	        char arr[]=a.toLowerCase().toCharArray();
	        char brr[]=b.toLowerCase().toCharArray();
	        
	        java.util.Arrays.sort(arr);
	        java.util.Arrays.sort(brr);
	        for(int i=0;i<a.length();i++){
	            if(arr[i]!=brr[i]){
	                return false;
	            }
	        }
	        return true;
	    }
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}
}
