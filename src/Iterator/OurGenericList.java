package Iterator;

import java.util.Iterator;
//We are creating a generic list over which we want to iterate over the array of type <T> from some other class
//The problem is that we can't do it because the list is private So??
//Java provides an Iterable interface that contains an Iterator method that allows us to iterate over the elements of the list

public class OurGenericList<T> implements Iterable<T>{
    private T[] items;
    private int size;

    public OurGenericList(){
        size = 0;
        items = (T[])new Object[100];
    }
    public void AddItems(T item){
        items[size++]= item;
    }
    public T GetItemAtIndex(int index){
        return items[index];
    }
    //3. Now for the final part we Override the method Iterator from here we create an object of OurGenericListIterator
    //and pass it the current object
    @Override
    public Iterator<T> iterator() {
        return new OurGenericListIterator(this);
    }
    //2. We are creating an inner private class that implements Iterator interface
    //Now we need to implement two methods of iterator interface hasNext() and next()
    //WHY are we doing this???? because Iterable interface provides Iterator that itself is an Interface
    //and in order to use it we have to implement the methods.
    private class OurGenericListIterator implements  Iterator<T>{

        //We created an instance of the Parent class that will provide the list
        public OurGenericList<T> list;
        private int index = 0;

        //in constructor we initialise the list of type parent class to a list of same type in order to access
        //the values
        public OurGenericListIterator(OurGenericList<T> list){
            this.list = list;
        }
        //we Override the hasNext that tells if element exists in the list
        @Override
        public boolean hasNext() {
            return index<list.size;
        }
        //next returns the item at the given index. NOTE each of our items in list is of type <T> so
        //method return type is also of type T
        @Override
        public T next() {
            return list.items[index++];
        }
    }
}
