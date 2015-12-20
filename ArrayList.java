public class ArrayList {

	// how arraylist works is if you remove a value at a certain index i. All the values
	// get shifted over
	
	// if the req Size > the current size of arr. Then double the arr and transfer the values 
	// into a new arr and double the size.

	// fields
	// also if call remove() you don't have to reset that value to 0
	private int size; // size is the size of the arraylist not the size of arr
	private int[] arr;

	public ArrayList() {
		this.size = 0;
		this.arr = new int[10];	
	}
	
	// gets the index of the arr
	public int get(int index) {
		
		if (index > size - 1)
			throws new Exception;

		return arr[index];
	}
	
	public void add(int value, int index) {
		size++;

	}

	public void add(int value) {
		add(value, size);
	}

	public void set(int value, int index) {
		if (index <= size)
		arr[index] = value;
	}

	public void remove(int index) {
		//size--;
		for (int i = index; i < size - 1; i++) {
			int temp = arr[i+1];
		}
	}

	public boolean isEmpty() {
		boolean empty = false;
		if (size == 0)
			empty = true;
		return empty;
	}
	
	// sorting method on field arr
	public void sort() {
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - 1; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	// returns size of arr
	public int size() {
		return size;
	}
	

}
