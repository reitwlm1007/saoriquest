package SaoriQuest;

public class Hotel {

	public void startHotel(){

		String a = "宿屋のおじさん";

		Util.showMessage(a +"「よぉ旅の者、泊まっていくかい？」",false);
		Util.showMessage(a + "「料金は100円になるよ」",true);

		Util.showMessage("1.泊まる",false);
		Util.showMessage("2.やめておく",false);

		int b =Util.nextInt();

		if(b==1){

			if(Hero.money>100){
				Hero.money-=100;
				Util.showMessage("――所持金が" + Hero.money + "円になった――",true);
				Util.showMessage(a + "「お、客がいねぇで困ってたんだよ～」",true);
				Util.showMessage(a + "「今夜はゆっくりしていきな」",true);
				Util.showMessage("――――――――",true);
				Util.showMessage("――――――…",false);
				Util.showMessage(a +"「おはようさん、よく眠れたかい？」",true);
				Util.showMessage(a +"「最近砂漠のほうに物騒なモンスターが出るらしいから」",true);
				Util.showMessage(a +"「くれぐれもあっちのほうには近づくなよ」",true);

			}else{
				Util.showMessage(a + "「お客さんこれじゃあ金がたりねぇよ...」",true);
				Util.showMessage("すまねぇが他をあたってくれ",true);
			}
		}else{
			Util.showMessage(a + "「なら商売の邪魔だ、でていけ！」",false);
			Util.showMessage(a + "「ま、まぁ困ったらいつでも来いよ...///」",true);
		}
	}
}

