//Input = 1234567
//output = 7


import java.util.*;

public class CountDigit
{
    public static int CountD(int iValue)
    {
        int Digits = 0;
        int iCnt = 0;
        if(iValue < 0)
        {
            iValue = -iValue;
        }
        if(iValue < 9)
        {
            return 1;
        }

        while(iValue != 0)
        {
            Digits = iValue %10;
            iValue = iValue/10;
            iCnt++;
        }
        return iCnt;


    }
    public static void main(String Arr[])
    {
        int iNo = 0;
        int iRet = 0;

        System.out.println("Enter the Number:\n");
        Scanner sobj = new Scanner(System.in);
        iNo = sobj.nextInt();

        iRet = CountD(iNo);

        System.out.println("Count of number is :" + iRet );
   
    }
}