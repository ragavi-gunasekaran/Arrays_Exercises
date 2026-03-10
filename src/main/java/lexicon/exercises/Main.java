package lexicon.exercises;

import java.util.Arrays;

public class Main {

    static void main() {

        /*1. Write a program which will store elements in an array of type `int` and print it out.
           Expected output: `11 23 39` etc.*/
        int abc[] = {11,23,39};
        for(int x = 0 ; x < 3 ; x++) {
            System.out.print(abc[x] + "  ");
        }
        System.out.println();

        /*2. Create a program and create a method with name `indexOf` which will find and return the index of an element in the
            array. If the element doesn’t exist your method should return `-1` as value.
            Expected output: `Index position of number 5 is: 2`*/
            int number[] = {1,2,3,4,5,6,7};
            indexOf(number);

        /*3. Write a program which will sort a string array.
                Expected output:
        String array: `[Paris, London, New York, Stockholm]`
        Sorted string array: `[London, New York, Paris, Stockholm]`*/
        String places[] = {"Paris", "London", "New York", "Stockholm"};
        System.out.println(Arrays.toString(places));
        Arrays.sort(places);
        System.out.println(Arrays.toString(places));
    }

    static void indexOf(int number[]){
        for (int a = 0; a < number.length ; a++){
            System.out.println("Index position of number "+number[a]+" is: "+a);
        }
    }
}
