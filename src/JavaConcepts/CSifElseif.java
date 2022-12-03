package JavaConcepts;

public class CSifElseif {
	
	public static void main(String[] args) {
		int marks = 78;
		if(marks>60) {
	    System.out.println("pass");
		}else if(marks<60) {
			System.out.println("fail");
		}else if(marks>60 &&marks<70) {
			System.out.println("C grade");
		}else if(marks>70 &&marks<80) {
			System.out.println("B grade");
		}else if(marks<80 &&marks<90) {
			System.out.println("A grade");
		}else {
			System.out.println("fail");
		}
	
	}

}
