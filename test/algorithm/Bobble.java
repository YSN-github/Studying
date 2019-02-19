package algorithm;

//int配列を出力するために必要(arrays.toString())//
import java.util.Arrays;

public class Bobble {

	public static void Bo() {
		int arr[]= {8,7,6,5,4,3,2,1};
		int do_count = 0;
		int all_count= 0;

		System.out.println(Arrays.toString(arr));
		//今回はバブルソート昇順・右から左へ//
        for (int i = 0; i < arr.length - 1; i++) {//比較のため、長さ-1
            for (int a = arr.length - 1; a > i; a--) {
            	/*長さ8 7回比較,6回,5回・・・となる
            	 a>iなのは、1セット行えば最も小さな数字が1つ確定し、残った一つは最大で確定するため*/


                if (arr[a - 1] > arr[a]) {//比較

                	int b =arr[a - 1];//数字を保存

                    arr[a - 1] = arr[a];//上書き

                    arr[a] = b;//保存しておいた数字を入れ替え

                    do_count++;//入れ替えを合計何回行ったか確認するためのもの
                    }


                    all_count++;//合計何回比較を行ったか確認するためのもの//
                                //小さな数字が1つ確定。a--発動
                }
              //i++の効果発動,最初へ戻る//
            }

       System.out.println(Arrays.toString(arr));

       System.out.println("入替回数"+do_count);

       System.out.println("比較回数"+all_count);


	}

}

