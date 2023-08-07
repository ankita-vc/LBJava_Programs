// Accept N numbers from user and display addition of elements

import java.util.*;

class ArrayX
{
    public int Arr[];
    public ArrayX(int iSize)
    {
        Arr= new int[iSize];   // memory allocation for array
    }

    public void Accept()
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("Enetr the elements:");

        for(int iCnt= 0; iCnt < Arr.length; iCnt++)  // <----- by using length property
        {
            Arr[iCnt]= sobj.nextInt();
        }
    }

    public void Display()
    {
        System.out.println("Elements of array are:");

        for(int iCnt= 0; iCnt < Arr.length; iCnt++)
        {
            System.out.print(Arr[iCnt] + "\t");
        }
        System.out.println();
    }

    public int Addition()
    {
        int iSum= 0;

        for(int iCnt= 0; iCnt < Arr.length; iCnt++)
        {
            iSum= iSum + Arr[iCnt];
        }
        return iSum;
    }
}


class Program346
{
    public static void main(String Arg[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("Enetr number of elements:");
        int iSize = sobj.nextInt();

        ArrayX aobj= new ArrayX(iSize);

        aobj.Accept();
        aobj.Display();

        int iRet= aobj.Addition();

        System.out.println("Addition of all elements is: " + iRet);
    }
}