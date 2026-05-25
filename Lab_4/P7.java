public class P7{
	public static void main(String []args){
		System.out.println("All 3 digits prime numbers: ");

		for(int i=100 ; i<=999 ; i++){
			int count = 0;
			for(int j=1 ; j<=i ; j++){
				if(i%j==0){
					count++;
				}
			}

			if(count==2){
				System.out.print(i + " ");
			}
		}
	}
}