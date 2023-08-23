

import java.util.*;

class program141
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
        bRet = aobj.SearchNum(iValue);

        if(bRet == true)
        {
          System.out.println("Elemnts Is Present ");
        }
        else
        {
          System.out.println("Element Is Not Present");
        }
        
        sobj.close();
    }

}

class ArrayX
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

    boolean SearchNum(int iNo)
    {
        int iCnt = 0;
        boolean bFlage = false;
        for(iCnt = 0; iCnt < ilength; iCnt++)
        {
            if((Arr[iCnt] == iNo))
            {
                bFlage = true;
                break;
            }
        }
        return  bFlage;

    }
}