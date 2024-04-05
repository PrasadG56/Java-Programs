import java.util.Scanner;
class Hexa{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int quotient,divisor, i = 0;
		String hexaDecimal = "";
		divisor = sc.nextInt();
		
		int[] rem = new int[5];
		char[] hexValues = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		
		
		while (divisor!=0){
			rem[i] = (int) divisor%16;
			System.out.println(rem[i]);
			quotient = (int) divisor/16;
			divisor = quotient;
			i++;
		}
		for(int j = rem.length-1;j>=0;j--){
			for(int k = 0;k<hexValues.length;k++){
				if(rem[j] == k){
					hexaDecimal+=Character.toString(hexValues[k]);
				}
			}
		}
		System.out.println("Corresponding Hexa decimal is : "+hexaDecimal);
	}
}