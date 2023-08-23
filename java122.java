import java.util.Scanner;

class program175
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        System.out.println("Enetr Farequency Of String");
        iValue = sobj.nextInt();
        
        PatternX obj = new PatternX(iValue);

        obj.Display();

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

}

class PatternX extends Pattern
{
    PatternX(int iNo)
    {
        super(iNo);
    }

    void Display()
    {
        for(int iCnt = 0; iCnt <= iNo; iCnt++)
        {
            System.out.printf("*\t");
        }
    }
}