package com.kamesh.KameshPractice;

import java.util.Stack;

public class StringParanthesis {

	public static void main(String[] args) {

		char exp[] = {'{','(',')','}','[',']'}; 
		if (isParanthesis(exp)) {
				System.out.println("Balanced");
		}else {
			System.out.println("Not Balanced");
		}
		
	}
		static boolean isParanthesis(char exp[]) {
			Stack s = new Stack();
			
			for (int i=0;i< exp.length ; i++) {
				if (exp[i] == '{' || exp[i] =='(' || exp[i] =='[') {
					s.push(exp[i]);
				}
				else if ((exp[i] == '}' || exp[i] ==')' || exp[i] ==']')) {
					
					if (s.isEmpty()) {
						return false;
					} 
					char c = (Character) s.pop();
					if (c == '['  && exp[i] == ']') {
						return true;
					}
					else if (c == '{'  && exp[i] == '}') {
						return true;
					}
					else if (c =='('  && exp[i] == ')') {
						return true;
					}
					else {
						return false;
					}
					
						
					
				}
				else {
					return false;
				}
			
			}
			if (s.isEmpty()) {
				return true;
			} else {return false;}
			
		}
}
