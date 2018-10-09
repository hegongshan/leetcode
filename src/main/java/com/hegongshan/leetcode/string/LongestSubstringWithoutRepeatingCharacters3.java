package com.hegongshan.leetcode.string;

/**
 * 3.无重复字符的最长子串：给定一个字符串，找出不含有重复字符的最长子串的长度。
 * @author hegongshan https://www.hegongshan.com
 */
public class LongestSubstringWithoutRepeatingCharacters3 {
	public int lengthOfLongestSubstring(String s) {
		int maxLength = 0;
		int size = 1;
		String str = null;
        for (int i = 0; i < s.length(); i++) {
        	str = String.valueOf(s.charAt(i));
        	for (int j = i + 1; j < s.length(); j++) {
        		if(str.contains(String.valueOf(s.charAt(j)))) {
        			str = null;
        			break;
        		} else {
            		str += String.valueOf(s.charAt(j));
            		size++;
        		}
			}
        	if(size > maxLength) {
        		maxLength = size;
        	}
        	//进入下一次循环前，设置size为1
    		size = 1;
		}
		return maxLength;
    }
}
