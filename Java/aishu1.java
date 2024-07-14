import java.util.*;
class outer{
    private int num=20;
    void display(){
        System.out.println("i am outer class ");
    }
    class inner{
        void print(){
            System.out.println("i am inner class "+num);
        }
    }
}
class a{
    public static void main(String[] args){
        outer obj=new outer();


        
        //System.out.println(obj.num);
        obj.display();
        outer.inner obj1=obj.new inner();
        obj1.print();
    }
}