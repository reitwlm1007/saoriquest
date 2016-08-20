package SaoriQuest;

public class Adventure {

	//敵を配列で管理する場合
	public Enemy[] enemy;





	public Adventure(){
	}

	public void startAdventure(){
		Util.showMessage("冒険します",false);

		int b = 0;
		int adventure;
		adventure =(int)(Math.random()*3);
		Enemy enemy = new Enemy(adventure);


		Util.showMessage(enemy.name + "が襲い掛かってきた！",false);

		do{
		Util.showMessage("何をしますか？", false);
		Util.showMessage("1.戦う", false);
		Util.showMessage("2.逃げる", false);
		Util.showMessage("3.アイテム",false);

		int a = Util.nextInt();

		if(a == 2){
			b = (int)(Math.random()*2);

			if(b == 0){
				Util.showMessage("無事逃げ切ることができました",true);
				break;

			}else{
				Util.showMessage("逃げ切れません", true);
			}
		}
			if(a == 3){

				int t =Bag.count;

				if(t>0){
					Bag.cellBag();

				int c = Util.nextInt();
				Item item = Bag.getItem(c);

				Util.showMessage(item.name + "を使いますか？",false);
				Util.showMessage("1.使う",false);
				Util.showMessage("2.使わない",false);

				int n = Util.nextInt();

				if(n == 1){
					Item useitem = Bag.getItem(c);
					useitem.Use();
					Bag.deleteBag(c);

				}
			}else{
				Util.showMessage("アイテムがありません", true);
			}

		}else{
			Util.showMessage("どの攻撃をしますか？", false);
			Util.showMessage("1.通常攻撃", false);
			Util.showMessage("2.奥義", false);
			int c = Util.nextInt();

			if(c == 1){
				enemy.hp-=10;
				Util.showMessage(enemy.name +"に10のダメージを与えた！", true);

			}else{
				enemy.hp-= 30;
				Util.showMessage(enemy.name + "に30のダメージを与えた！", true);
			}

			if(enemy.hp <= 0){
				Util.showMessage("戦いに勝利した！", false);
				break;
			}

			Util.showMessage(enemy.name +"の攻撃！", true);
			Hero.hp-=5;
			Util.showMessage(Hero.name + "の体力は" + Hero.hp + "となった！", false);
			Util.nextLine();
		}
	}while( enemy.hp>=0);
	}
}

