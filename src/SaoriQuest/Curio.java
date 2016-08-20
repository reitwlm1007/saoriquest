package SaoriQuest;
import static SaoriQuest.GameConstants.*;

public class Curio {


	public Item[] item;




	private void VCurio(){

		item = new Item[4];
		item[0]= new Item("グリーンハーブ",50, ITEM_USE_PATTERN_RESTORE);
		item[1]= new Item("レッドハーブ",50);
		item[2]= new Item("ブルーハーブ",50);
		item[3]= new Item("スペクタクルズ",50);

	}

	public Curio(){
		VCurio();
	}


	public void CurioShop(){

		int i;
		int n;

		String a = "道具屋のおばちゃん";

		Util.showMessage( a + "今日も新鮮なのを入れてるよ！",false);

		do{
			Util.showMessage("*************",false);
			Util.showMessage("0." + item[0].name+ ":50円",false);
			Util.showMessage("1." + item[1].name+ ":50円",false);
			Util.showMessage("2." + item[2].name+ ":50円",false);
			Util.showMessage("3." + item[3].name+ ":50円",false);
			Util.showMessage("*************",false);
			Util.showMessage("7.売る",false);
			Util.showMessage("9.街に戻る",true);

			i =Util.nextInt();

			if(i!=9 && i!=7){
				Util.showMessage(item[i].name + "を買うのかい？",false);
				Util.showMessage("1.買う",false);
				Util.showMessage("2.買わない",false);

				n =Util.nextInt();

				if(Hero.money<item[i].money){
					Util.showMessage("お金が不足してるよ",true);
					Util.showMessage("また貯めてからおいで",true);
					break;
				}

				if(n == 1){
					Util.showMessage(item[i].name + "を手に入れた",true);
					Hero.money-=item[i].money;
					Util.showMessage("所持金が" + Hero.money + "円になった",true);
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


					}else{
						Util.showMessage("売却できるアイテムがありません",true);
						Util.nextLine();


				}

		}
	}while(i<9);
}
}
