public class basic{
    public static void main(String args[]){
        int marks[] = new int[1000];
        for(int i = 0 ; i < marks.length;i++){
            marks[i] = i+1;
        }
        for(int i = 0 ; i < marks.length;i++){
            System.out.print(marks[i]  +" ");
        }
    }
}