

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
             Character Ch;          
            for(int iCnt = 1, ch = 'A'; iCnt <= iNo; iCnt++, ch++)
             {
                System.out.printf("A\t");
                
             }
                      
         }    

}