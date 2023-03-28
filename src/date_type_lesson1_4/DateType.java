package date_type_lesson1_4;

public class DateType {


		public static void main(String[] args) {
			int[] a = {1,2,3,4,5};
			int[] b = a;
			System.out.println(b[2]);
			a[3]=10;
			System.out.println(a[3]);
			System.out.println(a.length);
		}

	}