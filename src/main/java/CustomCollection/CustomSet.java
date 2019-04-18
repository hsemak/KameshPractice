package CustomCollection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class CustomSet<E> implements Set<E> {

	private static Object[] internal ;
	private static int size = 0;
	int length;
	public CustomSet(int length) {
		this.length =length;
		internal = new Object[length];
			
	}
	
	public int size() {
	
		return  size;
	}

	public boolean isEmpty() {
		boolean value = false;
		if (internal !=null && internal.length ==0)
				value= true;
		else {
			value = false;
		}
		return value;
	}

	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean add(E e) {
		
		for (int i=0;i< internal.length ;i++) {
			
			if (internal[i]== null) {
				internal[i] = e;
			}
			size++;
			return true;
			
		}
		
		
		return true;
	}

	public boolean remove(Object o) {
		Object[] temp =new Object[internal.length-1]; 	
		int tempLenght=0;
		for (int i=0;i<internal.length;i++) {
			
			if (o.equals(internal[i])) {
				continue;
			} else {
				temp[tempLenght] = internal[i];
				tempLenght++;
			
			}
			internal=temp;
			
		}
		
		return false;
	}

	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public void clear() {
		// TODO Auto-generated method stub
		
	}

}
