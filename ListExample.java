package HW9;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KOS on 24.04.2018.
 */
public class ListExample {

    public ListExample() {
    }

    List<String> listOne = new ArrayList<>();

    public void createArrList(){
        for(int i =1; i<=10; i++){
            listOne.add("mouse"+i);
        }
    }

    public void printArrList(){
        System.out.println("ArrayList: "+listOne);
    }

        public void delFirstTwoElement(){

            System.out.print("Delete element: ");
            int i = 2;
            do{
                if(i>0) {
                    System.out.print(listOne.get(0) + " ");
                    listOne.remove(0);
                }else{
                    System.out.println(listOne.get(listOne.size()-1));
                    listOne.remove(listOne.size() - 1);
                }
                i--;
            }while(i>=0);
        }
}
