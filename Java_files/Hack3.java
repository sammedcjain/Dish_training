import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Hack3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();

        for(int i=0;i<size-1;i++){
            int flag=0;
            for(int j=i+1;j<size;j++){

                if(arr[i]==arr[j]){
                    arr2.add(arr[i]);
                }else{
                    continue;
                }
            }

        }
        for(int i=0;i<size;i++){
            if(arr2.contains(arr[i])){
                continue;
            }else{
                arr3.add(arr[i]);
            }
        }
        System.out.println(arr3);
    }
}

