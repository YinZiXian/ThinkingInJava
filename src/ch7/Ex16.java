package ch7;

/**
 * @author YZX
 * @date 2020��5��20��
 * @time ����8:53:08
 */

public class Ex16 {
	public static void main(String[] args) {
		Amphibian amp = new Frog();
		amp.a();
		amp.b();
	}
}
class Amphibian {
	public void a() {
		System.out.println("A:a");
	}
	public void b() {
		System.out.println("A:b");
	}
}
class Frog extends Amphibian{
//	@Override
//	public void a() {
//		// TODO Auto-generated method stub
//		System.out.println("F:a");
//	}
//	@Override
//	public void b() {
//		// TODO Auto-generated method stub
//		System.out.println("F:b");
//	}
}