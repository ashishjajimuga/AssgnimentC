import java.util.*;

public class StringReverse
{
    
    public static void main(String Arr[])
    {
        String str = null;
        Scanner sobj = new Scanner(System.in);
        str = sobj.nextLine();
        String iRet= Reverse(str);
        
        System.out.println("Reverse String is :"+ iRet );

    }
    static String Reverse(String str1)
    {
        String str2 = new String();
        char ch;

        for(int i =0; i <= str1.length();i++)
        {
            ch = str1.charAt(i);
            str2= ch +str2;
        }
        return str2;
    }
}