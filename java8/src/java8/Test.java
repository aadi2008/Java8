package java8;

public class Test {
	
	public static void main(String args[]){
		
		
		Runnable r = () -> System.out.println("Test");
		new Thread(r).start();
		
	}

}
