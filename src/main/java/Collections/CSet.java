package Collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class CSet implements Set {
    private Object[] internal;

    @Override
    public int size() {
        return internal.length;
    }

    @Override
    public boolean isEmpty() {
        return internal.length==0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
     if (!isAvailable(o)) {
        internal = new Object[] {o};
     }
      return true;
    }
    private boolean isAvailable(Object o) {
        boolean value=false;
    for (int i =0;i<=internal.length;i++) {
        if (internal[i].equals(o)) {
        value=true;
        }
    }
    return value;
    }


    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
