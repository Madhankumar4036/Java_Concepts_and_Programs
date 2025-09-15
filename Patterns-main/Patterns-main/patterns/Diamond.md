```` java[]
import java.util.*;
public class Diamond
{
	public static void main(String[] args) {
	    Scanner ip=new Scanner(System.in);
	    int n=ip.nextInt();
	    for(int i=1;i<=n;i++){
	        for(int sp=1;sp<=n-i;sp++){
	            System.out.print("  ");
	        }
	        for(int j=1;j<=(2*i)-1;j++){
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	     for(int i=n-1;i>=1;i--){
	        for(int sp=1;sp<=n-i;sp++){
	            System.out.print("  ");
	        }
	        for(int j=1;j<=(2*i)-1;j++){
	            System.out.print("* ");
	        }
	        System.out.println(" ");
	    }
	
	}
}
````
