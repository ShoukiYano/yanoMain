package array1_lesson1_13;

public class Practice2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		①配列aを作成し、1～5を格納してください。
		
		②参照型配列bを作成し、3を表示してください。
			出力結果：3
			
		③配列a[3]を10で上書きし表示してください。
			出力結果：10
			
		④配列aの要素数を「配列aの要素数は、○です。」という形で表示してください。
			出力結果：配列aの要素数は、５です。
	*/
//		int型aの配列を作成、1～5を格納
		int[] a = {1,2,3,4,5};
//		参照型配列bに3を代入してコンソール出力
		int[] b = {3};
		System.out.println(b[0]);
//		配列a[3]を10で上書きしてコンソール出力
		a[3] = 10;
		System.out.println(a[3]);
//		配列aの要素数をlengthメソッドを使って取得し、コンソール取得
		System.out.println("配列aの要素数は、" + a.length + "です。");
	}

}
