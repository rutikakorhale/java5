

import java.util.*;

class program101
{
   public static void main(String arg[])
   {
      Scanner sobj = new  Scanner(System.in);

      int iNo = 0;
      int iRet = 0;

      System.out.println("Enter Number");
      iNo = sobj.nextInt();

      Digit dobj = new Digit(iNo);

      iRet = dobj.Minimum();

      System.out.println("Smallest Digit Is "+iRet);

      

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
    
   int Minimum()
   {
      int iDigit = 0;
      int iMin = 9;

      if(iNo < 0)
      {
         iNo = -iNo;
      }

      while(iNo != 0)
      {
         iDigit = iNo % 10;

         if(iDigit < iMin)
         {
            iMin = iDigit;
         }
         iNo = iNo/10;
      }
      return iMin;
   }  
     
      

}
