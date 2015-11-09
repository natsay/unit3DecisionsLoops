import java.util.Scanner; 

/**
 * Write a description of class NumericalMethods here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumericalMethods
{
  
    public int Calculate() 
    {
        Scanner s= new Scanner(System.in); 
        System.out.print("Enter a number: "); 
        int n= s.nextInt(); 
        System.out.print("Do you have anymore numbers(y/n: "); 
        String ans= s.nextLine();
        int fold1=1; 
        int fold2=1;
        while (ans=="y") 
        {
            fold2=fold1; 
            int fnew=fold1+fold2; 
        }
       
    }

    
    
    
    
    
}
