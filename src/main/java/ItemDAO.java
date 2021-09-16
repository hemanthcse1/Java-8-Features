import java.util.ArrayList;
import java.util.List;

public class ItemDAO {

    public List<Item> getItems(){
        List<Item> items = new ArrayList<>();
        items.add(new Item(101,"Iphone",10));
        items.add(new Item(102,"OnePlus 7T Pro",15));
        items.add(new Item(103,"Samsung M30",12));
        items.add(new Item(104,"Moto G20",19));

        return items;
    }
}
