package HW9;


import java.util.ArrayDeque;

/**
 * Created by KOS on 25.04.2018.
 */
public class drinkCola {

    ArrayDeque<String> queue=new ArrayDeque<String>();

    public drinkCola() {
    }
    public void createQueue(String str){
        queue.addLast(str);
    }

    public void getQueue(){
        if (queue.size()>0){
            queue.addLast(queue.pollFirst());
            queue.addLast(queue.getLast());
            System.out.println(" "+queue.toString());
        }
        else System.out.println("The queue is empty!");
    }

    @Override
    public String toString() {
        return " "+ queue +" ";
    }
}
