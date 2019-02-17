package learn;

public class Basic{
    public static void main(String args[]){//UTF-8
    System.out.println("学習する上でよく使う基本構文");

    line("文字の表示");
    System.out.println("Hello world");
    end();

    line("変数作成");
    String a="YSN_JP";
    System.out.println("a="+a);
    int b= 200+300;
    System.out.println("b="+b);
    end();

    line("配列");
    int c[]=new int [3];
    c[0]=10;
    c[1]=20;
    c[2]=30;
    System.out.println("c="+c[0]+","+c[1]+","+c[2]);
    end();

    line("二次元配列(長さ指定)");
    int d[][]=new int[2][2];
    d[0][0]=10;
    d[0][1]=20;
    d[1][0]=30;
    d[1][1]=40;
    System.out.println("d="+d[0][0]+","+d[1][1]);
    line("二次元配列（データ指定）");
    int e[][] = {{2,4},{6,8},{10}};
    System.out.println("e="+(e[0][1]+e[2][0]));
    System.out.println("e2="+e.length+" "+e[0].length+" "+e[1].length);
    end();

    line("演算子(+=等にて計算)");
    int f=30;
    System.out.println("f="+f);
    System.out.println("f+70→"+(f+=70));
    System.out.println("f-30→"+(f-=30));
    System.out.println("f*10→"+(f*=10));
    System.out.println("f/3→"+(f/=3));
    System.out.println("f%4→"+(f%=4));
    end();

    line("繰り返し");
    for(int j=1;j<=3;j++){
      System.out.println("j="+j);
    }
    int j2=0;
    while(j2==2) {
    	System.out.println("j2="+j2);
    	j2++;
    }
    end();

    line("条件式");
    int k =1;
    System.out.println("k=ここから");
    switch (k){case 0:System.out.println("a");
               break;
               case 1:System.out.println("b");
               break;
               case 2:System.out.println("c");
               break;
               default :System.out.println("d");
               }
    if(k<5)System.out.println("kは5より小さい");
    else System.out.println("kは5以上");
    end();

    line("メソッド");
           int l = 10,m = 20;

          System.out.println(" int l = " + l);
          System.out.println(" int m = " + m);
          System.out.println("----------------------");

          Basic.test(l,m);//クラス.メソッド名

          //その他(他クラスから呼び出し)
          //例：LearnString.main(args);【staticの場合はインスタンス不要】

          //LearnInt test3 = new LearnInt();//static無しの場合は 【クラス 好きな変数名 = new クラス】
          //test3.main();//上で生成したオブジェクト名.実行したいメソッド
          end();

     }


    static void test(int n,int o){
    	//受け取ったものをローカルの変数に当てはめる

       System.out.println(" int l = " + n);
       System.out.println(" int m = " + o);
    }

    static void line(String a) {
    	System.out.println("");
    	System.out.println(a);
    	System.out.println("");
    }

    static void end() {
    	System.out.println("");
    	System.out.println("------------------------------------------");
    }
}
