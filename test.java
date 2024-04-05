class test{
	public static void main(String[] test){
		
		for (int i = 0;i<15;i++){
			if(i<9){
				int counter = 0;
				for(int j=0;j<40;j++){
					counter++;
					if(counter<=6 && i<9){
						if(counter%3==0){
							System.out.print("* ");
						}else{
							if(counter==6){
								System.out.print(" ");
							}else{
								System.out.print(" * ");
							}
						}
					}else{
						System.out.print("=");
					}
				}
				System.out.println();
			}
		}
	}
}