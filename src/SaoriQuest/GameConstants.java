package SaoriQuest;

public class GameConstants {

	private GameConstants(){}

		// 所持できるアイテムの最大値
		public static final int MAX_ITEM_CAPACITY = 10;





		// アイテムの動作パターン
		public static final int ITEM_USE_PATTERN_NOTHING = 0;			// 何も起こらない
		public static final int ITEM_USE_PATTERN_RESTORE = 1;			// 回復



		// 敵の種類
		public static final int ENEMY_TYPE_KARASU = 0;
		public static final String ENEMY_NAME_KARASU = "カラス";
		public static final int ENEMY_HP_KARASU = 20;

		public static final int ENEMY_TYPE_KYOKEN = 1;
		public static final String ENEMY_NAME_KYOKEN = "狂犬";
		public static final int ENEMY_HP_KYOKEN = 50;

		public static final int ENEMY_TYPE_ZOMBIE = 2;
		public static final String ENEMY_NAME_ZOMBIE = "ゾンビ";
		public static final int ENEMY_HP_ZOMBIE = 100;
}
