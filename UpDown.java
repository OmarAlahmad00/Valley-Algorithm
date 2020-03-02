import java.util.Scanner;

public class fifth {

public static void main(String[] args) {
		
valley("Hello");
}
	

public static void valley(String hello) {
	
	//Scanner scanner = new Scanner(hello);
			
	hello = hello.replaceAll(",", " ");
	
	int downAmn =  0;
	int upAmn =  0;
	int valleyAmn = 0;
	hello = "DDUUUD";
	
	while(hello.length() >= 1) {
		
		if(hello.charAt(0) == 'D') {
			downAmn++;
		} else if(hello.charAt(0) == 'U') {
			upAmn++;
			if(upAmn == downAmn) {
				downAmn = 0;
				upAmn = 0;
				valleyAmn++;
			}
			
		} else {
			System.out.println("Invalid Character In String");
			break;
		}
		hello = hello.substring(1,hello.length());
	}
	
	System.out.println(valleyAmn);
	
	
}

}

