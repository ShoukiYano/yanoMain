package basicClass_lesson_19;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog myDog = new Dog(null);
		System.out.println(myDog.name);
				// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
				Dog numDog = new Dog(5);
				System.out.println(numDog.nums + "匹");
				// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
				LocalDateTime nowDate = LocalDateTime.now();
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
				String formatNowDate = dtf.format(nowDate);
				System.out.println(formatNowDate);
			}
		}