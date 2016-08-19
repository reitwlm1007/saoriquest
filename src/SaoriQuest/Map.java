package SaoriQuest;

public class Map {
	public Map(){

	}


	public int startMap(){
		//近くの森
		Util.showMessage("",true);
		Util.showMessage("―近くの森―",true);

		//選択
		String d = "探索";
		String e ="冒険";
		String g = "持ち物";

		Util.showMessage("何をしますか？",false);
		Util.showMessage("1" + d,false);
		Util.showMessage("2" + e,false);
		Util.showMessage("3" + g ,false);
		Util.showMessage("4ストーリーを進める",false);
		Util.showMessage("5.街へ戻る",false);




		int h =Util.nextInt();

		if(h==1){
			Search search = new Search();
			search.startSearch();
		}else if (h==2){
			Adventure adventure = new Adventure();
			adventure.startAdventure();
		}else if(h==3){
			Bag.showBag();
		}else if(h==4){

		}else if (h == 5){
			City city = new City();
			city.goCity();

		}else {


		}

		return h;
	}
}
