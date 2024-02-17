package Collection;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ListyIterator<T> implements Iterable{

private  List<T> elements;
private LiIterator iter;

public ListyIterator(T... elements){
   // this.elements=new ArrayList<>();
    iter = new LiIterator();
    this.elements=List.of(elements);
}
public boolean move(){
    if(iter.hasNext()){
        iter.next();
        return  true;
    }
    return false;

}
public boolean hasNext(){
    return iter.hasNext();
}
public void print(){
   if(elements.isEmpty() | elements == null){
       throw new IllegalStateException("Invalid Operation!");
   }else {
       System.out.println(elements.get(iter.getIndex()));
   }

}
    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer consumer) {
        for (T t : elements){
            consumer.accept(t);
        }
    }
public void printAll(){
    this.forEach(e->System.out.printf("%s ", e));
    System.out.println();
}
    class LiIterator  implements Iterator {
        private int index=0;
        @Override
        public boolean hasNext() {
            return  index<elements.size()-1;
        }

        @Override
        public T next() {
            return elements.get(index++);
        }

        public int getIndex() {
            return index;
        }
    }
}
