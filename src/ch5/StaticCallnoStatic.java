package ch5;

/**
 * @author YZX
 * @date 2020��8��19��
 * @time ����9:35:58
 */

public class StaticCallnoStatic {
	private int a = 10;
	public int geta() {
		return a;
	}
	public static int staticGet(StaticCallnoStatic s) {
		return s.geta();
	}
	public static void main(String[] args) {
		System.out.println(staticGet(new StaticCallnoStatic()));
	}
}