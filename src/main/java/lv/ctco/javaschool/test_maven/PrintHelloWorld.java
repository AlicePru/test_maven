package lv.ctco.javaschool.test_maven;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintHelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        char[] array = new char[word.length()];
        findAnagram(array);
    }

    private static void findAnagram(char[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    continue;
                } else {
                    char tmp=array[0];
                    array[0]=array[1];
                    array[1]=array[2];
                    array[2]=array[3];
                    array[3]=tmp;

                }
                System.out.println(array);


            }

        }


    }

}
