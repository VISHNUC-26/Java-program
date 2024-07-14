import java.util.Scanner;
public class array{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt();
        int[] arr=new int[size];
        int i,sum=0;
        for(i=0;i<size;i+=1){
            arr[i]=obj.nextInt();
        }
        int key=obj.nextInt();
        int f=0,l=size-1,mid;
        while(f<=l){
            mid=(f+l)/2;
            if(arr[mid]<key)
            

        }
        
        }   
    }