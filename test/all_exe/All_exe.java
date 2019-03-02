package all_exe;
import algorithm.Bobble;
import learn.Basic;
import learn.LearnInt;
import learn.LearnString;
import learnclass.LearnClassAndMethod;


public class All_exe {//UTF-8

	public static void main(String[] args) {

		Basic.Ba();
		ko("Basic");
		Basic.end();

		LearnString.LS();
		ko("LearnString");
		Basic.end();

		LearnInt test=new LearnInt();
		test.LI();
		ko("LearnInt");
		Basic.end();

		LearnClassAndMethod.CAM();
		ko("ClassAndMethod");
		Basic.end();

		Bobble.Bo();
		ko("Bobble");
		Basic.end();


	}
	public static void ko(String a) {
		System.out.print(a+",ここまで");//
	}

}
