import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class Hack2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int ind=-1;

        for(int i=0;i<size;i++){
            ind=-1;
            int j;

                for (j = 0; j < size; j++) {
                    if(i!=j) {
                        if (arr[i] == arr[j]) {
                            ind = -1;

                            break;
                        } else {
                            ind = j;
                        }
                    }
                }

            if(ind!=-1){
                System.out.println("First non repeative number = "+arr[i]);
                break;
            }

        }
        if(ind==-1 && arr.length!=1){
            System.out.println("all nums are rep number");
        }else if(arr.length==1){
            System.out.println("only 1 num is present, therefore the first non rep number is "+arr[0]);
        }

    }
}

