package StackIterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class Stack<T> implements Iterable{
    List<T> stack ;
    public Stack(){
        stack=new LinkedList<>();
    }
    public void push(T element){
        stack.add(stack.size(),element);
    }
    public T pop(){
        if(!stack.isEmpty()) {
            T popped = stack.get(stack.size() - 1);
            stack.remove(stack.size()-1);
            return popped;
        }else {
            System.out.println("No elements");
        }
        return null;
    }
    public T peek(){
        if(!stack.isEmpty()) {
           return stack.remove(stack.size()-1);
        }else {
            System.out.println("No elements");
        }
        return null;
    }
    @Override
    public StackIterator iterator() {
        return new StackIterator();
    }


    public class StackIterator implements Iterator{
int index = stack.size()-1;
        @Override
        public boolean hasNext() {
            return index>=0;
        }

        @Override
        public T next() {
            return (T) stack.get(index--);
        }


    }
}
