package Iterator;

import java.util.Iterator;

public class CollectionTest {
    public static void main(String[] args) {
        OurGenericList<Integer> list = new OurGenericList<Integer>();
        list.AddItems(1);
        list.AddItems(12);
        list.AddItems(13);
        list.AddItems(15);
        list.AddItems(17);
        list.AddItems(19);
        //We access the iterator by using object of parent class
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (Integer li:list){
            System.out.println(li);
        }
    }
}
