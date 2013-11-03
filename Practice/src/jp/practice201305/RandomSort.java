package jp.practice201305;

import java.util.*;
public class RandomSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<Integer> lst = new ArrayList<Integer>();

		while (lst.size() < 100) {
			Double rnd= Math.random() * 1000;
			Integer rndInteger = rnd.intValue();
			if (lst.indexOf(rndInteger) < 0)
			{
				lst.add(rndInteger);
			}
		}

		Collections.sort(lst);

		System.out.println(lst);

	}

}
