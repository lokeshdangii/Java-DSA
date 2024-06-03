import java.util.Comparator;
import java.util.PriorityQueue;

public class PQ_For_Objects{

    static class Student implements Comparable<Student>{
        String name;
        int rank;

        Student(String name,int rank ){
            this.rank = rank;
            this.name = name;
        }

        @Override
        public int compareTo(Student s2){  // is used to sort the objects --> if the difference btw two object is 0 then it will store any object first other wise will store in sorted order
            return this.rank - s2.rank; // <-- for ascending
            // for descending --> return s2.rank - this.rank;
        }
    }
    public static void main(String[] args) {
        // PriorityQueue<Student> pq = new PriorityQueue<>();
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(new Student("A", 10));
        pq.add(new Student("B", 2));
        pq.add(new Student("C", 5));
        pq.add(new Student("D", 4));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name +  "--> " + pq.peek().rank);
            pq.remove();
        }

    }
}