// Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it. 

import java.util.Random;

public class ShuffleArray {

    public static void main(String[] args){

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        shuffleArray(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void shuffleArray(int[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
}