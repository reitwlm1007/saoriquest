package SaoriQuest;

import static SaoriQuest.GameConstants.*;

public class Item {
	String name;
	int money;
	int usePattern;

	public Item(String name,int money){
		this(name, money, 0);
	}

	public Item(String name,int money,int usePattern){
		this.name = name;
		this.money = money;
		this.usePattern = usePattern;
	}

	public void Use(){
		switch(usePattern){
		case ITEM_USE_PATTERN_NOTHING:
			Util.showMessage(Hero.name + "は" + this.name + "を使った", false);
			Util.showMessage("しかし、何も起こらなかった", true);
			break;
		case ITEM_USE_PATTERN_RESTORE:
			Util.showMessage(Hero.name + "は" + this.name + "を使った", false);
			Hero.restoreHp(20);
			break;
		}

	}

}
