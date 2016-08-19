package SaoriQuest;

public class Scenario {


	public void startScenario(int scenarioNo){
		switch(scenarioNo){
		case 1:
			ScenarioNo1();
			break;
		case 2:
			ScenarioNo2();
			break;
		case 3:
			ScenarioNo3();


		}

	}


	public void ScenarioNo1(){
		String n="謎の女性";
		String f ="ミレイナ"; //謎の女性
		Util.showMessage("☆サオリクエスト☆",false);
		Util.showMessage("エンターを押してゲームをスタート！", true);
		Util.showMessage("あなたの名前を入力してください",false);
		Hero.name = Util.nextLine();

		Util.showMessage(n +"「勇者" + Hero.name + "さん、よくぞここへいらっしゃいました。」", true);
		Util.showMessage(n + "「依頼した通り、今回は魔王の討伐をお願いします。」", true);
		Util.showMessage(n + "「武器はこちらで用意いたしましたのでお役立てください」", true);
		Util.showMessage(n + "「どうか良いお旅を・・・」", true);

		//選択
		String a = "ありがとう！";
		String b = "うるせぇ！このクソアマ！";

		Util.showMessage(n + "（俺は・・・）", true);

		Util.showMessage("1"+ a ,false);
		Util.showMessage("2"+ b ,false);

		int c =Util.nextInt();


		//ありがとうの場合
		if (c==1){
			Util.showMessage(n + "「はい！がんっばってください！」",false);
			Util.showMessage( f + "「私の名前は"+ f +"と申します。またいづれお会いしましょう」",false);


			//暴言の場合
		}else {
			Util.showMessage("俺は頭に血が上って近くにあった武器で女を殺してしまった",true);
			Util.showMessage("「まぁ、武器も手に入ったしいいか！」",false);
		}


		//旅の始まり
		Util.showMessage("・・・・",true);

		Util.showMessage("そして、"+ Hero.name +"の旅が始まった",true);
		Util.showMessage("―――――…",true);
		Util.showMessage("よし！装備もしたし冒険に出るぞ！！",true);
		Util.showMessage("まずは近くの森でレベルを上げよう",false);

	}


	public void ScenarioNo2(){


		Util.showMessage("",true);
		Util.showMessage("―――――…",true);
		Util.showMessage("よし！装備もしたし冒険に出るぞ！！",true);
		Util.showMessage("次は砂漠でレベルを上げよう",true);
	}

	public void ScenarioNo3(){
		Util.showMessage("よし、いくぞ！",false);
	}
}
