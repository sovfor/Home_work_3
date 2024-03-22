import java.util.ArrayList;
import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T> {

    private ArrayList<T> list;

    public MyLinkedList(){
        list = new ArrayList<>();
    }

    public ArrayList<T> getList(){
        return new ArrayList<>(list);
    }

    public void add(T item){
        list.add(item);
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }

}
