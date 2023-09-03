public class Main {
    public static void main(String[] args) {
        int [] array = {1,2,3,10,10,10,10,10,5};
        float total = 0;
        float avg = 0;
        float sum = 0;
        for (int i = 0; i < array.length; i++){
            total = sum += array[i];
        }
        avg = total/ array.length;
        System.out.println(avg);
    }
}