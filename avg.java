import java.util.*;
public class avg {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.print("Average of "+a+","+b+" and "+c+" is="+(a+b+c)/3);
        sc.close();
    }
}
