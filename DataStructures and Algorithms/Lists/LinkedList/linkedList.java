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
  public Node getFirst(){
    Node temp = head;
    if(head!= null){
      System.out.println("First -- Data: "+temp.data+" Next: "+temp.next);
      return temp;
    }
    else{
      throw new NoSuchElementException();

    }
  }

  //Delete the first element in the linkedList
  public void deleteFirst(){
    System.out.println("DeletedFirst -- Data: "+head.data+" Next: "+head.next);
    head = head.next;
  }
  //add element in the end of a node
  public void addLast(AnyType data){
    if(head == null){
      addFirst(data);
    }
    else{
      Node<AnyType> temp = head;
      while(temp!= null){
        if(temp.next==null){
            temp.next = new Node<AnyType>(data, null);
            break;
        }
        temp=temp.next;
      }
      System.out.println("Added at last --Data: "+temp.next.data+" Next: "+temp.next.next);
    }
  }
  //deleteElement at the last
  public void deleteLast(){
    if(head != null){
      Node<AnyType> curr = head;
      Node<AnyType> prev = null;
      while(curr.next!= null){
        prev=curr;
        curr=curr.next;
      }
      prev.next= curr.next;
      System.out.println("Deletedlast --Data: "+curr.data+" Next: "+curr.next);

    }
    else{
      throw new NoSuchElementException();
    }
  }

  //Get the node from the data
  public Node getNode(AnyType data){
    Node temp = head;
    while(temp!= null){
      if(temp.data == data){
        System.out.println("Found Node -- "+temp+" Data: "+temp.data+" Next: "+temp.next);
        return temp;
      }
      temp = temp.next;
    }
    return null;
  }

  //Get the node from the data
  public Object getData(Node n){
    Node temp = head;
    while(temp!= null){
      if(temp == n){
        System.out.println("Found -- Data: "+temp.data+" at Next: "+temp.next);
        return temp.data;
      }
      temp = temp.next;
    }
    return null;
  }

  //delete a node which is specified
  public void deleteNode(Node node){
    if(node.next != null){
        System.out.println("DeletedAtNode -- Node: "+node+" Data: "+node.data+" Next: "+node.next);
        node.data = node.next.data;
        node.next = node.next.next;
    }
    else{
      throw new NoSuchElementException();
    }
  }
  //Insert After
  public void insertAfter(AnyType position,AnyType data){
    Node temp = getNode(position);
    temp.next = new Node(data,temp.next);
    System.out.println("Inserted After -- "+position+" Data: "+temp.next.data+" Next: "+temp.next.next);
  }
  //insertBefore
  public void insertBefore(AnyType position,AnyType data){
    Node pos = getNode(position);
    Node curr = head;
    Node prev = null;
    while(curr!= pos){
      prev=curr;
      curr=curr.next;
    }
    prev.next = new Node(data,prev.next);
    curr.next = pos.next;
    System.out.println("Inserted Before -- "+position+" Data: "+prev.next.data+" Next: "+prev.next.next);
  }


  //traverse and print list
  public void traverse(){
    Node temp = head;
    System.out.println("\n-- List Contents --");
    while(temp!= null){
      System.out.println("Data: "+temp.data+" Next: "+temp.next);
      temp = temp.next;
    }
    System.out.println();
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
     //Using Main to Check the LinkedList Functions
     linkedList<String> list = new linkedList <String>();
     list.addFirst("p");
     list.addFirst("a");
     list.addFirst("e");
     list.addFirst("h");
     list.traverse();
     list.getFirst();
     list.deleteFirst();
     list.traverse();
     list.deleteNode(list.getNode("e"));
     list.traverse();
     list.addLast("s");
     list.traverse();
     list.deleteLast();
     list.traverse();
     list.insertAfter("a","n");
     list.traverse();
     list.insertBefore("n","o");
     list.traverse();
     list.getData(list.getNode("n"));
   }

}
