package com.java.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		// pq.remove();
		// System.out.println(pq.poll());
		// System.out.println(pq.peek());

		pq.add(13);
		pq.add(11);
		pq.add(12);
		pq.add(21);
		pq.add(17);

		System.out.println(pq);

		Integer val=null;

		while ((val = pq.poll()) != null) {
			System.out.println(val);
		}
		
		System.out.println(pq);

		/*
		 * Iterator itr = pq.iterator();
		 * 
		 * while (itr.hasNext()) { System.out.println(itr.next()); }
		 */
		// pq.removeAll(pq);
		// pq.clear();
		// System.out.println(pq);

		PriorityQueue<String> pq1 = new PriorityQueue<String>();
		pq1.add("Red");
		pq1.add("Green");
		pq1.add("Black");
		pq1.add("White");

		// System.out.println(pq1);

		String[] strArr = new String[pq1.size()];

		pq1.toArray(strArr);

		for (String strArr1 : strArr) {
			// System.out.println(strArr1);
		}

		// System.out.println(pq1.peek());

		// pq1.offer("Blue");
		// System.out.println(pq1);

		PriorityQueue<String> pq2 = new PriorityQueue<String>();
		pq2.add("Red");
		pq2.add("Green");
		pq2.add("Black");
		pq2.add("White");

		// System.out.println(pq2);

		for (String str : pq1) {
			// System.out.println(pq2.contains(str)? "YES":"NO");
		}

		/*
		 * System.out.println(pq); System.out.println(pq.remove());
		 * System.out.println(pq); System.out.print("\n"); System.out.println("===");
		 */

		/*
		 * while (pq.isEmpty() == false) { System.out.print(pq.remove() + " ");
		 * 
		 * } System.out.println("\n");
		 */

	}

}