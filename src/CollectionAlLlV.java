import java.util.*;

public class CollectionAlLlV {
    public static void main(String[] args) {
        CollectionAlLlV ref = new CollectionAlLlV();
        ref.arrayList();

    }


    public static void arrayList(){
        ArrayList<String>list=new ArrayList<String>();
        list.add("Aditya");
        list.add("Suraj");
        list.add("Aniket");
        list.add("Akash");
        list.add("Ram");
        Iterator itr=list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }


    /*
    public static void linkedList(){
        LinkedList<String> al=new LinkedList<String>();
        al.add("Aditya");
        al.add("Suraj");
        al.add("Aniket");
        al.add("Ram");
        Iterator itr=al.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    */

    /*
    public static void vector(){
        Vector<String> v=new Vector<String>();
        v.add("Aditya");
        v.add("Suraj");
        v.add("Aniket");
        v.add("Akash");
        Iterator itr=v.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }

     */
    /*
    public static void stack() {
        Stack<String> stack = new Stack<String>();
        stack.push("Aniket");
        stack.push("Aditya");
        stack.push("Akash");
        stack.push("Suraj");
        stack.push("Ram");
        stack.pop();
        stack.pop();
        Iterator itr = stack.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
    */

    /*
    public static void priorityQueue(){
        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("Aniket");
        queue.add("Sanket");
        queue.add("Aditya Motewar");
        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.peek());
        System.out.println("iterating queue element");
        Iterator itr=queue.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("after removing two element");
        Iterator itr2=queue.iterator();
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }

    }

     */
}
