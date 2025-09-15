import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner ss = new Scanner(System.in);
	    int n = ss.nextInt();
	    int a[] = new int[n];
	    System.out.println("ENTER ARRAY ELEMENT :");
	    for(int i=0;i<n;i++){
	        a[i]=ss.nextInt();
	    }
	    for(int i=0;i<n;i++){
	        System.out.println(a[i] + " ");
	    }   
	    System.out.println();
	    int t =0;
	    for(int i=0;i<=n;i++){
	         for(int j=i+1;i<n;j++){
	    if(a[i]>a[j]){
	        t=a[j];
	        a[j]=a[j];
	        a[i]=t;
	  
	    }          
	         }
	    for(int i=0;i<n;i++){
	    	System.out.println(a[i] + " ");
	}
}
}
}
