package com.아나그램;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public char solution(int n, String str) {
		char answer=' ';
		HashMap<Character, Integer> map = new HashMap<>();
		for (char x : str.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		int max = Integer.MIN_VALUE;
		for (char key : map.keySet()) {
			if(map.get(key)>max) {
				max=map.get(key);
				answer=key;
			}
		}
		return answer;
		
		
	}

	public static void main(String[] args) {
		Main t = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String str =kb.next();
		System.out.println(t.solution(n,str));
		kb.close();
	}
}
