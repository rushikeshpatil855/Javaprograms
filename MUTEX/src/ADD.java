import java.lang.*;
public class ADD {
    static int add1(int value1,int value2)
    {
        return value1+value2;
    }
    public static void main(String args[])
    {
        System.out.println("Enter num1 and num2");
        int value1 = Integer.parseInt(args[1]);
        int value2 = Integer.parseInt(args[0]);
        int value3 = add1(value1,value2);
        System.out.println(value3);
        System.out.println("1 : "+value1);
        System.out.println("2 : "+value2);
    }
}