import java.util.*;
public class PascalTriangle
{
	public static void main(String[] args) {
	    Scanner ip=new Scanner(System.in);
	    int n=ip.nextInt();
	    for(int i=1;i<=n;i++){
	        int val=1;
	        for(int j=1;j<=i;j++){
	            System.out.print(val + " ");
	            val=val*(i-j)/j;
	        }
	        System.out.println();
	    }
	
	}
}
