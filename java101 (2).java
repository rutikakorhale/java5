

import java.util.*;

class program83
{
   public static void main(String arg[])
   {
      Scanner sobj = new Scanner(System.in);

      int iNo1 = 0, iNo2 = 0;
      boolean bRet = false;

      System.out.println("Enter Number");
      iNo1 = sobj.nextInt();

      System.out.println("EnterNumber You Want search NumberShould be(0-9)");
      iNo2 = sobj.nextInt();

      Digit dobj = new Digit(iNo1, iNo2);

      bRet = dobj.SearchDigit();

      if(bRet == true)
      {
           System.out.println("Number Is Present "+iNo2);

      }
      else 
      {
         System.out.println("Number Is Not Present "+iNo2);
      }
   }
}

class Digit
{
   private
          int iNo1;
          int iNo2;
   
   public 
          Digit(int X, int Y)
          {
            iNo1 = X;
            iNo2 = Y;
          }       
   
          boolean SearchDigit()
          {
            

             if((iNo2 < 0)||(iNo2 > 9))
             {
                System.out.println("Number Should Be In betwwen Range (0-9)");
                return false;
                
             }

             if(iNo1 < 0)
             {
               iNo1 = -iNo1;
             }
             
              int iDigit = 0;
              while(iNo1 != 0)
              {

                iDigit = iNo1 % 10;

                if(iDigit == iNo2)
                {
                   break;
                }
                iNo1 = iNo1/ 10;
               }   

                if(iDigit == iNo2)
                {
                  return true;
                }
                else
                {
                   return false;
                }
             

          }
         
}