import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Iterator;

import javax.imageio.stream.FileImageInputStream;

public class Main {
	public static String name = "lihaikuan";
	public int kk = 100;
	public final int qq = 66;

	public static void main(String[] args) {
		// 定义数组
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 18 };
		hai();// 静态的 可以直接调用
		// 非静态的 以及被final的 不能直接调用,需要引用类名.
		Main ma = new Main();
		ma.hai2();
		ma.f();
		ma.outPut();// 输出
		ma.scanning();// 读取
		System.out.println("执行二分查找数字的索引为:"
				+ recursive(array, 0, array.length - 1, 18));
		;// 从0开始 到结束,查9
		
		//定义被递归的文件路径
		File fi=new File("E:/22222222222");
		//调用递归方法
		ma.file(fi);
	}

	static {
		Main.name = "值改变了...";
		System.out.println(Main.name);
	}

	public static void hai() {
		System.out.println("这是静态方法----");
	}

	public void hai2() {
		System.out.println("非静态方法-----");
	}

	public final void f() {
		System.out.println("这是被final了的语句");
	}

	// 输入文件内容
	public void outPut() {
		File file = new File("E:/aaaaaa.txt");
		String name = "嗨!好久不见,IO流";
		try {
			OutputStream os = new FileOutputStream(file);
			// 把流 转换成 字节数组 没有文件会自动创建
			os.write(name.getBytes());
			System.out.println("向文件中输入的流:" + os);
			// 关闭资源
			os.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// 扫描 读取文件
	public void scanning() {
		File file = new File("E:/aaaaaa.txt");
		try {
			// 创建文件
			// file.createNewFile();
			FileImageInputStream inputStream = new FileImageInputStream(file);
			int leng = 0;
			// 定义字节
			byte[] b = new byte[1024];
			while ((leng = inputStream.read(b)) != -1) {
				String st = new String(b, 0, leng);
				System.out.println(st);
			}
			// 关闭资源
			inputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 递归二分法
	public static int recursive(int[] array, int start, int end, int findvalue) {
		// 如果数组为空, 直接返回-1
		if (array == null) {
			return -1;
		}
		if (start <= end) {
			// middle 中间部分 = (开始值+结束值)/2
			int middle = (start + end) / 2;
			// 中间的值
			int middleValue = array[middle];
			// 判断 当与你要查找的值相匹配时
			if (middleValue == findvalue) {
				// 返回中间部分的值
				return middle;
			} else if (findvalue < middleValue) {// 当 要查找的值 小于中间的值 就在中间值的前面找
				return recursive(array, start, middle - 1, findvalue);
			} else {
				// 否则 要查找的值就是大于中间的值
				return recursive(array, middle + 1, end, findvalue);
			}
		}
		return -1;
	}

	// 递归查找文件
	public void file(File f) {
		// 判断 变历 文件夹 且 文件的长度==0时 直接输出
		if (f.isFile() || f.listFiles().length == 0) {
			System.out.println(f);

		} else {
			// 否则 就是文件夹不为null   继续 进入遍历
			File[] listFiles = f.listFiles();
			// 遍历所有不为空的 文件夹中的内容
			for (File file : listFiles) {
				file(file);
			}
			System.out.println(f);

		}
	}
	

}
