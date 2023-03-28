package lesson22.main;

import java.util.Calendar;

import lesson22.logic.Logic;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//こんにちは！ここは日本(this.country)です！
				Logic logic =new Logic();
				logic.country ="日本";
				logic.hello();
				
				//この寿司はうまい
				logic.food ="寿司";
				logic.foods();
				
				//「寿司(this.food)は和食です」出力
				logic.categorys();
				
				
				//日付（年）
				Calendar calendar =Calendar.getInstance();
				logic.numTotal1 = (calendar.get(Calendar.YEAR));
				logic.year();
				
				//日付（月）
				logic.numTotal2 = (calendar.get(Calendar.MONTH)+1);
				logic.month();
				
				
				//日付（日）
				logic.numTotal3 = (calendar.get(Calendar.DATE));
				logic.day();
				
				//日付（時）
				logic.numTotal4 = (calendar.get(Calendar.HOUR));
				logic.hour();
				
				
				//日付（分）
				logic.numTotal5 = (calendar.get(Calendar.MINUTE));
				logic.minute();
				
				//日付（分）
				logic.numTotal6 = (calendar.get(Calendar.SECOND));
				logic.second();

			}
		}
