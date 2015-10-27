public class FindFirstMatch 
{  
    // returns postion of the first sapce in the specified strong or -1 if the string has not spaces
   public static int findFirstSpace(String str) 
   {
        boolean found= false; 
        int position=0;
        
        
        while( !found && position< str.length()) 
      {
            char ch= str.charAt(position); 
        if (ch==' ') 
        {
                found= true; 
                
        }
        else
        {
            position++; 
        }    
        
      }
      if (found)
        {
            return position; 
            
        }
        else
        {
            return -1; 
        }
   }
}   
        