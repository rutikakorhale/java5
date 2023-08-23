

import java.util.*;

import javax.swing.Icon;

class program140
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0; 
        float fRet = 0.0f;
        System.out.println("Enter Size of Array");
        iSize = sobj.nextInt();

        MyArray aobj = new MyArray(iSize);

        aobj.Accept();
        aobj.Display();
        fRet = aobj.Average();

        System.out.println("Average Is :"+fRet);

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

    float Average()
    {
        int iSum  = 0;
        for(int iCnt = 0; iCnt < ilength; iCnt++)
        {
            iSum = iSum + Arr[iCnt];

        } 
        return((float)iSum / (float)ilength);

    }
}