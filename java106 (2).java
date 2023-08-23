

import java.util.*;

class program101
{
   public static void main(String arg[])
   {
      Scanner sobj = new  Scanner(System.in);

      int iNo = 0;
      boolean bRet = false;

      System.out.println("Enter Number");
      iNo = sobj.nextInt();

      Digit dobj = new Digit(iNo);

      bRet = dobj.ChkPallindrom();

      if(bRet == true)
      {
           System.out.println("It is a pallindrom");
      }
      else
      {
          System.out.println("It is Not a pallindrom");
      }

   }
}

class Digit
{
    private
          int iNo;

    public 
         Digit(int X)
         {
            iNo = X;
         }       
    
   boolean ChkPallindrom()
   {
      int iDigit = 0;
      boolean bRet = false;
      int iReverse = 0;
      int iTemp = iNo;
      
      if(iNo < 0)
      {
         iNo = -iNo;
      }

      while(iNo != 0)
      {
         iDigit = iNo % 10;

         iReverse = (iReverse * 10)+iDigit;
         iNo = iNo/10;

      }

      if(iReverse == iTemp)
      {
            return true;
      }
      else
      {
          return false;
      }
   }  
     
      

}
