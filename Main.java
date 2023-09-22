public class Main {
    public static void main(String[] args) {
        double [] array ={2,3,4,5};
        double result = 0 ;
        for(int i = 0 ; i < array.length ; i++){
            result += 1/array[i];
        }
        System.out.println(array.length/result);
    }
}