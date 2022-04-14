package com.logical.duplicate1;

public class B {
public static void main(String[] args) {
	String s1="AmitkumarSrivastav";
	for(int i=0;i<s1.length();i++) {
		for(int j=i+1;j<s1.length();j++) {
			if(s1.charAt(i)==s1.charAt(j)) {
			 System.out.println("duplicate char:"+s1.charAt(i));
		}
	}
	}
}
}
