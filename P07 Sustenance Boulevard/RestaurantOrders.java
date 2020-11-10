public class RestaurantOrders implements SortedListADT<Order> {
	private LinkedOrder head;
	private LinkedOrder tail;
	private int size;
	private final int CAPACITY;

	public RestaurantOrders() {
		this.size = 0;
		this.CAPACITY = 20;
		this.head = null;
		this.tail = null;
	}

	public RestaurantOrders(int capacity) {
		this.size = 0;
		this.CAPACITY = capacity;
		this.head = null;
		this.tail = null;
		if (capacity == 0 || capacity < 0) {
			throw new IllegalArgumentException("Error");
		}
	}

	public int capacity() {
		return this.CAPACITY;
	}

	public String readForward() {
		String str = "";
		for (LinkedOrder curr = this.head; curr != null; curr = curr.getNext()) {
			str += curr.getOrder().getDishes() + " ";
		}
		return "The list contains " + this.size + " order(s): [" + str + "]";
	}

	public String readBackward() {
		String str = "";
		for (LinkedOrder curr = this.tail; curr != null; curr = curr.getPrevious()) {
			str += curr.getOrder().getDishes() + " ";
		}
		return "The list contains " + this.size + " order(s): [" + str + "]";
	}

	public void clear() {
		this.size = 0;
		this.head = null;
		this.tail = null;
	}

	public Order get(int index) {
		int count = 0;
		for (LinkedOrder curr = this.head; curr != null; curr = curr.getNext()) {
			if (count == index) {
				return curr.getOrder();
			}
			count++;
		}
		return null;
	}

	public int indexOf(Order findOrder) {
		int count = 0;
		for (LinkedOrder curr = this.head; curr != null; curr = curr.getNext()) {
			if (curr.getOrder().equals(findOrder)) {
				return count;
			}
			count++;
		}
		return -1;
	}

	public boolean isEmpty() {
		if (this.head == null && this.tail == null) {
			return true;
		} else {
			return false;
		}
	}

	public void placeOrder(Order newOrder) {
        try{
            if(newOrder==null) {
                throw new IllegalArgumentException("Error");
            }
            
            if (this.size == this.CAPACITY) {
                return;
            }

            LinkedOrder ord = new LinkedOrder(newOrder);
            if (this.head == null && this.tail == null) {
                this.head = ord;
                this.tail = ord;
                this.size++;
                return;
            }

            if (this.head.getOrder().compareTo(newOrder) == 0) {
                // Error
                throw new IllegalArgumentException("Error");
            } else if (this.head.getOrder().compareTo(newOrder) > 0) {
                // Add at Beginning
                ord.setNext(this.head);
                this.head.setPrevious(ord);
                this.head = ord;
                this.size++;
                return;
            }

            if (this.tail.getOrder().compareTo(newOrder) == 0) {
                // Error
                throw new IllegalArgumentException("Error");
            } else if (this.tail.getOrder().compareTo(newOrder) < 0) {
                // Add at End
                ord.setPrevious(this.tail);
                this.tail.setNext(ord);
                this.tail = ord;
                this.size++;
                return;
            }

            LinkedOrder curr = head;

            while (curr.getNext() != null) {
                if (curr.getNext().getOrder().compareTo(ord.getOrder()) == -1) {
                    curr = curr.getNext();
                } else if (curr.getNext().getOrder().compareTo(ord.getOrder()) == 0) {
                    // Error
                    throw new IllegalArgumentException("Error");
                } else {
                    break;
                }
            }
            ord.setNext(curr.getNext());

            if (curr.getNext() != null) {
                ord.getNext().setPrevious(ord);
            }
            curr.setNext(ord);
            ord.setPrevious(curr);
            this.size++;
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    

	public int size() {
		return this.size;
	}

	public Order removeOrder(int index) {
		if(index>=size||index<0) {
			throw new IndexOutOfBoundsException("Error");
		}
		
		if (this.size == 1) {
			LinkedOrder curr = this.head;
			this.head=null;
			this.tail=null;
			this.size--;
			return curr.getOrder();
		}
		if (index == 0) {
			LinkedOrder curr = this.head;
			this.head = this.head.getNext();
			this.head.getPrevious().setNext(null);
			this.head.setPrevious(null);
			this.size--;
			return curr.getOrder();
		} else if (index == this.size - 1) {
			LinkedOrder curr = this.tail;
			this.tail = this.tail.getPrevious();
			this.tail.getNext().setPrevious(null);
			this.tail.setNext(null);
			this.size--;
			return curr.getOrder();
		} else {
			int count = 0;
			for (LinkedOrder curr = this.head; this.head != this.tail; curr = curr.getNext()) {
				if (count == index) {
					curr.getPrevious().setNext(curr.getNext());
					curr.getNext().setPrevious(curr.getPrevious());
					curr.setPrevious(null);
					curr.setNext(null);
					this.size--;
					return curr.getOrder();
				}
				count++;
			}
		}
		return null;
	}
}