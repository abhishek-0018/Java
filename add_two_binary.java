import java.util.Scanner;
public class add_two_binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        int n=Integer.parseInt(a,2);
        int m=Integer.parseInt(b,2);
        int ans=(n+m);
        String ans1=Integer.toBinaryString(ans);
        System.out.print(ans1);
        sc.close();
    }
}
