package HW9;

import java.util.Scanner;

/**
 * Created by KOS on 24.04.2018.
 */
public class Main {

    public static void main(String[] args) {

        // Task 1
        ListExample list = new ListExample();
        list.createArrList();
        list.printArrList();
        System.out.println("-----------------------------");
        list.delFirstTwoElement();
        System.out.println("-----------------------------");
        System.out.print("RESULT! ");
        list.printArrList();
 
        // Task 3
        ReadFromFile rff = new ReadFromFile();
        System.out.println("");
        Scanner sc = new Scanner(System.in);

        System.out.println("Input file name:");
        String fileName = sc.nextLine();
        System.out.println(fileName);
        rff.sort(fileName);
     // rff.sort("TextFile");
        sc.close();
 
        // Task 4
        String[] arrPeople = new String[]{"Volovitc", "Kutrapalli", "Penny", "Sheldon",  "Leonard"};
        drinkCola queue = new drinkCola();
        for (int i=0; i<arrPeople.length; i++){
            queue.createQueue(arrPeople[i].toString());
        }
        System.out.println("The queue:");
        System.out.println(queue.toString());
        System.out.println("The queue after drink cola:");
        queue.getQueue();
        queue.getQueue();
 

    }
}
