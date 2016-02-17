import java.io.*;
import java.util.*;

class linkedList<AnyType> implements Iterable<AnyType>{
  private Node<AnyType> head;
  public linkedList(){
    head = null;
  }

  public boolean isEmpty(){
    if(head==null){
      return true;
    }
    return false;
  }
//Node is an inner class which is a represntaion of node/block in a linkedList
  private static class Node<AnyType>{
    private AnyType data;
    private Node<AnyType> next;

    //Assign data and next(pointer) the constructor is used to assign the data and the pointer value
    public Node(AnyType data, Node<AnyType> next){
      this.data=data;
      this.next=next;
    }

  }


  // Iterator Class
      public Iterator<AnyType> iterator() {
      return new linkedListIterator();
   }
    private class linkedListIterator  implements Iterator<AnyType>{

        @Override
        public boolean hasNext() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public AnyType next() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

   }

}
