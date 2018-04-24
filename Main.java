package HW9;

import java.util.Scanner;

/**
 * Created by KOS on 24.04.2018.
 */
public class Main {

    public static void main(String[] args) {

        // Task 1
        TestList list = new TestList();
        list.createArrList();
        list.printArrList();
        System.out.println("-----------------------------");
        list.delFirstTwoElement();
        System.out.println("-----------------------------");
        System.out.print("RESULT! ");
        list.printArrList();
        System.out.print("\n");

        // Task 3
        ReadFromFile rff = new ReadFromFile();
        Scanner sc = new Scanner(System.in);
        rff.sort("TextFile");
        sc.close();

    }
}
