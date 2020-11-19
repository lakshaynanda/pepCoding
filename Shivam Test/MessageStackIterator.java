
import java.util.NoSuchElementException;
import java.util.Iterator;
/**
 * This class implements the Iterator Interface with the non generic data type Message
 * and defines the nest() and the hasNext() methods apart from the constructor.
 * 
 * @author 
 */
public class MessageStackIterator implements Iterator<Message> {

  private LinkedNode < Message > next;
  
  public MessageStackIterator(LinkedNode < Message > topNode) {
    next = topNode;
  }
 
  @Override
  public boolean hasNext() {
    if(next!=null)
      return true;
    else
      return false;
  }
  @Override
  public Message next() {

    if(this.hasNext()) {
      LinkedNode<Message>temp = next;
      next = next.getNext();
      return temp.getData();
    }
    else {
      throw new NoSuchElementException("There is no next element in collection.");
    }
  }

}
