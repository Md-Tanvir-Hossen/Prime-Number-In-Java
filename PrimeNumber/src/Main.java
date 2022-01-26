import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Starting Value....");
		int Snum = scan.nextInt();
		
		System.out.println("Ending Value....");
		int Enum = scan.nextInt();
		
		
		for(int l = Snum;  l <= Enum; l++) {
			
			int reg=0;
			
			for(int i = 2; i <l; i++) {
				
				if(l%i==0) {
					reg++;
				}
				
			}
			
			if(reg == 0) {
				System.out.println(l + " is a Prime Number");
			}else {
				System.out.println(l + " is not a Prime Number");
			}
			
		}
		
	  }
	
}
 