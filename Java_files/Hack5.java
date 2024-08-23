import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //strs = ["eat","tea","tan","ate","nat","bat"]
        ArrayList<String> arrl=new ArrayList<>();
        for(String i:strs){
            char[] temp=i.toCharArray();
            Arrays.sort(temp);
            String tempp="";
            for(char k:temp){
                tempp=tempp+k;
            }
            //System.out.println(tempp);
            arrl.add(tempp);
        }
        ArrayList<List<String>> arr=new ArrayList<>();

        return arr;
    }

}

public class Hack5{
    public static void main(String[] args){
        Solution so=new Solution();
        System.out.println(so.groupAnagrams(new String[]{"eat","tan","tea","ate"}));
    }
}