public class Swap_two_variable {
    public static void main(String[] args){
        int a=2;
        int b=3;
        System.out.println("Before swapping a="+a+" and b="+b);
        int c=a;
        a=b;
        b=c;
        System.out.println("After swapping using 3rd variable, a="+a+" and b="+b);
        a+=b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping without using 3rd variable, a="+a+" and b="+b);
    }
}
