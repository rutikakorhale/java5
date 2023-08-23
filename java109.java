

import java.util.*;

class program111
{
   public static void main(String arg[])
   {
      Scanner sobj = new Scanner(System.in);
      
      int iNo = 0;
      float fRet = 0.0f;

      System.out.println("Enter Number");
      iNo = sobj.nextInt();

      Digit dobj = new Digit(iNo);

      fRet = dobj.Average();

      System.out.println("Average Is :"+fRet);


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
   
   float Average()
   {
       int iDigit = 0; float fSum = 0.0f; int iCount = 0;

       while(iNo != 0)
       {
         iDigit = iNo % 10;
         fSum = fSum + iDigit;
         iCount++;
         iNo = iNo / 10;
       }
       return((float)fSum / (float)iCount);
   }     

}




































