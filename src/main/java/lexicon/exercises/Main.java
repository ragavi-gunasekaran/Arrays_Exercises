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

        /*4. Write a program which will copy the elements of one array into another array.
        Expected output:
        Elements from first array: `1 15 20`
        Elements from second array: `1 15 20`*/
        int copyElement[] = {1,15,20};
        int value = copyElement.length;
        int newElements[] = Arrays.copyOf(copyElement,value);
        System.out.println("Initial Elements : " + Arrays.toString(copyElement));
        System.out.println("Copied Elements : " + Arrays.toString(newElements));

        /*5. Create a two-dimensional string array `[2][2]`. Assign values containing any Country and City.
                Expected output:
        France Paris
        Sweden Stockholm*/
        String city[][] ={ {"France", "Paris"}, {"Sweden", "Stockholm"}};
        for (int i = 0; i < 2 ; i ++){
            for (int j = 0 ; j < 2 ; j++){
                System.out.print(city[i][j] + "  ");
            }
            System.out.println();
        }

        /*6. Write a program which will set up an array to hold the next values in this
        order: `43, 5, 23, 17, 2, 14` and print the average of these 6 numbers.
                Expected output: `Average is: 17.3`*/
        int numbersArray[] = {43, 5, 23, 17, 2, 14};
        double sum = 0;
        for (int index = 0 ; index < numbersArray.length ; index ++){
            sum = sum + numbersArray[index];
        }
        double average = sum / numbersArray.length;
        System.out.println("Average of the given numbers is : " + average);

        /*7. Write a program which will set up an array to hold 10 numbers and print out only the uneven numbers.
        Example:
        Array: `1 2 4 7 9 12`
        Odd Array: `1 7 9`*/
        int allNumberArray[] = {1, 2 ,4 ,7 ,9 ,12};
        System.out.print("Odd Array is : ");
        for (int elemnts : allNumberArray){
            if ((elemnts % 2) != 0){
                System.out.print(elemnts + "  ");
            }
        }

    }

    static void indexOf(int number[]){
        for (int a = 0; a < number.length ; a++){
            System.out.println("Index position of number "+number[a]+" is: "+a);
        }
    }
}
