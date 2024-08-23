import java.io.*;
import java.util.*;
//Lexiographic order in substring program
public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = sc.nextInt();
        String[] arr = new String[s.length() - len+1 ];
        for (int i = 0; i <= s.length() - len; i++) {
            String temp="";
            int j=i;
            while(j<len+i){
                temp=temp+""+s.charAt(j);
                j++;
            }
            arr[i]=temp;
            System.out.println(arr[i]);
        }
        System.out.println();
        String smallest=null;
        String largest=null;
        for (String i : arr) {
            if(smallest==null|| i.compareTo(smallest)<0){
                smallest=i;
            }
            if(largest==null|| i.compareTo(largest)>0){
                largest=i;
            }
        }
        System.out.println(smallest+"\n"+largest);

    }
}