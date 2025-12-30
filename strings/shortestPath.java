import java.util.*;

public class shortestPath{
    public static void main(String args[]){
        int x=0;
        int y =0;
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i = 0 ; i < str.length(); i++){
            if(str.charAt(i)=='w'){
                x--;
            }
            if(str.charAt(i)=='e'){
                x++;
            }
            if(str.charAt(i)=='n'){
                y++;
            }
            if(str.charAt(i)=='s'){
                y--;
            }

        }
        System.out.println("your current cor aare : ("+x + ","+ y +")" );
        double shortDis= Math.sqrt(y*y + x*x);
        System.out.println("shortest path from(0,0):"+ shortDis );

    }
}