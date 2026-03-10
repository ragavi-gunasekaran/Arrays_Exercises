package lexicon.exercises;

public class Main {

    static void main() {

        /*1. Write a program which will store elements in an array of type `int` and print it out.
           Expected output: `11 23 39` etc.*/
        int a[] = {11,23,39};
        for(int x = 0 ; x < 3 ; x++){
            System.out.print(a[x]);
            System.out.print("  ");
        }
    }
}
