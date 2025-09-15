import java.util.*;
public class MirrorInverseRight
{
	public static void main(String[] args) {
	    Scanner ip=new Scanner(System.in);
	    int n=ip.nextInt();
	    for(int i=n;i>=1;i--){
	        for(int sp=1;sp<=n-i;sp++){
	            System.out.print("  ");
	        }
	        for(int j=1;j<=i;j++){
	            System.out.print("* ");
	        }
	        System.out.println(" ");
	    }
	
	}
}
