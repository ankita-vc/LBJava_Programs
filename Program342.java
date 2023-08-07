// Accept number and check whether the number is amstrong number or not

import java.util.*; 

class Digits
{
    int CountDigits(int iNo)
    {
        int iCount= 0;

        while(iNo != 0)
        {
            iCount++;
            iNo= iNo/10;
        }
        return iCount;
    }

    int Power(int X, int Y)
    {
        int iPower= 1; 

        for(int iCnt= 1; iCnt <= Y; iCnt++)
        {
            iPower= iPower * X;
        }
        return iPower;
    }

    boolean CheckAmstrong(int iNo)
    {
        int iDigit= 0;
        int iCount= 0;
        iCount= CountDigits(iNo);

        int iTemp= iNo;
        int iSum= 0;

        while(iNo != 0)
        {
            iDigit= iNo % 10;
            int iRet= Power(iDigit, iCount);
            iSum= iSum + iRet;
            iNo= iNo/10;
        }

        if(iSum == iTemp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Program342
{
    public static void main(String Arg[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("enter first number:");
        int iValue= sobj.nextInt();

        Digits dobj= new Digits();
        boolean bRet= dobj.CheckAmstrong(iValue);

       if(bRet == true)
       {
            System.out.println("Number is Amstrong");
       }
       else
       {
            System.out.println("Number is not Amstrong");
       }

        sobj.close();
    }
}


