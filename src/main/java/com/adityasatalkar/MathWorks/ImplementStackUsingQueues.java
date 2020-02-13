package com.adityasatalkar.MathWorks;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {

	class MyStack{

		int top;

		// Two inbuilt queues
		Queue<Integer> queue1;
		Queue<Integer> queue2;

		/** Initialize your data structure here. */
		public MyStack() {
			queue1 = new LinkedList<Integer>();
			queue2 = new LinkedList<Integer>();
			top = 0;
		}

		/** Push element x onto stack. */
		public void push(int x) {
			queue1.add(x);
			top = x;
		}

		/** Removes the element on top of the stack and returns that element. */
		public int pop() {
			while(queue1.size() > 1) {
				int value = queue1.remove();
				top = value;
				queue2.add(value);
			}
			int popValue = queue1.remove();
			queue1.addAll(queue2);
			queue2.clear();

			return popValue;
		}

		/** Get the top element. */
		public int top() {
			return top;
		}

		/** Returns whether the stack is empty. */
		public boolean empty() {
			return queue1.isEmpty();
		}
	}
}
