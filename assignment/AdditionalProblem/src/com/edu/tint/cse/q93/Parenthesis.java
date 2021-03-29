package com.edu.tint.cse.q93;

import java.util.ArrayDeque;
import java.util.Deque;

public class Parenthesis {
	Parenthesis(String expression) {
		int flag = 0;
		Deque<Character> arr = new ArrayDeque<Character>();// data structure to store stream left to right

		for (int i = 0; i < expression.length(); i++) {

			char inp = expression.charAt(i);// getting character one by one
			if (inp == '[' || inp == '(' || inp == '{' || inp == '<') {
				arr.push(inp);// if found element is the opening tags we push it into DS
			} else {// if they are closing tags
				if (arr.isEmpty()) {// if no element is inserted and we are getting a closing tag
					flag = 0;
					break;
				} else {// we pop up from stack on finding a closing tag and then check is pop element
						// and found element are of same type.
					char out = arr.pop();
					if (out == '[' && inp == ']') {
						flag = 1;
					} else if (out == '(' && inp == ')') {
						flag = 1;
					} else if (out == '{' && inp == '}') {
						flag = 1;
					} else if (out == '<' && inp == '>') {
						flag = 1;
					} else {
						flag = 0;
						break;
					}
				}
			}
		}
		if (flag == 1)
			System.out.println("OK");
		else
			System.out.println("Not Possible");
	}
}
