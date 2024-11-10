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

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
