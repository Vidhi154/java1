//import java.util.Scanner;
public class argp{
	public static void main(String[] args){
//Scanner sc = new Scanner(System.in);


int x, y, z; 
System.out.println("entered number is :");
//int n =sc.nextInt();
//System.out.println("the pythagorean triples from 1 to n where n is : " + " " + n+ " " + "are -");
for(String ea : args){
int n = Integer.parseInt(ea);
System.out.println(n);
System.out.println("the pythagorean triples from 1 to n where n is : " + " " + n+ " " + "are -");

        for(x = 1; x < n; x++)
        {
            for(y = 1; y < n; y++)
            {
                for(z = 1; z < n; z++)
                {
                    int a= x, b=y, c=z;

                    if((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2))
                    {
                        if(a < b)
                        {
                            System.out.println(x +"  "+ y +"   "+ z);
                        }
                    }
                }
            }
        } 
}      
}
}