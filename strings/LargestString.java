import java.util.*;
public class LargestString{
   public static void main(String[] args){
        String[] str = {"kashish" , "eva", "shrivastav", "mango ", "banana", "apple"};
        int largest = Integer.MIN_VALUE;
        String largestStr = "";
        for(int i = 0 ; i < str.length;i++){
            if(str[i].length() > largest){
                largest = str[i].length();
                largestStr = str[i];
            }
        }
        System.out.println("largest String : " +largestStr);
    }
}