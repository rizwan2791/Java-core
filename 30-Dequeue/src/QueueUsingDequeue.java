import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class QueueUsingDequeue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Deque<Integer> dq = new ArrayDeque<Integer>();
		dq.add(1);
		dq.addFirst(2);
		dq.addFirst(3);
		dq.addFirst(4);
		dq.addFirst(5);
		dq.addFirst(6);
		System.out.println("Stack operation using DeQueue");
		System.out.println("-----------------------------------------------");
		System.out.println(dq);
		System.out.println("Peek:-" + dq.peek());
		dq.addFirst(7);
		System.out.println(dq);
		System.out.println("Peek :" + dq.peek());
        System.out.println("Poping :" + dq.pollLast());
		System.out.println("Poping :" + dq.pollLast());
		System.out.println("Poping :" + dq.pollLast());
		System.out.println("Poping :" + dq.pollLast());
		System.out.println("Poping :" + dq.pollLast());
		System.out.println("Poping :" + dq.pollLast());
		System.out.println("Poping :" + dq.pollLast());
		System.out.println(dq);

	}
}