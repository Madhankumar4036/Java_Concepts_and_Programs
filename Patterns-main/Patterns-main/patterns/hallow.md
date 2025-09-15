import java.util.*;
public class hallow
{
	public static void main(String[] args) 
	{
	    
	    Scanner ip=new Scanner(System.in);
	    int n=ip.nextInt();
	    for(int i=1;i<=n;i++){
	        for(int sp=1;sp<=n-i;sp++){
	            System.out.print("  ");
	        }
	        for(int j=1;j<=(i*2)-1;j++){
	            if(i==1 || i==n || j==1 || j==(i*2)-1){
	                System.out.print("* ");
	        }
	        else{
	            System.out.print("  ");
	        }
	    }
        System.out.println();	
	 }
   }   
}