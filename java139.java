

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
                     
            for(int iCnt = iNo; iCnt >= 1; iCnt--)
             {
                System.out.printf(iCnt*2 + " ");
                            
             }
             System.out.println();
             
             
         }    

}