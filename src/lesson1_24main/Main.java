package lesson1_24main;

import java.util.Scanner;

import lesson1_24sub.Bean;
import lesson1_24sub.Sub;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Sub sub = new Sub();
		Bean bean = new Bean();
		Scanner sc = new Scanner(System.in);
		String sc1 = sc.nextLine();
		sub.input(sc1);
		sub.display();
	}

}
