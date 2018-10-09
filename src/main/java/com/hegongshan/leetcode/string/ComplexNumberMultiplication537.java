package com.hegongshan.leetcode.string;

/**
 * 537.复数乘法
 * @author hegongshan https://www.hegongshan.com
 *
 */
public class ComplexNumberMultiplication537 {
	public static String complexNumberMultiply(String a, String b) {
		String[] numbers = a.split("\\+");
		String[] numbers2 = b.split("\\+");
		//number为复数的实部，cnumber为复数的虚部
		int number = Integer.parseInt(numbers[0]);
		int cnumber = Integer.parseInt(numbers[1].substring(0, numbers[1].length()-1));
		
		int number2 = Integer.parseInt(numbers2[0]);
		int cnumber2 = Integer.parseInt(numbers2[1].substring(0, numbers2[1].length()-1)); 
		
		int result = number * number2 + cnumber * cnumber2 * -1;
		int cResult = cnumber * number2 + cnumber2 * number;
		
		String resultStr = String.valueOf(result) + "+" + String.valueOf(cResult) + "i";
		return resultStr;
    }
}
