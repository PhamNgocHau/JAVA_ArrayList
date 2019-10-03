import java.util.Arrays;
import java.util.function.ToIntFunction;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITy = 10;
    private Object elements[] = new Object[DEFAULT_CAPACITy];

    public MyList() {
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public String print(){
        elements = Arrays.copyOf(elements , size);
        return Arrays.toString(elements);
    }

    private void ensureCapa(int minCapacity){
        if (size == elements.length){
            int newSize = elements.length + minCapacity;
            elements = Arrays.copyOf(elements ,newSize);
        }
    }

    public void add(int index , E e){
        if (size == 0){
            ensureCapa(1);
            elements[size++] = e;
        } else if (index > size || index < 0){
            throw new IndexOutOfBoundsException("Index: " + index + " Size: " + index);
        } else {
            ensureCapa(1);
            for (int i = size ; i > index ; i--){
                elements[i] = elements[i - 1];
            }
            elements[index] = e;
            size++;
        }
    }

    public boolean add(E e){
        ensureCapa(2);
        elements[size++] = e;
        return true;
    }

    public void remove(int index){
        if (index > size || index < 0){
            throw new IndexOutOfBoundsException("Index: " + index + " Size: " + index);
        }
        ensureCapa(1);
        for (int i = index ; i < size ; i++){
            elements[i] = elements[i + 1];
        }
        size--;
        elements = Arrays.copyOf(elements , size);
    }

    public int size(){
        return size;
    }

    protected E clone(){
        Object copyOfElement[] = Arrays.copyOf(elements , elements.length);
        return (E) Arrays.toString(copyOfElement);
    }

    public int indexOf(Object o){
        int i = 0;
        for (i = 0 ; i < elements.length ; i++){
            if (o == elements[i]){
                break;
            }
        }
        if (i == elements.length){
            i = -1;
        }
            return i;
        }

    public boolean contains(E o){
        int i = 0;
        boolean check = true;
        for (i = 0 ; i < elements.length ; i++){
            if (o == elements[i]){
                break;
            }
        }
        if (i == elements.length){
            check =  false;
        }
        return check;
    }

    public void clear(){
        size = 0;
    }

    public E get(int index){
        int i = 0;
        if (index > size || index < 0){
            throw new IndexOutOfBoundsException("Index: " + index + " Size: " + index);
        }
        for (i = 0 ; i < elements.length; i++){
            if (i == index){
                break;
            }
        }
        return (E) elements[i];
    }
    }

