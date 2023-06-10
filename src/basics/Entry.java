package basics;

import java.util.Scanner;

public class Entry {

	public Double acceptDouble() {
		Double number = null;
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			number = scanner.nextDouble();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
		return number;
	}

	public String acceptString() {
		String value = null;
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			value = scanner.next();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
		return value;
	}

}
