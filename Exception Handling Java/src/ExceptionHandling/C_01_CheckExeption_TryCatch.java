package ExceptionHandling;

public class C_01_CheckExeption_TryCatch {
	int x= 10;
	public void m1() {
		System.out.println("Value of x is : "+x);
		
	}
	public static void main(String[] args) {
		C_01_CheckExeption_TryCatch obj = new C_01_CheckExeption_TryCatch();
		obj.m1();
		try {
			Thread.sleep(10000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
