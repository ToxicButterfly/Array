package com.star;
import java.util.Comparator;

/**
*Class of my very own collection
 */
public class NewArrayList<T extends Object> implements Comparator<T> {
    private Object[] baseArray;
    private final int defaultLength=10;
    private int length=0;
    private int maxLength;

    /**
     * Class constructor that generates base array
     */
    public NewArrayList(){
        this.baseArray = new Object[defaultLength];
        maxLength=defaultLength;
    }

    /**
     * Class constructor that generates collection of specified length
     * @param len length of the colleciton
     */
    public NewArrayList(int len) {
        this.baseArray = new Object[len];
        maxLength=len;
    }

    /**
     * Adds one item into collection
     * @param item
     */
    public void add(T item){
        check();
        baseArray[length]=item;
        length++;
    };

    /**
     * Method to get item from the collection by index
     * @param index
     * @return item
     */
    public Object get(int index){
           if (length>index && index>=0) {
               return baseArray[index];
           }
           else throw new NullPointerException("Нет элементов в коллекции");
    }

    /**
     * Method that deletes all items from collection
     */
    public void clear() {
        for(int i=0; i<length;i++) {
            baseArray[i]=null;
        }
        length=0;
    }

    /**
     * Method that extends collection if it's already full
     */
    private void check() {
        if(length==maxLength) {
            maxLength=maxLength*3/2+1;
            Object[] mas = new Object[maxLength];
            System.arraycopy(baseArray, 0, mas, 0, length);
            baseArray=mas;
            System.out.println("Коллекция была увеличена!");
        }
    }

    /**
     * Checks if collection contains entered object
     * @param a
     * @return boolean true or false
     */
    public boolean contains(Object a) {
        for(int i=0;i<length;i++){
            if(baseArray[i].equals(a))
                return true;
        }
        return false;
    }

    /**
     * Gets an index of the object
     * @param a
     * @return index
     */
    public int indexOf(Object a){
        for(int i=0;i<length;i++){
            if(baseArray[i].equals(a))
                return i;
        }
        return -1;
    }

    /**
     * Checking for elements' presence
     * @return true if there's no elements and false otherwise
     */
    public boolean isEmpty() {
        if (length>0)
            return false;
        else
            return true;
    }

    /**
     * Delete element by index
     * @param index
     */
    public void remove(int index) {
        for(int i=index; i<this.length;i++) {
            baseArray[i]=baseArray[i+1];
        }
        length--;
    }
    public int compare(String a, String b) {
        return a.compareTo(b);
    }
    public int compare (Integer a, Integer b) {

        return Integer.compare(a,b);
    }

    public int size() {
        return length;
    }

/*    public void quickSort(int i, int j) {
        Object main = baseArray[j];
        Object save;
        int point=i;
        while(i<j) {
            while()
            switch(compare((Integer) main,(Integer) baseArray[j])) {
                case 1:
                    save=baseArray[j];
                    baseArray[j]=main;
                    baseArray[point]=save;
                    point=j;

                case -1:
                    continue;
                case 0:
                    continue;
            }

        }
    }
*/

    /**
     * Constructor that generates Iterator
     * @return
     */
    public NewIterator createIterator() {
        return new NewIterator();
    }

    @Override
    public int compare(T o1, T o2) {
        return 0;
    }

    /**
     * Iterator class
     */
    public class NewIterator {
        private int index = 0;

        public Object next() {
            if(hasNext()) {
                return baseArray[index++];
            }
            else throw new IndexOutOfBoundsException("В коллекции дальше ничего нет!");

        }
        public boolean hasNext() {
            return index<length;
        }
    }
}


