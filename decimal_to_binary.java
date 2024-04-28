import java.util.*;
public class decimal_to_binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String ans1=Integer.toBinaryString(a);
        System.out.println(ans1);
        sc.close();
    }
}
