package array2_lesson1_14;

public class Practice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		string型の配列を作成し、アルファベットa～jまでを格納してください。
		brake文を使用し、a～dまで表示してください。
		
		 出力結果：a
		           b
		           c
		           d
		          
		cotinue文を使用し、i以外を表示してください。
		
		 出力結果：a
		           b
		           c
		           d
		           e
		           f
		           g
		           h
		           j
		*/
		String[] names = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };
		for (int x = 0; x < names.length; x++) {
			if (x <= 3) {
				System.out.println(names[x]);
			} else {
				break;
			}
		}
		for (int x = 0; x < names.length; x++) {
			if (x == 8) {
				continue;
			} else {
				System.out.println(names[x]);
			}
		}
	}
}
