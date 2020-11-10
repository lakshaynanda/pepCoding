public class LinkedOrder{
    private final Order ORDER;
    private LinkedOrder previous;
    private LinkedOrder next;

    public LinkedOrder (Order order){
        this.previous = null;
        this.next = null;
        this.ORDER = order;
        if(order.compareTo(new Order("",0))==-1){
            throw new IllegalArgumentException("Error");
        }
    }
    public LinkedOrder(Order order, LinkedOrder prev, LinkedOrder next){
        this.ORDER = order;
        this.previous = prev;
        this.next = next;
        if(order.compareTo(new Order("",0))==-1){
            throw new IllegalArgumentException("Error");
        }
    }
    public Order getOrder(){
        return this.ORDER;
    }
    public LinkedOrder getPrevious(){
        return this.previous;
    }
    public LinkedOrder getNext(){
        return this.next;
    }
    public void setPrevious(LinkedOrder previous){
        this.previous = previous;
    }
    public void setNext(LinkedOrder next){
        this.next = next;
    }
}