import java.util.Scanner; 

public class findMaxmin
{
    public static double findMax() 
    {
        Scanner scan= new Scanner(System.in); 
        System.out.print(" Enter a series of number of a character to quit."); 
        
        double largest= scan.nextDouble(); 
        double smallest= scan.nextDouble(); 
        while( scan.hasNextDouble())
        {
            double input= scan.nextDouble(); 
            if( input> largest) 
            {
                largest= input;
            }
         
       }
       return largest; 
        
    }
}     