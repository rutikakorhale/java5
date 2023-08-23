

import java.util.*;

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

      iRet = dobj.OddCount();

      System.out.println("odd Count Is :"+iRet);
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
   
          int OddCount()
          {

             if(iNo1 < 0)
             {
               iNo1 = -iNo1;
             }
             
               int iDigit = 0;
               int iCount = 0;
               while(iNo1 != 0)
              {

                iDigit = iNo1 % 10;

                if((iDigit % 2) != 0)
                {
                   iCount++;
                }
                iNo1 = iNo1/ 10;
               }
               return iCount;   
               
          }
         
}