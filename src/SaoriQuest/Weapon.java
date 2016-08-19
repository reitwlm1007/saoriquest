package SaoriQuest;

public class Weapon {


	public Item[] item;

	private void vSword(){

		item = new Item[5];
		item[0] = new Item("ナイフ",200);
		item[1] = new Item("中古の剣（弱）",500);
		item[2] = new Item("ボウガン",700);
		item[3] = new Item("槍",800);
		item[4] = new Item("普通の剣",1000);
	}

	public Weapon(){
		vSword();
	}

	public void WeaponShop(){

		int i;
		int n;
		String a = "武器屋のおじさん";

		Util.showMessage(a + "「お、" + Hero.name + "さんじゃないかぁ、みるだけ見てってよ！」",false);

	do{
		Util.showMessage("*************",false);
		Util.showMessage("0." + item[0].name + ":200円",false);
		Util.showMessage("1." + item[1].name + ":500円",false);
		Util.showMessage("2." + item[2].name + ":700円",false);
		Util.showMessage("3." + item[3].name + ":800円",false);
		Util.showMessage("4." + item[4].name + ":1000円",false);
		Util.showMessage("*************",false);
		Util.showMessage("7.売る",false);
		Util.showMessage("9.街に戻る",true);

		i =Util.nextInt();


		if(i!=9 && i!=7){
			Util.showMessage(item[i].name + "を買ってくか？",false);
			Util.showMessage("1.買う",false);
			Util.showMessage("2.買わない",false);

			n = Util.nextInt();

			if(Hero.money<item[i].money){
				Util.showMessage("悪いが金のねぇやつには売れねぇんだわ",false);
				break;
			}

			if(n ==1){
				Util.showMessage(item[i].name + "を手に入れた",false);
				Hero.money-=item[i].money;
				Util.showMessage("所持金が"+ Hero.money +"円となった",true);
				Bag.addBag(item[i]);
			}
}

		if(i==7){
			int t = Bag.count;
			if(t>0){
				Bag.cellBag();

				Util.showMessage("何を売るんでぇ？", false);
				int c =Util.nextInt();
				Item item = Bag.getItem(c);
				Util.showMessage(item.name + "は" + item.money/2 + "円で売却できます。",true);
				Util.showMessage("1.売る",false);
				Util.showMessage("2.売らない",false);

				int r = Util.nextInt();

				if(r == 1){
					Bag.deleteBag(c);
					Hero.money+=item.money/2;
					Util.showMessage(item.name + "を売りました",true);
					Util.showMessage("所持金が" + Hero.money + "円になった",true);
				}
			}

				}else{
					Util.showMessage("売却できるアイテムがありません",true);
					Util.nextLine();

			}

		}while(i<9);
	}
}
