package array1_lesson1_13;

public class Practice1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		int型の配列aを作成してください。
		配列aに1～5の数字を格納してください。
		繰り返し処理を使用し、
		配列aの数字を順番に表示させてください。

		出力結果：1
				  2
				  3
				  4
				  5
	*/
//		int型の配列aを作成
		int[] a = {1,2,3,4,5};
//		lengthを使い配列の個数を取得。ループ文を使い個数分コンソールに出力
		for (int i =0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
