package allgeier.engineering.allearbeitenandemprojekt.mainpackage;


public class c_mainClass {

	private static int i_fiboValue = 9;
	
	public static void call_FiboPrintOut(){
		printFibo();
	}
	
	public static void main(String[] args) {
		c_mainClass.call_FiboPrintOut();
	}

	public static int fibo(int i) {
        if (i <= 1) return i;
        else return fibo(i-1) + fibo(i-2);
    }
		
	}

	public static void printFibo(){
		System.out.println("Fibo of: " + i_fiboValue + " = " + fibo(i_fiboValue));
		
	}
	
}

