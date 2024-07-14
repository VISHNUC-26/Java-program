import java.util.*;
public class primenumber{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    long a=sc.nextLong();
    long b;
    for(b=2;b*b<=a;b+=1){
        if(a%b==0)
        break;
    
    }
    if(b*b>a)
    System.out.println("prime number");
    else
    System.out.println("not prime");
    }
    }
