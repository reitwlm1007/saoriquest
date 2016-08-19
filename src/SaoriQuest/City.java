package SaoriQuest;

public class City {


	public City(){


	}

	public void goCity(){
		int k;

		do{
			Util.showMessage("どこへいこうか？",false);

			Util.showMessage("1.宿屋",false);
			Util.showMessage("2.武器屋",false);
			Util.showMessage("3.防具屋",false);
			Util.showMessage("4.道具屋",false);
			Util.showMessage("5.カジノ",false);
			Util.showMessage("6.旅に出る",false);



			k =Util.nextInt();

			switch(k){


			case 1:
				Hotel hotel = new Hotel();
				hotel. startHotel();
				break;
			case 2:
				Weapon weapon = new Weapon();
				weapon.WeaponShop();
				break;
			case 3:
				Barrier barrier= new Barrier();
				barrier.ProtectShop();
				break;
			case 4:
				Curio curio = new Curio();
				curio.CurioShop();

				break;
			case 5:
				Casino casino= new Casino();
				casino.StartCasino();
				break;
			}
		}while(k<6);

	}
}
