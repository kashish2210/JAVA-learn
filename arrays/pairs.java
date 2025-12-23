public class basic{
    public static void printpairs(int numbers[]){
        for(int i = 0 ; i < numbers.length ; i++){
            int current = numbers[i];
            for(int j = i +1 ;j < numbers.length;j++){
                System.out.print("(" + current +","+numbers[j]+ ") ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int arr[] = {4,47,35,65,2,82,4,51,1,10};
        printpairs(arr);
    }
}