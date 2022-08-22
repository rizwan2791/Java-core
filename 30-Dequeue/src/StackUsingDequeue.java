import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class StackUsingDequeue {

	public static void main(String[] args) {
		Deque<Integer> dq = new ArrayDeque<Integer>();
		dq.add(1);
		dq.add(2);
		dq.addLast(3);
		dq.addLast(4);
		dq.addLast(5);
		dq.addLast(6);
		System.out.println("Stack operation using DeQueue");
		System.out.println("-----------------------------------------------");
		System.out.println(dq);
		System.out.println("Peek:-" + dq.peek());
		dq.addLast(7);
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