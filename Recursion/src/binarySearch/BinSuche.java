package binarySearch;
import java.util.Arrays;
import java.util.Random;

public class BinSuche {

	public static void main(String[] args) {

		// create two arrays for searching
		
		int size = Integer.MAX_VALUE / 124; // array size

		int[] a = new int[size];
		int[] b = new int[size];

		Random r = new Random();
		
		for (int i = 0; i < a.length; i++) {
			int nextInt = r.nextInt(Integer.MAX_VALUE);
			a[i] = nextInt;
			b[i] = nextInt;
		}
		
		// one of them must be sorted - necessity for binary search
		
		Arrays.sort(a);

		for (int i = size - 1; i >= 1; i = i / 2) {

			int key = a[i];

			long time = System.nanoTime();
			int index = searchBin(a, key, 0, a.length);
			long now = System.nanoTime() - time;

			System.out.println("Binary search: key=" + key + ", index=" + index
					+ ", time=" + now + " ns");

			time = System.nanoTime();	
			index = linearSearch(b, key);
			now = System.nanoTime() - time;

			System.out.println("Linear Search: key=" + key + ", index=" + index
					+ ", time=" + now + " ns");
			System.out.println();
			
		}

		a = new int[] { 8, 12, 33, 37, 51, 92, 123, 157 };
		searchBin(a, 123, 0, a.length);
		
	}

	
	public static int linearSearch(int[] data, int key) {
		for (int i = 0; i < data.length; i++) {
			if (data[i] == key) {
				return i;
			}
		}
		return -1;
	}

	
	public static int searchBin(int[] data, int key, int l, int r) {
		if (l > r) return -1;
		// one bit shift to the right returns the same as division by two
		// safe for huge integers
		int mid = (l + r) >>> 1;
		if ( data[mid] == key) return mid;
		else if ( data[mid] > key ) return searchBin(data, key, l, mid-1);
		else return searchBin(data, key, mid+1, r);
	}

}
