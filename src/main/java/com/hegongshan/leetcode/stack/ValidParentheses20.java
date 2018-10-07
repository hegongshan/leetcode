package com.hegongshan.leetcode.stack;

import java.util.Stack;

/**
 * 20.有效的括号
 * @author hegongshan https://www.hegongshan.com
 *
 */
public class ValidParentheses20 {

	public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<s.length();i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c== '[') {
                stack.push(c);
            } else if (c == ')') {
            	if(stack.isEmpty()) {
            		return false;
            	}
            	if(stack.peek() != '(') {
                    return false;
                } 
                stack.pop();
            } else if (c == '}') {
            	if(stack.isEmpty()) {
            		return false;
            	}
            	if(stack.peek() != '{') {
                    return false;
                } 
                stack.pop();
            } else if(c == ']') {
            	if(stack.isEmpty()) {
            		return false;
            	}
                if(stack.peek() != '[') {
                    return false;
                } 
                stack.pop();
            } 
        }
        if(stack.isEmpty()) {
        	return true;
        } 
        return false;
    }
}
