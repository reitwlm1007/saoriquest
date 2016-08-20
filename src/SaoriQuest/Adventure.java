package SaoriQuest;

public class Adventure {

	//敵を配列で管理する場合
	public Enemy[] enemy;



	//敵の初期化
	private void enemies(){

		enemy = new Enemy [3];
		enemy[0] = new Enemy ("カラス");
		enemy[1] = new Enemy("猛犬");
		enemy[2] = new Enemy("ゾンビ");
	}

	public Adventure(){
		enemies();
	}

	public void startAdventure(){
		Util.showMessage("冒険します",false);

		int b = 0;
		int adventure;
		adventure =(int)(Math.random()*3);


		Util.showMessage(enemy[adventure].name + "が襲い掛かってきた！",false);

		int Life = 50;

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
					Bag.deleteBag(c);
					Hero.hp += 20;

					Util.showMessage(Hero.name + "は体力が" + Hero.hp +"となった",true);
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
				Life-=10;
				Util.showMessage(enemy[adventure].name +"に10のダメージを与えた！", true);

			}else{
				Life-= 30;
				Util.showMessage(enemy[adventure].name + "に30のダメージを与えた！", true);
			}

			if(Life <= 0){
				Util.showMessage("戦いに勝利した！", false);
				break;
			}

			Util.showMessage(enemy[adventure].name +"の攻撃！", true);
			Hero.hp-=5;
			Util.showMessage(Hero.name + "の体力は" + Hero.hp + "となった！", false);
			Util.nextLine();
		}
	}while( Life>=0);
	}
}

