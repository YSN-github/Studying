package learn;

public class LearnClassAndMethod {//本来は1ファイルに2クラスは非推奨。インスタンス操作必要の物が通常使われる。

	public static void CAM() {

		Basic.line("他クラスから呼び出し");
        L.L1();//【staticの場合はインスタンス不要】
        M m = new M();//static無しの場合は 【クラス 好きな変数名 = new クラス】
        m.M1(); //上で生成したオブジェクト名.実行したいメソッド
        Basic.end();

		System.out.println("テスト4");
		System.out.println(sub(2500));


	    new A(33.66,139.75,10.0);
		new A(38.25,137.65,12.0);

		Basic.line("よくある使い方");
    	sub b1 = new sub();
        b1.setInt(10);
        System.out.println(b1.B1(2));
		Basic.end();
		}

		public static int sub(int x) {
	    	int y= 250;
	    	int z =x/y;
	    	return z;

	}
}

        class L {
        	 static void L1() {
        		System.out.println("これはLというクラスのL1というメソッドのものです。インスタンス操作不要");
        	}
        }

        class M{
        	 void M1() {
        		System.out.println("これはMというクラスのM1というメソッドのものです。インスタンス操作必要");
        	}
        }

		class A {

		  A(double la, double lo, double he){//コンストラクタ

			    System.out.println(la);
			    System.out.println(lo);
			    System.out.println(he);
		    }
}
         class sub {
			int Int;

			public int B1(int a) {
				return Int*a;
			}
			public void setInt(int c) {
				this.Int =c;
			}
		}
