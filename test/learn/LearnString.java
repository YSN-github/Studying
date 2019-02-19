package learn;

public class LearnString {
	public static void LS() {

		String a="0";
		StringBuilder b = new StringBuilder();;

		long x = System.currentTimeMillis();
		for(int i =0;i<10000;i++) {
			a = a+i;
		}
	    long z = System.currentTimeMillis();
	    System.out.println("＋連結→"+(z - x)  + "ms");//10万だと4桁ms

	    long x1 = System.currentTimeMillis();
		for(int i =0;i<10000;i++) {
			b.append(String.valueOf(i));
		}
	    long z1 = System.currentTimeMillis();
	    System.out.println("Builder連結→"+(z1 - x1)  + "ms");//10万でも1桁ms

	}

}