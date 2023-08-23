

import java.util.*;

class program239
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter Symbol Frequency");
        iValue = sobj.nextInt();
        Pattern pobj = new Pattern(iValue);

        pobj.Display();

        sobj.close(); 
    }
}

class Pattern
{
    protected 
             int iNo;

    public
           Pattern(int X)
           {
                iNo = X;
           }         
        
         void Display()
         {
             int iCnt = 0;         
             for(iCnt = 1; iCnt < iNo; iCnt++)
             {
                System.out.printf(iCnt+ " ");
             }

             for(iCnt = iNo; iCnt > 0; iCnt--)
             {
                System.out.printf(-iCnt+ " ");
             }
             System.out.println();
         }    

}