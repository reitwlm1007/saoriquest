package SaoriQuest;

public class NumberGame {

	public void StartGame(){


		String a = "店員";

		Util.showMessage(a + "「数字あてゲームへようこそ」", false);
		Util.showMessage(a + "「まぁ金無くして帰りな」",true);


		do{
			Util.showMessage("・看板・", false);
			Util.showMessage("数字あてゲームは0～99までの数字をより早く当てるゲームです", false);
			Util.showMessage("掛け金は500円です", false);


			// 先に所持金を確認
			if(Hero.money < 500){
				Util.showMessage(a + "「お客さ～ん、金ねぇじゃん・・・帰った帰った！」", false);
				break;
			}

			// 実際にお金を減らす
			Hero.money-=500;


			int number;
			number = (int)(Math.random()*99);

			Util.showMessage(a + "「早速数字決めてくださいよ」", false);
			Util.showMessage("0～99までの数字を入力してください", false);

			int count=0;
			int win = 1000;

			while(true){

				count++;
				int n = Util.nextInt();

				if(n==number){
					Util.showMessage("「ビンゴ！」", false);
					Util.showMessage("「勝ち金は" + win +"だ！もってけ泥棒‼」", false);
					Util.showMessage("「ちなみに" + count + "回でクリアだぞ」", false);
					Util.showMessage("―所持金が" + (Hero.money+=win) +"となった―", false);
					break;
				}else if(Math.abs(n-number)<=15){

					if(n>number){
						Util.showMessage("ゴッホゴッホ！ちょっとばかし数字よか多いな～…", false);
					}else{
						Util.showMessage("おわ！数字よりちょっちだけ低いんじゃねぇの…？", false);
					}

				}else{
					if(n>number){
						Util.showMessage("ハッハッハ、数字より大きすぎるぞ、まだまだだな！笑", false);
					}else{
						Util.showMessage("それじゃあ数字より低すぎるなぁ～", false);
					}
				}


				win = win - 50;
				if(win<0){
					win=0;
				}
			}

			Util.showMessage("お姉さん「まだ遊んでいきますか？」",false);
			Util.showMessage("1.はい",false);
			Util.showMessage("2.いいえ",false);
			int b =Util.nextInt();

			if(b==2){
				break;
			}

		}while(true);
	}

	/*public void part2(){



		System.out.println("お姉さん「まだ遊んでいきますか？」");
		System.out.println("1.はい");
		System.out.println("2.いいえ");

		int b =Util.nextInt();

		if(b==2){
			System.out.println("街へ戻ります");
			City city = new City();
			city.goCity();

		}else{
			System.out.println("お姉さん「あら、さすがですわ♡」");
			Casino casino=new Casino();
			casino.StartCasino();
		}

	}*/
}