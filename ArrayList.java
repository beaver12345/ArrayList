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
			throws new IllegalArgumentException();

		return arr[index];
	}
	
	public void add(int value, int index) {
		if (index > size)
			throws new IllegalArgumentException();
		size++;
		if (size >= arr.length)
			arr = enlarge();

		for (int i = size; i > index; i--) {
			arr[i] = arr[i-1];
		}

		arr[index] = value;

		
	}

	public void add(int value) {
		add(value, size);
	}

	private int[] enlarge() {
		int[] array = new int[arr.length * 2];

		for (int i = 0; i < arr.length; i++) {
			array[i] = arr[i];
		}

		return array;
	}

	public void set(int value, int index) {
		if (index <= size)
		arr[index] = value;
	}

	public void remove(int index) {
		//size--;
		for (int i = index; i < size - 1; i++) {
			int temp = arr[i+1];
			arr[i] = 
		}
	}

	public boolean isEmpty() {
		return size == 0;
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
