

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

      iRet = dobj.Maximum();

      System.out.println("largest Digit Is "+iRet);

      

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
    
   int Maximum()
   {
      int iDigit = 0;
      int iMax = 0;

      if(iNo < 0)
      {
         iNo = -iNo;
      }

      while(iNo != 0)
      {
         iDigit = iNo % 10;

         if(iDigit > iMax)
         {
            iMax = iDigit;
         }
         iNo = iNo/10;
      }
      return iMax;
   }  
     
      

}
