package SaoriQuest;

public class Barrier {

	public Item[] item;

	private void Protect(){

		item= new Item[6];
		item[0]= new Item("中古の鎧",500);
		item[1]= new Item("中古の盾",500);
		item[2]= new Item("中古の兜",500);
		item[3]= new Item("普通の鎧",1000);
		item[4]= new Item("普通の盾",1000);
		item[5]= new Item("普通の兜",1000);

	}

	public Barrier(){
		 Protect();
	}
	public void ProtectShop(){

		String a = "防具屋の娘";

		int i;
		Util.showMessage(a + "「種類はありませんが手入れは行き届いてます！」",true);
		Util.showMessage(a + "「ぜひお手に取ってください」",true);


	do{

		Util.showMessage("*************",false);
		Util.showMessage("0." + item[0].name+ ":500円",false);
		Util.showMessage("1." + item[1].name+ ":500円",false);
		Util.showMessage("2." + item[2].name+ ":500円",false);
		Util.showMessage("3." + item[3].name+ ":1000円",false);
		Util.showMessage("4." + item[4].name+ ":1000円",false);
		Util.showMessage("4." + item[5].name+ ":1000円",false);
		Util.showMessage("*************",false);
		Util.showMessage("9.店を出る",false);

		i=Util.nextInt();


		if(i!=9 && i!=7){
			Util.showMessage(item[i].name + "を買いますか？",false);
			Util.showMessage("1.買う",false);
			Util.showMessage("2.買わない",false);

			int b = Util.nextInt();

			if(Hero.money<item[i].money){
				Util.showMessage("あ、お客さん料金が足りませんね・・！",false);
				Util.showMessage("また来てください！",true);
				break;
			}

			if(b == 1){
				Util.showMessage(item[i].name +"を手に入れた",true);
				Hero.money-=item[i].money;
				Util.showMessage("――所持金が" + Hero.money + "になった",true);
				Bag.addBag(item[i]);
			}
		}

		if(i==7){


			int t =Bag.count;
			if(t>0){

			Bag.cellBag();

				Util.showMessage("どれを売りますか？",true);

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

