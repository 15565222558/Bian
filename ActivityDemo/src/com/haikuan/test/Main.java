package com.haikuan.test;

import java.io.File;
import java.util.Scanner;

public class Main {
	public int indexA = 0;
	public int indexB = 0;
	public int indexC = 0;
	public static int m; // 月份数

	public static void main(String[] args) {
		// 给一个文件路径
		File file = new File("E:/22222222222");
		initErgodic(file);
		Main main = new Main();
		main.getNum();
		main.num();
		int ok = 0;
		for (long i = 10000; i < 100000; i++)
			if (ishuiwen(i) == 1) {
				ok++;
				System.out.println("回文数:" + i);
			}
		System.out.println(ok + "个相同的回文数");

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in); // 从控制台输入想要查看的月份
		System.out.println("请输入你想要查看的月数:");// 输入提示
		m = in.nextInt();// 输入的整数月份赋值给m
		fun(m);
	}

	/**
	 * 遍历出一个文件夹下的所有文件，并展示出层级关系，文件夹优先显示，最后以一定格式写入文本中 要求：尽可能简单、逻辑清晰
	 * 所选存储格式结构也能看出层级关系，并可读写后直接使用
	 */
	private static void initErgodic(File file) {
		// 列出文件列表
		File[] files1 = file.listFiles();
		// 判断 文件夹是否为空
		if (files1 != null) {
			// 遍历
			for (File ff : files1) {
				// 有文件夹 继续遍历
				if (ff.isDirectory()) {
					initErgodic(ff);
				} else {
					System.out.println(ff);
				}
			}
		}
		System.out.println(file);
	}

	/**
	 * 输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
	 */

	public void getNum() {
		String str = "abcde fg HIGKLOK 12345 6";
		System.out.println("算上空格的长度为:" + str.length());

		String[] split = str.trim().split(" ");
		for (int i = 0; i < split.length; i++) {
			System.out.println("截取的数:" + split[i]);
		}
		for (int i = 0; i < str.length(); i++) {
			char at = str.charAt(i);
			if (at >= 'a' && at <= 'z') {
				indexA++;
			} else if (at >= 'A' && at <= 'Z') {
				indexB++;
			} else if (at >= '0' && at <= '9') {
				indexC++;
			}

		}
		System.out.println("小写字母的数字长度为:" + indexA);
		System.out.println("大写字母的数字长度为:" + indexB);
		System.out.println("数字长度为:" + indexC);
		System.out.println("截取空格后的长度为:" + (indexA + indexB + indexC));

	}

	/**
	 * 有1,2,3,4四个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
	 */
	public void num() {
		int m = 0;
		for (int i = 1; i < 5; i++)
			for (int j = 1; j < 5; j++)
				for (int k = 1; k < 5; k++) {
					if (i != j && j != k && k != i) {
						System.out.println(i + "," + j + "," + k + "---");
						// System.out.println("\n" + i*100 + "," + j*10 + "," +
						// k);
						m++;
					}
					System.out.println("可以组成多少个互不相同的数=" + m);
					/**
					 * 123 132 213 231 312 321 124 142 214 241 412 421 134 143
					 * 314 341 413 431 234 243 324 342 423 432
					 */
				}
	}

	/**
	 * 5位数中找出所有，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
	 * 
	 * @param x
	 * @return
	 */
	public static int ishuiwen(long x) {
		int a, b, c, d, e;// 5个变量
		a = (int) (x / 10000);// 先除以1w得到之前的数
		b = (int) ((x / 1000) % 10);
		c = (int) ((x / 100) % 10);
		d = (int) ((x / 10) % 10);
		e = (int) (x % 10);
		if ((a == e) && (b == d))
			return 1;
		else
			return 0;
	}

	/**
	 * 斐波那契数列（Fibonacci sequence），又称黄金分割数列.
	 *  斐波那契—卢卡斯数列, 每一项都等于前两项之和f(n) = f(n-1)+ f(n-2） ....n>2
	 * 有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
	 */
	public static void fun(int tu) {
		long s1, s2;// 定义这个月和下个月兔子的数量
		int i = 1; // 定义一个控制变量
		s1 = 1; // 第一个月为1对
		s2 = 1; // 第二个月为1对
		// while循环
		while (true) {
			// 第一个月和第二个月兔子的数量都为1对
			if (i == 1 || i == 2) {
				System.out.println(i + " 个月: " + s1 + " 对");
				i++; // 控制变量 i 加1
			}
			// i 大于3并且小于我们需要查看的月份
			else if (i < m) {
				s1 = s1 + s2;
				s2 = s1 + s2;
				System.out.println(i + " 个月: " + s1 + " 对");
				i++;// 月份加1
				System.out.println(i + " 个月: " + s2 + " 对");
				i++; // 朋份加1
			} else {
				break;// 不符合条件就退出
			}
		}
	}

}