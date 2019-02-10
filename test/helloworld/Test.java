package helloworld;

public class Test{
    public static void main(String args[]){//UTF-8
    
    System.out.println("Hallo world");
    String a="YSN_JP";
    System.out.println("a="+a);
    int b= 200+300;
    System.out.println("b="+b);//����=string�A����=int,double(�ʏ�p������)//
  
    int c[]=new int [5];
    c[0]=10;
    c[1]=20;
    c[2]=30;
    System.out.println("c="+(c[0]+c[1]+c[2]));//�z��//

    int d[][]=new int[2][2];
    d[0][0]=10;
    d[0][1]=20;
    d[1][0]=30;
    d[1][1]=40;
    System.out.println("d="+(d[0][0]+d[1][1]));//�������z��//

    int e[][] = {{2,4},{6,8},{10}};
    System.out.println("e="+(e[0][1]+e[2][0]));
    System.out.println("e2="+e.length+" "+e[0].length+" "+e[1].length);//�������z�񂻂�2//

    int f=30;
    System.out.print("f=");
    System.out.println(f+=70);
    System.out.println("f2="+f);

    int g =30;
    System.out.print("g=");
    System.out.println(g<<2);
    System.out.print("g2=");
    System.out.println(g>>2);

    int h= 5, i= 15;  
    System.out.println( (h < 10) ? ("h<10") : ("h>=10"));
    System.out.println( (i < 10) ? ("i<10") : ("i>=10"));

    for(int j=1;j<=3;j++){
      System.out.println("j"+j+" number="+j);//���[�v����for��//
    }

    int k =1;
    System.out.println("k=ここから");
    switch (k){case 0:System.out.println("  a");
               case 1:System.out.println("  b");
               case 2:System.out.println("  c");
               break;
               default :System.out.println("  d");
               }
    System.out.println("k=ここまで");//switch��//
    
    //class//
           int l = 10,m = 20;
          
          System.out.println(" int l = " + l);
          System.out.println(" int m = " + m);
          System.out.println("----------------------");
          
          Test.test(l,m);//クラス.メソッド名//
          Test2.main(args);//別ファイルも可【staticがある場合はこれだけでいい】//
          Test3 test3 = new Test3();//無い場合はクラス 好きな名 = new クラス//
          test3.main();/*好きな名で作ったオブジェクト　実行したいメソッド
          かっこの中は渡したい数字や変数、文字を入れる。複数の場合は「,」を忘れないように*/
          
     }


    static void test(int n,int o){
    	//a受け取ったものをローカルの変数に当てはめる//

       System.out.println(" int l = " + n);
       System.out.println(" int m = " + o);
    }
    
    
   
    
  }
