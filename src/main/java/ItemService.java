import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ItemService {

    // Method 1 using MyComparator external class which implements Compatartor<T>
   /* public List<Item> getItemsInSort(){
        List<Item> items= new ItemDAO().getItems();
        Collections.sort(items,new MyComparator());
        return items;
    }*/

    // Method 2 Without using external class, directly passing Comparator<T>
    /*public List<Item> getItemsInSort(){
        List<Item> items= new ItemDAO().getItems();
        Collections.sort(items,new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return o2.getName().compareTo(o1.getName());
            }
        });
        return items;
    }*/


    // Using Lambda expression
    public List<Item> getItemsInSort(){
        List<Item> items= new ItemDAO().getItems();
        Collections.sort(items,(o1, o2) -> o1.getName().compareTo(o2.getName()));
        return items;
    }

    public static void main(String[] args){
        System.out.println(new ItemService().getItemsInSort());
    }
}

// old method
/*class MyComparator implements Comparator<Item>{

    @Override
    public int compare(Item o1, Item o2) {
        return o2.getName().compareTo(o1.getName());
    }
}*/
