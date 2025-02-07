package org.example;

import java.util.*;

public class JavaCoreKnowledgeTest {

	public static void test1() {
		boolean b = (!(true) && !(false));
		System.out.println(b);
	}

	public static void test2() {
		System.out.println(1 + 2 + "3");
	}

	public static void test3() {
		var set = new HashSet<Integer>();
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			set.add(random.nextInt(10));
		}
		System.out.println(set.size());
	}

	public static void test4() {
		int a = 10;
		change(a);
		print(a);
	}

	public static void change(int a) {
		a = 20;
	}

	public static void print(int a) {
		System.out.println(a);
	}

	public static void test5() {
		List<Object> list = new ArrayList<>();
		while (true) {
			list.add(new Object());
		}
	}

	public static void test6() {
		int[] nums = new int[10];
		for (int i = 1; i <= 10; i++) {
			nums[i] *= 2;
		}
		System.out.println(nums[0]);
	}

	public static void test7() {
		var map = new HashMap<MyKey, Integer>();
		MyKey key = new MyKey();
		map.put(new MyKey(), 1);
		map.put(new MyKey(), 2);
		map.put(new MyKey(), 3);
		map.put(null, 4);
		System.out.println("map = " + map);
	}

	public static void test8() {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);

		System.out.print(stack.pop());
		System.out.print(stack.pop());
		System.out.print(stack.pop());
	}

	public static void test9() {
		String text = null;
		System.out.println(text.length());
	}

	public static void test10() {
		int y = 2;
		switch (y) {
			case 1:
				System.out.println("p");
			case 2:
				System.out.println("c");
			case 3:
				System.out.println("l");
			default:
				System.out.println("I don't");
		}
	}

	public static class MyKey {
		@Override
		public String toString() {
			return "MyKey{}";
		}

		@Override
		public boolean equals(Object obj) {
			return false;
		}

		@Override
		public int hashCode() {
			return  1;
		}
	}

	public static void main(String[] args) {
//		test1();
		//false
//		test2();
		//33
//		test3();
		//1-10
//		test4();
		//10
//		test5();
		//Exception in thread "main" java.lang.OutOfMemoryError
//		test6();
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
//		test7();
		//map = {null=4, MyKey{}=1, MyKey{}=2, MyKey{}=3}
//		test8();
		//321
//		test9();
		//Exception in thread "main" java.lang.NullPointerException:
//		test10();
		//Все с cotton
//		25;
		// / by zero
		//SQL 19 - с 16 по 20
		//SQL 20 - 2nd

//		short d = Short.valueOf("12");
//		System.out.println(d);

//		String res = "";
//		for (int i = 0; i < 100; i++) {
//			for (int j = 0; j < 100; j++) {
//				res += ".";
//			}
//			if (i != 99) {
//				res += "\n";
//			}
//		}
//
//		System.out.println(res);
	}
}
