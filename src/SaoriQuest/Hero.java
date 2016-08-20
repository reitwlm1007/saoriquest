package SaoriQuest;

public class Hero {
	static String name;
	static int money = 500;
	static int hp = 100;
	static int maxHp = 100;

	public static void restoreHp(int restoreValue){
		hp += restoreValue;
		if( hp > maxHp){
			hp = maxHp;
		}
		Util.showMessage(Hero.name + "は体力が" + Hero.hp + "となった", true);
	}
}
