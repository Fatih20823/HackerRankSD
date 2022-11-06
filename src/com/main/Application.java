package com.main;

import java.util.ArrayList;
import java.util.Arrays;

public class Application {

	public static void main(String[] args) {
		ArrayList<Integer> s = new ArrayList<>(Arrays.asList(1,2,4,3,1,1,2,3));
		int d=4;
		int m=3;
		int result = 0;
		int sum;
			for (int i = 0; i < s.size()-m+1; i++) {
				sum=0;
				for(int j = 0; j < m; j++) {
					sum += s.get(i+j);
				}
				if(sum==d) {
					result++;
				}
			}
			System.out.println("result: "+result);
	}

}
