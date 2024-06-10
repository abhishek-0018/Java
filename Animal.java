import java.util.*;
public class Animal{
    static void makesound(){
        
    }
    public static void main(String[] args) {
        double pi=3.14;
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();
        System.out.println("Area of a circle having "+r+" radius is: "+(pi*r*r));
        System.out.print("Circumfrence of a circle having "+r+" radius is: "+(pi*2*r));
        sc.close();
    }
}