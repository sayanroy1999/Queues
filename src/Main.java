import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
/*
        //Normal FIFO Queue
        Queue<Integer> q=new LinkedList<>();
        q.offer(1);
        q.offer(2);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.isEmpty());

        //Stack class
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        while (!stack.isEmpty())
        {
            System.out.println(stack.peek());
            stack.pop();
        }

        Deque<Integer> dq=new ArrayDeque<>();
        dq.offerFirst(1);
        dq.offerFirst(2);
        dq.pollFirst();
        dq.peekFirst();

        System.out.println(dq);

        //Here Priority Queue is following the natural ordering that is ordering specified by the Integer class which implements the Comparable class. That Comparator class has elements in ascending order. hence it was following ascending order.
        //If we pass the Comparator then it will take the comparator precedence over natural ordering
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.offer(1);
        pq.offer(2);
        pq.offer(0);
        pq.offer(100);

        //Getting top 2 elements in a list from queue
        List<Integer> top2= new ArrayList<>(); //Here Integer class also calls the CompareTo method in ascending order
        int index=0;
        while(!pq.isEmpty())
        {
            if(index==2)
                break;
            top2.add(pq.poll());
            index++;
        }

        System.out.println(top2);
        System.out.println(pq); // Top 2 elements will be left in queue.

        //Getting the top 3 students of maths score from Student class

        List<StudentMarks> marks=new ArrayList<>();
        marks.add(new StudentMarks(99,51));
        marks.add(new StudentMarks(96,50));
        marks.add(new StudentMarks(95,53));
        marks.add(new StudentMarks(97,52));

        System.out.println(marks.toString()); //Here it will store in

        PriorityQueue<StudentMarks> sq=new PriorityQueue<>(marks); //Here v can't use the student marks class. And for that v need a comparator

        System.out.println(sq); //Here r the elements coming arbitarily?

        List<StudentMarks> stud3= new ArrayList<>();
        int i=0;
        while(!sq.isEmpty())
        {
            if(i==3)
                break;
            stud3.add(sq.poll());
            i++;
        }

        System.out.println(stud3);*/

        //Total Ordering
        PriorityQueue<Integer> pq=new PriorityQueue<>(new MyCustomComparator());

        pq.offer(5);
        pq.offer(2);
        pq.offer(10);
        pq.offer(1);

        System.out.println(pq);

        List<Integer> myList=new ArrayList<>();
        int j=0;
        while (!pq.isEmpty())
        {
            if(j==3)
                break;
            myList.add(pq.poll());
            j++;
        }
        System.out.println(myList);

    }
}