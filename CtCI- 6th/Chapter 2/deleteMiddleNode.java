import java.io.*;
import java.util.*;

class deleteMiddleNode{
  public void deleteNode(Node node){
    if(node.next != null){
        node.data = node.next.data;
        node.next = node.next.next;
    }
    else{
      throw new NoSuchElementException();
    }
  }
}
