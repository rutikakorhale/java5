
import java.util.*;

class program133
{
   public static void main(String Arg[])
   {
      Scanner sobj = new Scanner(System.in);

      int iSize = 0;

      System.out.println("Enter Size Of Array");
      iSize = sobj.nextInt();

      ArrayX aobj = new ArrayX(iSize);
      
      aobj.Accept();
      aobj.Display();
   }
}

class ArrayX
{
    private
          
          int Arr[];
          int ilength;
    
    public  
          ArrayX(int iNo)
          {
             ilength = iNo;
             Arr = new int[ilength];
          }
     
    void Accept()
    {
      System.out.println("Enter the Array Of Character");
      Scanner sobj = new Scanner(System.in);

      for(int iCnt = 0; iCnt < ilength; iCnt++)
      {
         Arr[iCnt] = sobj.nextInt();
      }          
    }
    
    
    void Display()
    {
      System.out.println("Array Of Character Are :");

      for(int iCnt = 0; iCnt < ilength; iCnt++)
      {
         System.out.println(Arr[iCnt]);
      }          
    }
    


}
