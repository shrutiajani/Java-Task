package p1;

public class divisable5and7 {
	
	    public static void main(String[] args) {
	        System.out.println("Numbers divisible by both 5 and 7 (1 to 100):");
	        for (int i = 1; i <= 100; i++) {
	            if (i % 5 == 0 && i % 7 == 0) {
	                System.out.print(i + " ");
	            }
	        }
	    }
	}


