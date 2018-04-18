
import java.util.Scanner;
class helloworld
{
	public static void main(String[] args)
	{
		System.out.println("HELLO WORLD ");
// 		int sum;
// 		int a=5,b=6;
// 		sum=a+b;
// 		System.out.println(sum)
    
		 int n1=0,n2=1,n3,i,count=10;    
		 System.out.print(n1+" "+n2);//printing 0 and 1    
    
		 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
 		 System.out.print(" "+n3);    
 		 n1=n2;    
	  	n2=n3;    
		 }
		int i, j;
		int n=5;
 
        // outer loop to handle number of rows
        //  n in this case
        for(i=0; i<n; i++)
        {
 
            //  inner loop to handle number of columns
            //  values changing acc. to outer loop  
            for(j=0; j<=i; j++)
            {
                // printing stars
                System.out.print("* ");
            }
 
            // ending line after each row
            System.out.println();
        }
		
  
 
	
}
