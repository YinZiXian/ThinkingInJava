package ch13;

/**
 * @author YZX
 * @date 2020��5��24��
 * @time ����7:20:37
 */

public class Ex2 {
	public static void main(String[] args) {
		System.out.println(new InfiniteRecusion());
		String s = "hello world!";
		System.out.println(s);
		System.out.println(s.contains("hello wa"));
		System.out.println(s.indexOf(101));
		System.out.println(s.indexOf("e"));
		System.out.println(s.lastIndexOf("ell"));
		String begin = s.substring(0,6);
		System.out.println(begin);
		String end = s.substring(6);
		System.out.println(end);
		System.out.println(begin.concat(end));
		System.out.println(s.replace('o', 'a'));
		System.out.println(s.replace("hello", "nihao"));
	//���ȼ���ַ��������Ƿ��С�ab������ַ�������������򷵻�����ַ��������ã�
	//����ͽ�����ַ�����ӵ��ַ������У�Ȼ�᷵������ַ��������á�
	//err�� out������err��eclipse����Ǻ�ɫ��out���л��壬errû�У��������ã�
		System.err.println(s.intern());	
		
	}
}

class InfiniteRecusion{
	@Override
	public String toString() {
		return "InfiniteRecusion address:" + super.toString()+ "\n";
	}
}