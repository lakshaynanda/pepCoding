

import java.util.EmptyStackException;
import java.util.Iterator;
/**
 * This class implements the Inbox Object with different data fields and methods.
 * 
 * @author
 */
public class Inbox {

  private MessageStack readMessageBox; // stack which stores read messages
  private MessageStack unreadMessageBox; // stack which stores unread messages
  
  /**
   * This no-argument constructor creates a new empty inbox and initializes its instance fields.
   * Both unreadMessageBox and readMessageBox stacks of this inbox must be initially empty.
   */
  public Inbox() {
    this.readMessageBox = new MessageStack();
    this.unreadMessageBox = new MessageStack();
  }

  /**
   * Reads the message at the top of the unreadMessageBox. Once read, the message must be 
   * moved from the unreadMessageBox to the readMessageBox. This method returns the string
   * representation of the message at the top of the unreadMessageBox, or "Nothing in
   * Unread" if the unreadMessageBox of this inbox is empty.
   * 
   * @return String Message that has been read from the Read stack.
   */
  public String readMessage() {
  
    if(this.unreadMessageBox.isEmpty())
      return "Nothing in Unread";

    Message popped;
    popped = this.unreadMessageBox.pop();
    /*
    try {
      popped = this.unreadMessageBox.pop();
    } catch (EmptyStackException ese) {
      return "Nothing in Unread";
    }
    */
    this.readMessageBox.push(popped);
    return popped.toString();
  }

  /**
   * Returns the string representation of the message at the top of the readMessageBox. 
   * This method returns the string representation of the message at the top 
   * readMessageBox and "Nothing in Read" if the readMessageBox is empty.
   * 
   * @return Message at the top of the Read stack.
   */
  public String peekReadMessage() {
    Message peekRead;
    try {
      peekRead = this.readMessageBox.peek();
    } catch (EmptyStackException ese) {
      return "Nothing in Read";
    }
    
    return peekRead.toString();
  }

  /**
   * Marks all messages in the unread message box as read. The unread message box must be empty
   * after this method returns. Every message marked read must be moved to the read messages box.
   * This method returns the total number of messages marked as read.
   * 
   * @return int total number of messages marked as read.
   */
  public int markAllMessagesAsRead() {
    int counter = 0;

    while (this.unreadMessageBox.size() != 0) {
      Message popped;

      popped = this.unreadMessageBox.pop();
      this.readMessageBox.push(popped);
      counter++;
    }
    return counter;
  }

  /**
   * Pushes a newMessage into the unread message box. newMessage represents a reference to the
   * received message. Note that this method can be invoked each time a new message will be 
   * received and pushed to the unreadMessageBox.
   * 
   * @param newMessage The Message to push into the Unread Stack.
   */
  public void receiveMessage(Message newMessage) {
   
    this.unreadMessageBox.push(newMessage);
  }

  /**
   * Removes permanently all the messages from the readMessageBox. This method returns the total
   * number of the removed messages.
   * 
   * @return number of removed messages.
   */
  public int emptyReadMessageBox() {
    int counter = 0;
    
    while(this.readMessageBox.size()!=0) {
      this.readMessageBox.pop();
      counter++;
    }
    
    return counter;
  }

  /**
   * Gets the statistics of this In box Returns a String formatted as follows: "Unread (size1)" +
   * "\n" + "Read (size2)", where size1 and size2 represent the number of unread and read messages
   * respectively.
   * 
   * @return Formatted String which has statistics of the Stacks.
   */
  public String getStatistics() {
    
    String str = "";
    
    str = str + "Unread (" + this.unreadMessageBox.size() + ")" + "\n" + "Read (" + this.readMessageBox.size() + ")";
    
    return str;
   
  }

  /**
   * Traverses all the unread messages and return a list of their ID + " " + SUBJECT,
   * as a string. Every string representation of a message is provided in a new line.
   * This method returns a String representation of the contents of the unread message box.
   * 
   * @return Formatted String or The returned output has the following format:
   *         Unread(unreadMessageBox_size)\n + list of the messages in unreadMessageBox
   *         (ID + " " + SUBJECT) each in a line.
   */
  public String traverseUnreadMessages() {
 
    
    String str = "";
    Iterator<Message> iter = unreadMessageBox.iterator();
    str = str + ("Unread(" + unreadMessageBox.size() + ")" + "\n");
    
    while(iter.hasNext()) {
      Message temp = iter.next();
      str = str + ("Unread(" + unreadMessageBox.size() + ")" + "\n") + temp.getID() + " " + temp.getSUBJECT() + "\n";
    }

    return str;
  }

  /**
   * Traverses all the read messages and return a list of their string representations, ID + " " +
   * SUBJECT, each per new line, as a string This method returns a String representation of the
   * contents of the read message box
   * 
   * @return The returned output has the following format: Read(readMessageBox_size)\n + list of
   *         the messages in readMessageBox (ID + " " + SUBJECT) each in a line.
   */
  public String traverseReadMessages() {
 

    String str = "";
    Iterator<Message> iter = readMessageBox.iterator();
    str = str+ ("Read(" + readMessageBox.size() + ")\n");
    
    while(iter.hasNext()) {
      Message temp = iter.next();
      str = str + temp.getID() + " " + temp.getSUBJECT() + "\n";
    }

    return str;

  }


}
