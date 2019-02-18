package learn;

public class LearnClassAndMethod {

	public static void main(String[] args) {
		 //その他(他クラスから呼び出し)
        //例：LearnString.main(args);【staticの場合はインスタンス不要】

        //LearnInt test3 = new LearnInt();//static無しの場合は 【クラス 好きな変数名 = new クラス】
        //test3.main();//上で生成したオブジェクト名.実行したいメソッド

		System.out.println("テスト4");
		System.out.println(sub(2500));
	}

		public static int sub(int x) {
	    	int y= 250;
	    	int z =x/y;
	    	return z;

	}

}
