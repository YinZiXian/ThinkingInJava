package ch10;

/**
 * @author YZX
 * @date 2020��8��22��
 * @time ����5:48:40
 */

public class DoThis {
	private void f() {
		System.out.println("DoThis's f()");
	}
	class Inner{
		Inner(){
			DoThis.this.f();
		}
	}
	Inner getInner() {
		return new Inner();
	}
	public  static void main(String[] args) {
		DoThis doThis = new DoThis();
		DoThis.Inner inner1 = new DoThis().new Inner();
		DoThis.Inner inner2 = doThis.getInner();
	}
}
