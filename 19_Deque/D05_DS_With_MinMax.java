// Data Structure with Min and Max operations
// pollFirst and Last removes element and return it
import java.util.*;
public class D05_DS_With_MinMax {
    
    static class MinMaxDS{
        static Deque<Integer> d;

        MinMaxDS(){
            d = new LinkedList<>();
        }

        public boolean isEmpty(){
            return d.isEmpty();
        }

        public void insertMin(int data){
            if(isEmpty()){
                d.addFirst(data);
            }

            if(d.peekFirst() <= data){
                return;
            }else{
                d.addFirst(data);
            }
        }

        public void insertMax(int data){
            if(isEmpty()){
                d.addFirst(data);
            }

            if(d.peekLast() >= data){
                return;
            }else{
                d.addLast(data);
            }

        }

        public int getMin(){
            return d.peekFirst();
        }

        public int getMax(){
            return d.peekLast();
        }

        public int remove(){
            return d.removeFirst();
        }

        public int extractMin(){
            return d.peekFirst();
        }

        public int extractMax(){
            return d.peekLast();
        }

        }

        public static void main(String[] args) {
            
            MinMaxDS dq = new MinMaxDS();

            dq.insertMax(5);
            dq.insertMin(100);
            dq.insertMin(2);
            dq.insertMax(19);
            dq.insertMax(5);
            dq.insertMax(999);
            dq.insertMax(2000);
            dq.insertMin(1);


            System.out.println("Min : " + dq.extractMin());
            System.out.println("Max : " + dq.extractMax());


            while(!dq.isEmpty()){
                System.out.print(dq.remove() + "  ");
            }

            System.out.println();
        }
      
    }


