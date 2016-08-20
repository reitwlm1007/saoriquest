package SaoriQuest;

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
		case 0:
			Util.showMessage(Hero.name + "は" + this.name + "を使った", false);
			Util.showMessage("しかし、何も起こらなかった", true);
			break;
		case 1:
			Hero.hp += 20;
			Util.showMessage(Hero.name + "は" + this.name + "を使った", false);
			Util.showMessage(Hero.name + "は体力が" + Hero.hp + "となった", true);
			break;
		}

	}

}
