import java.util.Scanner;
import java.lang.Math;

class DeciToHexa{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int decimal =0,counter = 0;
		String hexaDecimal = sc.nextLine().toUpperCase();
		
		char[] hexValues = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		char[] hexaStrTochar = hexaDecimal.toCharArray();
		
		for(int j = hexaStrTochar.length-1;j>=0;j--){
			for(int k = 0;k<hexValues.length;k++){
				if(hexaStrTochar[j]== hexValues[k]){
					decimal+=(k*(Math.pow(16,counter)));
					counter++;
					break;
				}
			}

			//System.out.println(hexaStrTochar[j]);
		}
		System.out.println("Converted back to Decimal : "+String.valueOf(decimal));
	}
}
