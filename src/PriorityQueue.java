public class PriorityQueue {

        public static void main(String args[])
        {
            java.util.PriorityQueue<String> pq = new java.util.PriorityQueue<String>();
            pq.add("Geeks");
            pq.add("For");
            pq.add("Geeks");

            System.out.println("Initial PriorityQueue " + pq);
            pq.remove("Geeks");
            System.out.println("Peek: "+pq.peek());

            System.out.println("After Remove - " + pq);
            System.out.println("Peek 2: "+pq.peek());
            pq.poll();
            System.out.println("Poll Method - " + pq.poll());

            System.out.println("Final PriorityQueue - " + pq);
        }
    }
