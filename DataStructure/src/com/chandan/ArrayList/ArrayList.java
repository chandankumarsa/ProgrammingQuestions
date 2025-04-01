package com.chandan.ArrayList;

public class ArrayList {
	private Object[] o = new Object[10];
	private int count = 0;

	public void add(Object ele) {
		if (count >= o.length)
			increase();
		o[count++] = ele;
	}

	public int size() {
		return count;
	}
	public boolean isEmpty() {
		return count == 0;
	}

	private void increase() {
		Object[] a = new Object[o.length * 2];
		for (int i = 0; i < o.length; i++) {
			a[i] = o[i];
		}
		o = a;
	}

	public Object get(int index) {
		if (index < 0 || index >= size())
			throw new ArrayIndexOutOfBoundsException();
		return o[index];
	}

	public void addpos(Object ele, int index) {
		if (index < 0 || index > size())
			throw new ArrayIndexOutOfBoundsException();
		if (count >= o.length)
			increase();
		for (int i = size(); i > index; i--)
			o[i] = o[i - 1];
		o[index] = ele;
		count++;
	}

	public void remove(int index) {
		if (index < 0 || index >= size())
			throw new ArrayIndexOutOfBoundsException();
		for (int i = index; i < size(); i++)
			o[i] = o[i + 1];
		count--; // Simply decrease count like your original code
	}
}
