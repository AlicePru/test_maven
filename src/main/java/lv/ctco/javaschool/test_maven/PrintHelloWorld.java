package lv.ctco.javaschool.test_maven;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintHelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        //Scanner scan = new Scanner(System.in);
        //String word = scan.nextLine();
        char[] array = {'f', 'o', 'x'};
        System.out.println(findAnagram(array));
    }

    static List<String> findAnagram(char[] array) {
        String anagram;
        List<String> anagramList = new ArrayList<String>();
        if (array.length == 1) {
            anagram = String.valueOf(array);
            anagramList.add(anagram);
        } else {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length - 1; j++) {
                    if (array[i] == array[j]) {
                        continue;
                    } else {

                        char tmp = array[i];
                        array[i] = array[j];
                        array[j] = tmp;
                        anagram = String.valueOf(array);
                        anagramList.add(anagram);


                    }
                }
                char tmp = array[1];
                array[1] = array[2];
                array[2] = tmp;
                anagram = String.valueOf(array);
                anagramList.add(anagram);


            }
        }
        return anagramList;
    }

}
