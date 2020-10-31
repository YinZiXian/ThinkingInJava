package ch10;

/**
 * @author YZX
 * @date 2020��5��21��
 * @time ����8:04:28
 */

public class Ex1 {
	public static void main(String[] args) {
		Outer out = new Outer();
		Outer.Inner inner = out.getInner(0);
		System.out.println(inner.getId());
		Outer.Inner in = new Outer().new Inner(1);
		System.out.println(in.getId());
	}
}

class Outer {
	class Inner {
		private int id;
		public Inner(int id) {
			this.id = id;
		}
		public int getId() {
			return id;
		}
		//.this����ⲿclass����
		public Outer getOuter() {
			return Outer.this;
		}
	}
	public Inner getInner(int id) {
		return new Inner(id);
	}

}