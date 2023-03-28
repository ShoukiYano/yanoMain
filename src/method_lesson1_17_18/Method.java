package method_lesson1_17_18;

import java.util.Random;

public class Method {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Q1：コンソールに「Hello Java」とコンソールに出力するメソッド（関数）を作成してください。
		Hello();
		// Q2：引数として整数を渡すと+1して返すメソッド（関数）を作成してください。
		setNum(5);
		// Q3：引数として整数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を作成してください。
		setNum1(5, 5);
		// Q4：引数として小数を2つ渡すと、その引数2つを乗算した値を返すメソッド（関数）を作成してください。
		//     ※ただしメソッド名はQ3のメソッド名と同じにしてください。
		setNum1(2.5, 0.75);
		// Q5：引数として数字を渡すと、1～100までのランダムな数字を引数の値分格納して返すメソッド（関数）を作成してください。
		int[] num5 = setNum2(5);
		for (int i : num5) {
			System.out.println(i);
		}
		// Q6：Q5で作成した関数を用いて、このメソッド（関数）の引数をQ5のメソッド（関数）の引数に渡して
		//     配列の要素の平均値を返すメソッド（関数）を作成してください。

		// Q5で使用した配列の要素の平均値を取得する
		double avg = getAverage(num5);
		// 平均値をコンソールに出力する
		System.out.println("平均値：" + avg);
	}

	//	Q1.関数を定義
	public static void Hello() {
		System.out.println("Hello Java");
	}

	//	Q2.関数を定義
	public static void setNum(int a) {
		System.out.println(++a);
	}

	//	Q3.関数を定義
	public static void setNum1(int b, int c) {
		System.out.println(b * c);
	}

	//	Q4.関数を定義
	public static void setNum1(double b, double c) {
		System.out.println(b * c);
	}

	//		Q5.関数を定義
	public static int[] setNum2(int d) {
		//		numsをインスタンス化
		int[] nums = new int[d];
		//		ranをインスタンス化
		Random ran = new Random();
		/*
		 * ループ文にてint dで返された値を
		 * nums.lengthで個数を指定しランダムで配列に格納
		 */
		for (int i = 0; i < nums.length; i++) {
			nums[i] = ran.nextInt(101);
		}
		//		最後に格納した値numsを返す
		return nums;
	}

	// 配列の要素の平均値を返すメソッド
	public static double getAverage(int[] nums) {
		//    	整数sumを0に初期化
		int sum = 0;
		//        ループ文でQ5で使用した配列個数をそのまま流用
		//        繰り返すごとに整数sumに足していく
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		//        最終double avg　doubleに型変換したsumと個数指定した配列で割った値を返す
		double avg = (double) sum / nums.length;
		return avg;
	}
}
