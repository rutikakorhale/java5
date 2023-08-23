

import java.util.*;

import javax.imageio.ImageReadParam;

class program83
{
   public static void main(String arg[])
   {
      Scanner sobj = new Scanner(System.in);

      int iNo1 = 0;
      int iRet = 0;

      System.out.println("Enter Number");
      iNo1 = sobj.nextInt();

      Digit dobj = new Digit(iNo1);

      iRet = dobj.Reverse();

      System.out.println("Reverse Is :"+iRet);
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
   
          int Reverse()
          {

             if(iNo1 < 0)
             {
               iNo1 = -iNo1;
             }
             
               int iDigit = 0;
               int iReverse = 0;
               while(iNo1 != 0)
              {

                iDigit = iNo1 % 10;
                iReverse = (iReverse*10)+iDigit;
                iNo1 = iNo1/ 10;
               }
               return iReverse;   
               
          }
         
}