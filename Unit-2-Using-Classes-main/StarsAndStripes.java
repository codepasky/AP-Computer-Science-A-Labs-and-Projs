//(c) A+ Computer Science
//www.apluscompsci.com
//Name - paschal

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
      out.println("********************");
   }

   public void printTwentyDashes()
   {
      out.println("--------------------");
   }

   public void printTwoBlankLines()
   {
      out.println();
      out.println();
   }
   
   public void printASmallBox()
   {	
      out.println("********************");
      out.println("*                  *");
      out.println("*                  *");
      out.println("********************");
   }
 
   public void printABigBox()
   {	
      out.println("********************");
      for(int i=0; i<6; i++)
         out.println("*                  *");
      out.println("********************");
   }   
}