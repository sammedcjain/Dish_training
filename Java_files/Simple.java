import java.util.*;

public class Simple {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arrl=new ArrayList<>();
        for(int i=2;i<n;i++){
            int flag=0;
            for(int j=2;j<i/2;j++){
                if(i%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                arrl.add(i);
            }
        }
        System.out.println(arrl);
    }
}
