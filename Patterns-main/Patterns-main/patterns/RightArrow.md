import java.util.*;
public class RightArrow
{
	public static void main(String[] args) {
	    Scanner ip=new Scanner(System.in);
	    int n=ip.nextInt();
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=i;j++){
	            System.out.print("* ");
	        }
	        System.out.println(" ");
	    }
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=n-i;j++){
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	
	}
}
