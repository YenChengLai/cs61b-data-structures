package org.ucb.cs61b.lecture7;

/**
 * Array based list
 * 
 * @author laiyencheng
 *
 */
@SuppressWarnings("unchecked")
public class AList<Item> {

	Item[] items;
	int size;

	public AList() {
		items = (Item[]) new Object[100];
		size = 0;
	}

	/**
	 * Resizing the array's capacity to specific size.
	 */
	private void resize(int capacity) {
		Item[] a = (Item[]) new Object[capacity];
		System.arraycopy(items, 0, a, 0, size);
		items = a;
	}

	/**
	 * Insert value into the back of the list.
	 * 
	 * The next item will always be on position size
	 * 
	 * @param x
	 */
	public void addLast(Item x) {

		// resizing the size
		if (size == items.length) {
			// resize(size + 1); // this will cause frequent resizing and damage the
			// performance.
			resize(size * 2);
		}

		items[size] = x;
		size++;
	}

	/**
	 * Returns the last value in the list.
	 * 
	 * @return
	 */
	public Item getLast() {
		return items[size - 1];
	}

	/**
	 * Returns the specific value in position x.
	 * 
	 * @param x
	 * @return
	 */
	public Item get(int x) {
		return items[x];
	}

	/**
	 * Returns the size of the list.
	 * 
	 * @return
	 */
	public int size() {
		return size;
	}

	/**
	 * Removes the last item in the list and returns the deleted value.
	 */
	public Item removeLast() {
		size -= 1;
		items[size - 1] = null;

		return getLast();
	}
}
