// Accept number and return multiplication of even factors

import java.util.*; 

class Numbers
{
    public int DisplayEvenFactorial(int iValue)
    {
        int iMult= 1;

        for(int iCnt= 2; iCnt <= iValue; iCnt+=2)  
        {
            if(iValue % iCnt == 0)
            {
                iMult= iMult * iCnt;
            }
        }
        
        if(iMult == 1)    // <----------------
        {
            return 0;
        }
        else
        {
            return iMult;
        }
    }
}

class Program335
{
    public static void main(String Arg[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("enter first number:");
        int iNo= sobj.nextInt();

        Numbers nobj= new Numbers();
        int iRet= nobj.DisplayEvenFactorial(iNo);

       System.out.println("Factorail of even numbers is: "+iRet);

        sobj.close();
    }
}