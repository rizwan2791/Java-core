package com.aurionpro.model;

import java.util.Iterator;

public class CustomLinkedList<T> implements Iterable<T> {
	Node<T> head;

	class Node<T> {
		T data;
		Node<T> next;
		public Node(T data) {
			this.data = data;
			this.next = next;
		}

	}

	public void addFirst(T data) {
		Node<T> newNode = new Node<T>(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;  
		head = newNode;
	}

	public void addLast(T data) {
		Node<T> newNode = new Node<T>(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node<T> currNode = head;
		while (currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;

	}

	public void deleteFirst() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		head = head.next;

	}

	public void deleteLast() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		Node<T> secondLast = head;
		Node<T> lastNode = head.next;
		while (lastNode.next != null) {
			lastNode = lastNode.next;
			secondLast = secondLast.next;
		}
		secondLast.next = null;
	}

	void deleteNode(String key) {
		Node<T> Currnode = head;
		Node<T> prevnode = null;
		if (Currnode == null)
			return;
		if (Currnode != null && Currnode.data == key) {
			head = Currnode.next;
			return;
		}

		while (Currnode != null && Currnode.data != key) {
			prevnode = Currnode;
			Currnode = Currnode.next;
		}

		prevnode.next = Currnode.next;
	}

	public void display() {
		if (head == null) {
			System.out.print("List is Empty");
		}
		Node<T> currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
		}
		System.out.println("Null");
	}
	public Iterator<T> iterator() {
		return new Iterator<T>() {
			Node<T> current = head;
			@Override
			public boolean hasNext() {
				return current != null;
			}

			@Override
			public T next() {
				if (hasNext()) {
					T data = (T) current.data;
					current = current.next;
					return data;
				}
				return null;
			}

		};

	}


}
