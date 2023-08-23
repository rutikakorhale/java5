
import java.util.*;

class program135
{
    public static void main(String arg[])
    {
       Scanner sobj = new Scanner(System.in);

       int iSize = 0, iRet = 0; 
       
       System.out.println("Enter Size Of Array");
       iSize = sobj.nextInt();

       MyArray aobj = new MyArray(iSize);

       aobj.Accept();
       aobj.Display();
       iRet = aobj.OddCount();

       System.out.println("Count Is :"+iRet);
      
    }
}

class ArrayX9
{
   protected
          int ilength;
          int Arr[];
   
   public 
          ArrayX(int X)
          {
             ilength = X;
             Arr = new int[ilength];
          }
          
          void Accept()
          {
              System.out.println("Enter The  Array");
              Scanner sobj = new Scanner(System.in);

              for(int iCnt = 0; iCnt < ilength; iCnt++)
              {
                  Arr[iCnt] = sobj.nextInt();
              }
          }

          void Display()
          {
              System.out.println("Array of Elements Are");
              
              for(int iCnt = 0; iCnt < ilength; iCnt++)
              {
                  System.out.println(Arr[iCnt]);
              }

          }
}

class MyArray extends ArrayX
{
   MyArray(int ilength)
   {
      super(ilength);
   }

   int OddCount()
   {
      int iCount = 0;

      for(int iCnt = 0; iCnt < ilength; iCnt++)
      {
            if((Arr[iCnt] % 2) != 0)
            {
               iCount++;              
            }
      }
      return iCount;
   }
}