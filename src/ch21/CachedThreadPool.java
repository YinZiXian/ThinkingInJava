package ch21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author YZX
 * @date 2020��8��16��
 * @time ����10:04:29
 */

public class CachedThreadPool {
	public static void main(String[] args) {
		LiftOff lf = new LiftOff();
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i = 0;i < 5;i++)
			exec.execute(lf);
		exec.shutdown();
	}
}
