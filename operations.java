import java.util.*;
public class operations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Sum of "+a+" and "+b+" is="+(a+b));
        System.out.println("Multiplication of "+a+" and "+b+" is="+(a*b));
        System.out.println("Subtraction of "+a+" and "+b+" is="+(a-b));
        System.out.println("Division of "+a+" and "+b+" is="+(a/b));
        System.out.print("Remainder of "+a+" and "+b+" is="+(a%b));
        sc.close();
    }
}
