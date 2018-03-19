
/**
 * A queue is a first in first out data structure. 
 * 
 * @author Carlberg
 * @version 4/26/17
 */
import java.util.LinkedList; 
public class Queue<T>
{
    private LinkedList<T> ll; 

    public Queue()
    {
        ll = new LinkedList<>(); 
    }
    public boolean isEmpty(){
        return ll.size() == 0; 
    }
    public T dequeue(){
        return ll.pollLast(); 
    }
    public T peek(){
        return ll.peekLast(); 
    }
    public void enqueue(T obj){
        ll.addFirst(obj); 
    }
    public String toString(){
        String s = "(front) ";
        boolean first = true;  
        for(T item: ll){
            if(first){
                s = s +  item; 
                first = false; 
            }else{
                s = s + "-->" + item;
            }
        }
        s = s + "  (rear)"; 
        return s; 
    }
    
    public static void main(String[] args){
        Queue<String> q = new Queue<>(); 
        q.enqueue("Matt"); 
        q.enqueue("Mark"); 
        q.enqueue("Mike"); 
        System.out.println(q); 
        System.out.println(q.dequeue()); 
        System.out.println(q); 
        
    }
}
