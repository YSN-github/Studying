package learn;

public class Advance{
    public static void ad(){

    Basic.line("簡易条件式(要再学習)");
    int h= 5, i= 15;
    System.out.println( (h < 10) ? ("h<10") : ("h>=10"));
    System.out.println( (i < 10) ? ("i<10") : ("i>=10"));
    Basic.end();
    
    Basic.line("処理時間測定");
    long a = System.currentTimeMillis();
    //測りたい処理
    long b = System.currentTimeMillis();
    System.out.println((b - a)  + "ms");
    Basic.end();
    
    

    }
   }