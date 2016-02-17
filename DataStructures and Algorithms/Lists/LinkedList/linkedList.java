import java.io.*;
import java.util.*;

class linkedList<AnyType> implements Iterable<AnyType>{
  //defining head the pointer for first element of the linkedList
  private Node<AnyType> head;

  //Creating an Empty linkedList
  public linkedList(){
    head = null;
  }

  //Checking wheather the linkedList is empty
  public boolean isEmpty(){
    //returns list is empty if the head value = null
    if(head==null){
      return true;
    }
    return false;
  }

  //Adding an element at the begining of a linkedList
  public void addFirst(AnyType item){
    head = new Node(item,head);
  }

  //get the first element of the linkedList
  public void getFirst(){
    Node temp = head;
    if(head!= null){
      System.out.println("First Data: "+temp.data+" Next: "+temp.next);
    }
    else{
      throw new NoSuchElementException();
    }
  }

  //
  public void deleteFirst(){
    System.out.println("DeletedFirst Data: "+head.data+" Next: "+head.next);
    head = head.next;
  }

  //traverse and print list
  public void traverse(){
    Node temp = head;
    System.out.println("List Contents");
    while(temp!= null){
      System.out.println("Data: "+temp.data+" Next: "+temp.next);
      temp = temp.next;
    }
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
   public static void main(String[] args) {
     linkedList<String> list = new linkedList <String>();
     list.addFirst("p");
     list.addFirst("a");
     list.addFirst("e");
     list.addFirst("h");
     list.traverse();
     list.getFirst();
     list.deleteFirst();
     list.traverse();
   }

}
