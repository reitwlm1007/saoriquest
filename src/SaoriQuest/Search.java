package SaoriQuest;

public class Search {

	// アイテムを配列で管理する場合
	public Item[] item;



	// アイテムの初期化
	private void initItem(){

		item = new Item[10];
		item[0] = new Item("硬い木の枝",0);
		item[1] = new Item("ナイフ",200);
		item[2] = new Item("弓",300);
		item[3] = new Item("ぼろい剣",400);
		item[4] = new Item("トンファー",400);
		item[5] = new Item("斧",700);
		item[6] = new Item("溶けないあずきバー",1000);
		item[7] = new Item("普通の剣",1000);
		item[8] = new Item("騎士の剣",1500);
		item[9] = new Item("シカの角",10);

	}

	public Search(){
		initItem();

	}


	public void startSearch(){
		Util.showMessage("探索します",false);


		int search;
		search =(int)(Math.random()*3);


		if(search==0){
			Util.showMessage("何も見つかりませんでした",false);
		} else if (search == 1)	{
			Util.showMessage("5円見つけた",false);
			Hero.money += 5;
			Util.showMessage("所持金が" + Hero.money + "になった！",false);
		} else {
			int sword =(int)(Math.random()*10);
			Util.showMessage(item[sword].name + "を手に入れた",false);
			Bag.addBag(item[sword]);

		}
	}
}
