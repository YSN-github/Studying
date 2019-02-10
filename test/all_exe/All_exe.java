package all_exe;
import helloworld.*;
import algorithm.*;


public class All_exe {

	public static void main(String[] args) {
		Test.main(args);
		System.out.println("Test,ここまで--------------------------------------------------------------------------");
		Test2.main(args);
		System.out.println("Test2,ここまで-----------------------------------------------------------------------");
		Test3 test3=new Test3();
		test3.main();
		System.out.println("Test3,ここまで----------------------------------------------------------------------");
		Test4.main(args);
		System.out.println("Test4,ここまで------------------------------------------------------------------");
		
		Bobble.main(args);
		System.out.println("Bobble,ここまで------------------------------------------------------------------");
		

	}

}
