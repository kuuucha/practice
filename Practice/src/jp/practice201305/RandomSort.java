package jp.practice201305;

import java.util.*;
public class RandomSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<Integer> lst = new ArrayList<Integer>();

		while (lst.size() < 100) {
			double rnd1= Math.random() * 1000;
			if (lst.indexOf(rnd1) < 0)
			{
				int rnd2 = (int)rnd1;
				Integer rnd = rnd2;
				lst.add(rnd);
			}
		}

		Collections.sort(lst);

		System.out.println(lst);

	}

}
