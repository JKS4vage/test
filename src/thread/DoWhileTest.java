package thread;

public class DoWhileTest {
	public static void main(String[] args) {
	int i=0;
	int sum=0;
	do{
		if(i%2==0) {
			sum+=i;
		}
		i++;
		
	}while(i<=100);
	System.out.println(sum);
	}
}