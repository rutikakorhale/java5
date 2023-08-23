

import java.util.*;

class program83
{
   public static void main(String arg[])
   {
      Scanner sobj = new Scanner(System.in);

      int iNo1 = 0;
      boolean bRet = false;

      System.out.println("Enter Number");
      iNo1 = sobj.nextInt();

      Digit dobj = new Digit(iNo1);

      bRet = dobj.SearchDigit();

      if(bRet == true)
      {
           System.out.println("8 Is Present ");

      }
      else 
      {
         System.out.println("8 Is Not Present ");
      }
   }
}

class Digit
{
   private
          int iNo1;
   
   public 
          Digit(int X)
          {
            iNo1 = X;
            
          }       
   
          boolean SearchDigit()
          {

             if(iNo1 < 0)
             {
               iNo1 = -iNo1;
             }
             
               int iDigit = 0;
               while(iNo1 != 0)
              {

                iDigit = iNo1 % 10;

                if(iDigit == 8)
                {
                   break;
                }
                iNo1 = iNo1/ 10;
               }   

                if(iDigit == 8)
                {
                  return true;
                }
                else
                {
                   return false;
                }
             

          }
         
}