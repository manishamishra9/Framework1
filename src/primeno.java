import java.util.Scanner;

public class primeno {

	public static void main(String[] args) {
      
		
		Scanner sc= new Scanner(System.in);
		int x=sc.nextInt();
		int sum=0;
		int count1=0;
		System.out.println("prime no are :");
		for(int j=1;j<=x;j++) {
			int count=0;
        
		for(int i=2;i<=j;i++) {
			if(j%i==0) {
				count++;
				
			}}
			if(count==1) {
				
				System.out.print(j+"  ");
				sum=sum+j;
				count1++;
			}
		
		}
		System.out.println("");
		System.out.println("sum of prime nos are -> "+sum);
	}

}
