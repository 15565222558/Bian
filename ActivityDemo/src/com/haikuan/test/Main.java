package com.haikuan.test;

import java.io.File;
import java.util.Scanner;

public class Main {
	public int indexA = 0;
	public int indexB = 0;
	public int indexC = 0;
	public static int m; // �·���

	public static void main(String[] args) {
		// ��һ���ļ�·��
		File file = new File("E:/22222222222");
		initErgodic(file);
		Main main = new Main();
		main.getNum();
		main.num();
		int ok = 0;
		for (long i = 10000; i < 100000; i++)
			if (ishuiwen(i) == 1) {
				ok++;
				System.out.println("������:" + i);
			}
		System.out.println(ok + "����ͬ�Ļ�����");

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in); // �ӿ���̨������Ҫ�鿴���·�
		System.out.println("����������Ҫ�鿴������:");// ������ʾ
		m = in.nextInt();// ����������·ݸ�ֵ��m
		fun(m);
	}

	/**
	 * ������һ���ļ����µ������ļ�����չʾ���㼶��ϵ���ļ���������ʾ�������һ����ʽд���ı��� Ҫ�󣺾����ܼ򵥡��߼�����
	 * ��ѡ�洢��ʽ�ṹҲ�ܿ����㼶��ϵ�����ɶ�д��ֱ��ʹ��
	 */
	private static void initErgodic(File file) {
		// �г��ļ��б�
		File[] files1 = file.listFiles();
		// �ж� �ļ����Ƿ�Ϊ��
		if (files1 != null) {
			// ����
			for (File ff : files1) {
				// ���ļ��� ��������
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
	 * ����һ���ַ����ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ��ĸ�����
	 */

	public void getNum() {
		String str = "abcde fg HIGKLOK 12345 6";
		System.out.println("���Ͽո�ĳ���Ϊ:" + str.length());

		String[] split = str.trim().split(" ");
		for (int i = 0; i < split.length; i++) {
			System.out.println("��ȡ����:" + split[i]);
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
		System.out.println("Сд��ĸ�����ֳ���Ϊ:" + indexA);
		System.out.println("��д��ĸ�����ֳ���Ϊ:" + indexB);
		System.out.println("���ֳ���Ϊ:" + indexC);
		System.out.println("��ȡ�ո��ĳ���Ϊ:" + (indexA + indexB + indexC));

	}

	/**
	 * ��1,2,3,4�ĸ����֣�����ɶ��ٸ�������ͬ�����ظ����ֵ���λ�������Ƕ��٣�
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
					System.out.println("������ɶ��ٸ�������ͬ����=" + m);
					/**
					 * 123 132 213 231 312 321 124 142 214 241 412 421 134 143
					 * 314 341 413 431 234 243 324 342 423 432
					 */
				}
	}

	/**
	 * 5λ�����ҳ����У��ж����ǲ��ǻ���������12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ��
	 * 
	 * @param x
	 * @return
	 */
	public static int ishuiwen(long x) {
		int a, b, c, d, e;// 5������
		a = (int) (x / 10000);// �ȳ���1w�õ�֮ǰ����
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
	 * 쳲��������У�Fibonacci sequence�����ֳƻƽ�ָ�����.
	 *  쳲�������¬��˹����, ÿһ�����ǰ����֮��f(n) = f(n-1)+ f(n-2�� ....n>2
	 * ��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�С���ӳ����������º�ÿ��������һ�����ӣ��������Ӷ���������ÿ���µ���������Ϊ���٣�
	 */
	public static void fun(int tu) {
		long s1, s2;// ��������º��¸������ӵ�����
		int i = 1; // ����һ�����Ʊ���
		s1 = 1; // ��һ����Ϊ1��
		s2 = 1; // �ڶ�����Ϊ1��
		// whileѭ��
		while (true) {
			// ��һ���º͵ڶ��������ӵ�������Ϊ1��
			if (i == 1 || i == 2) {
				System.out.println(i + " ����: " + s1 + " ��");
				i++; // ���Ʊ��� i ��1
			}
			// i ����3����С��������Ҫ�鿴���·�
			else if (i < m) {
				s1 = s1 + s2;
				s2 = s1 + s2;
				System.out.println(i + " ����: " + s1 + " ��");
				i++;// �·ݼ�1
				System.out.println(i + " ����: " + s2 + " ��");
				i++; // ��ݼ�1
			} else {
				break;// �������������˳�
			}
		}
	}

}