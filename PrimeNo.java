import java.util.*;

public class PrimeNo
{
    public static void main(String Arr[])
    {
        int iNo = 0;
        
        System.out.println("Please Enter the Number :\n");
        Scanner sobj = new Scanner(System.in);
        iNo = sobj.nextInt();
        CheckPrimeNo(iNo);

    }

    static void CheckPrimeNo(int iValue)
    {
        int iCount = 0;
        int flag = 0;
        if((iValue == 0) || (iValue == 1))
        {
            flag = 1;
        }

        for(iCount = 2; iCount <= iValue/2; iCount++)
        {
            if(iValue % 2 == 0)
            {
                flag = 1;
                break;
            }
        }
        
        if(flag == 0)
        {
            System.out.println("Number is prime Number");
        }
        else 
        {
            System.out.println("Number is NoN prime Number");
        }
    }
}