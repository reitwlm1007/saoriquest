package SaoriQuest;

public class Casino {



	public Casino(){

	}

	public void StartCasino(){
		int c;
		do{

			Util.showMessage("お姉さん「どのゲームで遊びますか？」",false);
			Util.showMessage("①.数字あてゲーム",false);
			Util.showMessage("②.街に戻る",true);

			c = Util.nextInt();

			if(c==1){


				NumberGame numberGame = new NumberGame();
				numberGame.StartGame();
			}
		}while(c==1);
	}
}
