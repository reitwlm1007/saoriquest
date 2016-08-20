package SaoriQuest;
import static SaoriQuest.GameConstants.*;


public class Enemy{
	String name;
	int hp;

	public Enemy(int type){
		switch(type){

			case ENEMY_TYPE_KARASU:
				name = ENEMY_NAME_KARASU;
				hp = ENEMY_HP_KARASU;
				break;

			case ENEMY_TYPE_KYOKEN:
				name = ENEMY_NAME_KYOKEN;
				hp = ENEMY_HP_KYOKEN;
				break;

			case ENEMY_TYPE_ZOMBIE:
				name = ENEMY_NAME_ZOMBIE;
				hp = ENEMY_HP_ZOMBIE;
				break;
		}
	}
}
