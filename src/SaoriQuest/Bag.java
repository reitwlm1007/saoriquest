package SaoriQuest;


public class Bag {
	static int count = 0;
	static Item[] item = new Item[GameConstants.MAX_ITEM_CAPACITY];


	public static void addBag(Item addItem){
		if(count < GameConstants.MAX_ITEM_CAPACITY){
			item[count] = addItem;
			count++;
		}
	}


	public static void showBag(){
		for(int i=0; i<count; i++){
			Util.showMessage(item[i].name,false);
		}
	}

	public static void cellBag(){
		for(int i=0; i<count; i++){

		Util.showMessage(i + item[i].name,false);
		}
	}

	public static void deleteBag(int delete){
		item[delete]=null;
		for (int i=delete;i<count;i++){
			item[i] = item[i+1];
		}
		count--;
	}

	public static Item getItem(int number){
		return item[number];
	}

}
