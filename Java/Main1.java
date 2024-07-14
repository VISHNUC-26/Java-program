import java.util.*;
class add{
    void add(int a,int b){
        System.out.println(a+b);
    }
}
class sub extends add{
    void sub(int a,int b){
        System.out.println(a-b);
    }
}
class mul extends sub{
    void mul(int a,int b){
        System.out.println(a*b);
    }
}

class div extends mul{
    void div(int a,int b){
       System.out.println(a/b);
    }
}


class Main1{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        div d=new div();
        d.add(a, b);
        d.sub(a,b);
        d.mul(a,b);
        d.div(a,b);
    }
}