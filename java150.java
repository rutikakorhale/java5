
///////////////////////////////////////////
//////////////////////////////////////////
//
//     PATTERN PRITING..........
//
/////////////////////////////////////////
////////////////////////////////////////

import java.util.*;

class program251
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo1 = 0, iNo2 = 0;

        System.out.println("Enter Row");
        iNo1 = sobj.nextInt();

        System.out.println("Enter Colume");
        iNo2 = sobj.nextInt();

        pattern pobj = new pattern(iNo1, iNo2);
        pobj.Display();

        sobj.close();
    }    
}

class pattern
{
    protected 
             int iRow;
             int iCol;
    
    public 
             pattern(int X, int Y)
             {
                iRow = X;
                iCol = Y;
             }
            
             void Display()
             {
                int i = 0, j = 0;
                
                for(i = 1; i <= iRow; i++)
                {
                    for(j = 1; j <= iCol; j++)
                    {
                        if((j % 2) == 0)
                        {
                            System.out.printf("*" + " ");
                        }
                        else 
                        {
                            System.out.printf(j + " ");
                        }
                    }
                    System.out.println();
                }
                

             }

}
