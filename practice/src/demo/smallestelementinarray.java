package demo;

public class smallestelementinarray {
public static void main(String[] args) {
	int a[]= {10,12,45,78,96,45};
	int max=a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]>max) {
			max=a[i];
			
		}
	}
	System.out.println( "largest element in array"+max);
}
}
