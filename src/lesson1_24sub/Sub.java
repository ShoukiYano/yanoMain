package lesson1_24sub;

import java.util.Random;

public class Sub {
	public Sub(){
		
	}
	
	Bean bean = new Bean();
	
	public static int randomNum() {
		Random ran = new Random();
		int random = ran.nextInt(1001);
		return random;
	}
	
	public int hp() {
		bean.setHp(randomNum());
		return bean.getHp();
	}
	
	public int mp() {
		bean.setMp(randomNum());
		return bean.getMp();
	}
	
	public int atk() {
		bean.setAtk(randomNum());
		return bean.getAtk();
	}
	
	public int str() {
		bean.setStr(randomNum());
		return bean.getStr();
	}
	
	public int def() {
		bean.setDef(randomNum());
		return bean.getDef();
	}
	
	public void input(String sp) {
		System.out.println("こんにちは" + sp + "さん");
	}
	
	public void display() {
		System.out.println("ステータス");
		System.out.println("HP:" + hp());
		System.out.println("MP:" + mp());
		System.out.println("攻撃:" + atk());
		System.out.println("素早さ:" + str());
		System.out.println("防御:" + def());
		System.out.println("さあ、冒険に出かけよう!");
	}
}
