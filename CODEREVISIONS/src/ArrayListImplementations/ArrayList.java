package ArrayListImplementations;

public class ArrayList {
	public Object o[] = new Object[10];
	int count = 0;

	public void add(Object ele) {
		if (count >= o.length)
			increase();
		o[count++] = ele;
	}

	public void increase() {
		Object a[] = new Object[o.length * 2];
		for (int i = 0; i < o.length; i++) {
			a[i] = o[i];
		}
		o = a;
	}

	public int size() {
		return count;
	}

	public boolean isEmpty() {
		return count == 0;
	}
	public Object get(int index) {
		if(index<0||index>=size())throw new ArrayIndexOutOfBoundsException();
		return o[index];
	}
	public void addPos(int index,Object ele) {
		if(index<0||index>size())throw new ArrayIndexOutOfBoundsException();
		if (count >= o.length)
			increase();
		for(int i=size();i>index;i--) {
			o[i]=o[i-1];
		}
			o[index]=ele;
			count ++;
	}
	public void remove(int index) {
		if(index<0||index>=size())throw new ArrayIndexOutOfBoundsException();
		for(int i =index;i<size()-1;i++) { 
			o[i]=o[i+1];
		}
			count--;	
	}
	

}
