import java.util.Scanner;

public class perfectno {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int x =sc.nextInt();
		//int a=x;
		int sum =0;
		int count1=0;
		for(int j=1;j<=x;j++) {
			int a=j;
		for(int i=2;i<=j;i++) {
			if(j%i==0) {
				j=j/i;
				//System.out.print(" "+i);
				sum=sum+i;
			}
			
		}
		//System.out.println("");
		if(a==sum){
			count1++;
			//System.out.println(a+" is perfect no");
		}
	}System.out.println("total perfect no between 1 to "+x+ ":"+count1);
		}

}
