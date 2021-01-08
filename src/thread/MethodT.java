package thread;

public class MethodT {
	public static void f(int s) {
		for(int i=1;i<=s;i++) {
			for( int j=1;j<=i;j++) {
				System.out.print(j+"*"+i+"="+i*j);
				System.out.print("\t");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		f(9);
		int temp;
		int [] arr =new int [5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100);
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("--------------");
		for(int i=0;i<arr.length/2;i++) {
			temp=arr[4-i];
			arr[4-i]=arr[i];
			arr[i]=temp;
			
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		}
	}

