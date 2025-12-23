public class arg{
    public static void update(String args[]){
        int marks[] = new int[1000];
        for(int i = 0 ; i < marks.length;i++){
            marks[i] = i+1;
        }
    }
    public static void main(String args[]){
        int marks[] = {76,87,97};
        for(int i = 0 ; i < marks.length;i++){
            marks[i] = marks[i]+20;
        }
        for(int i = 0 ; i < marks.length;i++){
            System.out.print(marks[i]  +" ");
        }
        System.out.println();
    }
}