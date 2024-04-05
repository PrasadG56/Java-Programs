import java.lang.Math;
import java.util.Scanner;
class pract1{
	public static void main(String[] args){
		//System.out.print(Math.pow(2,0));
		Scanner sc = new Scanner(System.in);
		int b1 = sc.nextInt();
		int b2 = sc.nextInt();
		int dec1 = 0,dec2 = 0,num1 = 0,num2 = 0,dec,rem;
		String result = "";
		
		// Convert the binaries into decimal
		for(int i = 0;i<3;i++){
			int rem1 = (int) b1%10;
			b1 = b1/10;
			
			int rem2 = (int) b2%10;
			b2 = b2/10;
			
			if(rem1 == 1){
				num1 = (int) Math.pow(2,i);
			}
			dec1+=num1;
			System.out.println(dec1);
			
		
			if(rem2 == 1){
				num2 =  (int) Math.pow(2,i);
			}
			dec2+=num2;
			System.out.println(dec2);
		}
		
		 dec = dec1*dec2;
		 
		 
		//Going decimal to binary
		while(dec!=0){
			rem = (int) dec%2;
			dec /= 2;
			result = result +String.valueOf(rem);
			//System.out.println(dec);
			//System.out.println(result);
		}
		

		System.out.printf("The multiplication is : %s\n", result);

		
	}
}