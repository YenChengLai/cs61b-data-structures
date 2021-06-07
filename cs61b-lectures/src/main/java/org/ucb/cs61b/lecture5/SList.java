package org.ucb.cs61b.lecture5;

public class SList {

	/**
	 * Nested Class
	 * 
	 * @author laiyencheng
	 *
	 */
	private static class IntNode {

		public int item;
		public IntNode next;

		public IntNode(int item, IntNode node) {
			this.item = item;
			this.next = node;
		}

	}

	private IntNode sentinel;
	private int size;

	/**
	 * Constructors to create empty list.
	 */
	public SList() {
		/**
		 * this code will break if addLast method is called directly after the empty
		 * list is created
		 */
		// first = null;
		/**
		 * use the idea of sentinel node, which means there will always be a meaningless
		 * node (dummy node) in the first place to prevent NullPointerException
		 */
		sentinel = new IntNode(0, null);
	}

	public SList(int x) {
		sentinel = new IntNode(0, null);
		sentinel.next = new IntNode(x, null);
		size++;
	}

	/**
	 * Adds x to the front of the list.
	 * 
	 * @param x
	 */
	public void addFirst(int x) {
		sentinel.next = new IntNode(x, sentinel.next);
		size++;
	}

	/**
	 * Returns the first item in the list.
	 * 
	 * @return
	 */
	public int getFirst() {
		return sentinel.next.item;
	}

	/**
	 * Add x to the last of the list.
	 * 
	 * @param x
	 */
	public void addLast(int x) {
		IntNode last = sentinel;

		while (last.next != null) {
			last = last.next;
		}

		last.next = new IntNode(x, null);
		size++;
	}

	/**
	 * Returns the last item in the list.
	 * 
	 * @return
	 */
	public int getLast() {
		IntNode last = sentinel;

		while (last.next != null) {
			last = last.next;
		}

		return last.item;
	}

	/**
	 * Return the size of the list
	 * 
	 * @return
	 */
	public int size() {

		/** my original thought */
//		IntNode last = first;
//		int size = 1;
//
//		while (last.next != null) {
//			last = last.next;
//			size++;
//		}
//		return size;
		/** normal way */
//		return size(first);

		/** use caching */
		return size;
	}

	/**
	 * recursive way to count size
	 * 
	 * @param node
	 * @return
	 */
	@SuppressWarnings("unused")
	private static int size(IntNode node) {
		if (node != null)
			return 1 + size(node.next);
		return 0;
	}

	public static void main(String args[]) {
		SList slist = new SList(10);
		slist.addFirst(5);
		slist.addFirst(7);
		slist.addLast(6);
		System.out.println("First: " + slist.getFirst());
		System.out.println("Last: " + slist.getLast());
		System.out.println("Size: " + slist.size());
	}
}
