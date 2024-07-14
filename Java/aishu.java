import java.util.Scanner;
public class aishu{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt();
        int[] arr=new int[size];
        int i;
        for(i=0;i<size;i+=1){
            arr[i]=obj.nextInt();}
        int temp,j;
        for(j=0;j<4;j+=1){
            temp=arr[size-1];
            for(i=size-1;i>=1;i-=1)
                arr[i]=arr[i-1];
             arr[0]=temp;
        }
        for(i=0;i<size;i+=1)
        System.out.print(arr[i]+" ");
        }      
}

