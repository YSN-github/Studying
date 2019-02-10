package algorithm;

import java.util.*;//int配列を出力するために必要(arrays.toString())//

public class Bobble {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int arr[]= {8,7,6,5,4,3,2,1};
		int do_count = 0;
		int all_count= 0;
		
		System.out.println(Arrays.toString(arr));
		//バブルソート降順//
        for (int i = 0; i < arr.length - 1; i++) {/*iは0,長さ分繰り返す。今回は7回※スタート(i)が0の為、-1している
             比較なので、8回繰り返す必要はない*/
        	
            for (int a = arr.length - 1; a > i; a--) {
            	/*aは長さ―1=今回は7,iに抜かれたら終わり今回は長さ8の為7回,6回,・・・となる
            	 a>iなのは、1セット行えば最も小さな数字が1つ確定する為、1回分繰り返す必要がなくなるから*/
            	
            	
                if (arr[a - 1] > arr[a]) {//配列の最初は「0番目」、「初回」もし7番目が8番目より多かったら、//
                	
                	int b =arr[a - 1];//「初回」7番目の数字を保存//
                	
                    arr[a - 1] = arr[a];//「初回」7番目を8番目の数字にする//、
                    
                    arr[a] = b;//「初回」8番目を7番目の数字にする(入れ替え完了)//
                    
                    do_count++;}//入れ替えを合計何回行ったか確認するためのもの//
                
                                //else無し。条件に当てはまらないなら「何もしない」//
                
                    all_count++;//合計何回比較を行ったか確認するためのもの//
                    
                }//処理が終わってa--の効果発動。次は6番目の数字を7番目と比較・・・と続く//
            }//比較し終わったらi++の効果発動,最初へ戻る//
        
       System.out.println(Arrays.toString(arr));
       
       System.out.println("入替回数"+do_count);
       
       System.out.println("比較回数"+all_count);
	}

}

