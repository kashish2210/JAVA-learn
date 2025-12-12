import java.util.*;
class Pattern01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for(int line=1; line <= size; line++){
            for(int j =line; j >= 1; j-- ){
                if(j%2==0){
                    System.out.print("0");
                }else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}