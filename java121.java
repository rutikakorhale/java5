

import java.util.*;

class program142
{
    public static void main(String arg[])
    
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0; int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter Size of Array");
        iSize = sobj.nextInt();
        
        
         System.out.println("Enter The Number You Want Search");
         iValue = sobj.nextInt();

         MyArray aobj = new MyArray(iSize);

         aobj.Accept();
         aobj.Display();
         bRet = aobj.LastOccurane();
        
          if(bRet == true)
          {
             System.out.println("Elemnts Is Present"+ bRet);
          }
          else
          {
            System.out.println("Element Is Not Present"+ bRet);
          }       

        sobj.close();
    }

}

class ArrayX
{
    protected
           int ilength;
           int iNo;
           int Arr[];
    
    public 
           ArrayX(int X)
           {
              ilength = X;
              Arr = new int[ilength];
           }   
     
         void Accept()
         {
            System.out.println("Enter Array Of Elments");
            Scanner sobj = new Scanner(System.in);

            for(int iCnt = 0; iCnt < ilength; iCnt++)
            {
                Arr[iCnt] = sobj.nextInt();
            }

            sobj.close();
         } 
         
         void Display()
         {
            System.out.println("Array Of Elments are");
        
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

    boolean LastOccurane()
    {
        int iCnt = 0;

        for(iCnt = ilength; iCnt > 0; iCnt--)
        {
            if((Arr[iCnt] == iNo))
            {             
                break;
            }
        }
        if(iCnt == ilength )
        {
            return false;
        }
        else
        {
            return true;
        }        

    }
}