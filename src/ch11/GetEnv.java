package ch11;

import java.util.Map;

/**
 * @author YZX
 * @date 2020��5��23��
 * @time ����9:02:07
 */

public class GetEnv {
	public static void main(String[] args) {
		for(Map.Entry entry:System.getenv().entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
