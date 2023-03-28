package date_type_change_lesson1_7;

public class DateTypeChange {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		問１）
//		以下のプログラムを作成してください。
//		①int型変数 i に 3 を代入する。
		int i = 3;
//		②double型変数 d に i を代入する。
		double d = i;
//		③変数 i と変数 d の値をそれぞれコンソールに表示する。
		System.out.println(i);
		System.out.println(d);

//		問２）
//		以下のプログラムを作成してください。
//		①double型変数 pi に数値「3.14」を代入して下さい。
		double pi = 3.14;
//		②変数 pi に「3」を掛けた値をコンソールに出力して下さい。
		pi *= 3;
		System.out.println(pi);
//		④int型の変数 integer を宣言し、変数 pi を int型に型変換しコンソールに出力して下さい。
		int integer = (int) pi;
		System.out.println(integer);
		
//		問３）
//		①double型の変数を定義し、「2 + 6.0」を代入して下さい。
		double x = 2 + 6.0;
//		　double型の変数をコンソールに出力して下さい。
		System.out.println(x);
//		②int型の変数を定義し、double型の変数をint型に型変換して代入下さい。
		int y = (int) x;
//		　int型の変数をコンソールに出力して下さい。
		System.out.println(y);
//		③String型の変数を定義し、int型の変数をString型に型変換して代入して下さい。
		String a = String.valueOf(y);
//		　String型の変数をコンソールに出力して下さい。
		System.out.println(y);
//		④「②」で定義したint型変数に、String型の変数をint型に型変換して代入して下さい。
		y = Integer.parseInt(a);
//		　int型の変数をコンソールに出力して下さい。
		System.out.println(y);

	}
}

