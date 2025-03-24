public class MergeSort {
	public static void main(String[] args) {
		int a[] = { 9, 8, 7, 2, 0 };
	}

	static void sort(int a[]) {
		if (a.length <= 1)
			return;
		int mid = a.length / 2;
		int left[] = new int[mid];
		int right[] = new int[a.length - mid];
		for (int i = 0; i < left.length; i++) {
			left[i] = a[i];
		}
		for (int i = 0; i < right.length; i++) {
			right[i] = a[mid + 1];
		}
		sort(left);
		sort(right); 
	}

	static void mergesort(int a[], int b[], int c[]) {
		int i = 0, j = 0, k = 0;
		 if (a[i] < b[j]) {
             c[k++] = a[i++];
         } else {
             c[k++] = b[j++];
         }
		while(i<a.length)c[k++]=a[i++];
		while(j<b.length)c[k++]=b[j++];
		
	}
}
