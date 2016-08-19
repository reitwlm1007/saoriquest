
package SaoriQuest;

public class BaseGame {


	// ストーリーの進行度を管理する変数
	int scenarioNo;
	// コンストラクタ
	public BaseGame(){
		scenarioNo = 1;
	}


	// ゲーム開始
	public void startGame(){




		Scenario scenario = new Scenario();
		scenario.startScenario(scenarioNo);


		Map map = new Map();
		int h;


		do{
			h = map.startMap();
		}while(h<6);
	}
}


