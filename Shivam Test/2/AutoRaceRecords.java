
//MAKE SURE TO SAVE your source file before uploading it to gradescope.
/**
 * This class models a binary search tree (BST) which stores records in an
 * annual auto-race competition. The key search in this BST is the competition
 * year.
 *
 * TODOs: Complete the missing implementation of the following methods 1.
 * isEmpty() 2. size() 3. addWinnerHelper() 4. search() 5. updateRecordTime() 6.
 * getMin() 7. deleteHelper()
 */
class AutoRaceRecords {
	private BSTNode<Winner> root; // root of this BST
	private int size; // total number of winners stored in this auto-racing records BST

// You do not need to define a constructor for this class. The compiler will generate
// automatically a no-argument constructor which creates a new empty Winnerrecords.

	/**
	 * Checks whether this BST is empty
	 * 
	 * @return true if this BST is empty and false otherwise
	 */
	public boolean isEmpty() {
		return size==0; // TODO CHANGE THIS: included to avoid compiler errors
	}

	/**
	 * Returns the size of this BST
	 * 
	 * @return the total number of winners stored in this BST
	 */
	public int size() {
		return size; // TODO CHANGE THIS: included to avoid compiler errors
	}
//MAKE SURE TO SAVE your source file before uploading it to gradescope.

	/**
	 * Adds a new winner to this BST. No changes will be made to the contents of
	 * this BST in case of trying to add a duplicate.
	 * 
	 * @param newWinner to be added to this BST
	 * @throws IllegalStateException if a duplicate with a newWinner is found in
	 *                               this BST.
	 */
	public void addWinner(Winner newWinner) {
// DO NOT MAKE ANY CHANGE TO THE IMPLEMENTATION OF THIS METHOD
		root = addWinnerHelper(newWinner, root);
	}

	/**
	 * Recursive helper method to add newWinner to the subtree rooted at node.
	 * 
	 * @param newWinner new winner to add
	 * @param node      root of the subtree where to add newWinner.
	 * @return the new root of the subtree after adding newWinner.
	 * @throws IllegalStateException with or without error message if a duplicate
	 *                               with a newWinner is found in this BST.
	 */
	
protected BSTNode<Winner> addWinnerHelper(Winner newWinner, BSTNode<Winner> node) {
	
	
	if (node == null) {
		node.setData(newWinner);
	} else {
		int comparison = newWinner.compareTo(node.getData());
		if(comparison == 0) {
			throw new IllegalStateException();
		} else if(comparison<0) {
			node.setLeft(addWinnerHelper(newWinner, node.getLeft()));
		} else {
			node.setRight(addWinnerHelper(newWinner, node.getLeft()));
		}
	}
	
// TODO complete the implementation of this method

// base case1: the current subtree is empty (node is null) --> add newWinner, update size, and
// return the new root (node) of this subtree

// DO NOT CHECK whether newWinner is null or not. The method will automatically throw
// a NullPointerException if this case occurs.
		

// base case2: subtree contains a match with newWinner

// recursive case: recurse left 
// try to insert newWinner to the left subtree

// else recursive case: recurse right 
// try to insert newWinner to the right subtree

		return node; // return the root of this subtree

	}
//MAKE SURE TO SAVE your source file before uploading it to gradescope.

	/**
	 * Looks for the winner of the auto-racing competition held in a specific year
	 *
	 * @param year competition year
	 * @return the winner on the specific year
	 * @throws IllegalStateException with the error message "No winner found!" if no
	 *                               winner was found for the provided year.
	 */
	public Winner search(int year) {
// DO NOT CHECK FOR THE VALIDITY of the input year
// TODO Implement this method\
		
		int cyear = root.getData().getYear();
		
		if(cyear==year) {
			return root.getData();
		}else if(cyear<year) {
			return searchHelper(year, root.getLeft());
		}else {
			return searchHelper(year, root.getRight());
		}
			// CHANGE THIS: included to avoid compiler errors
	}

	/**
	 * Recursive helper method which looks for the winner in the specific year
	 * 
	 * @param year competition year
	 * @param node root of a subtree of this BST
	 * @return the winner of the competition held at the specific year.
	 * @throws IllegalStatetException with the error message "No winner found!" if
	 *                                no winner in the specific year was not found
	 *                                in the subtree rooted at node
	 * 
	 */
	protected static Winner searchHelper(int year, BSTNode<Winner> node) {
// DO NOT MAKE ANY CHANGE TO THE IMPLEMENTATION OF THIS METHOD
		if (node == null) // reach a leaf or this binary search tree empty
			throw new IllegalStateException("No winner found!"); // unsuccessful search

		if (year == node.getData().getYear())
			return node.getData(); // successful search
		if (year < node.getData().getYear())
			return searchHelper(year, node.getLeft()); // recurse on the left child (left sub-tree)
		return searchHelper(year, node.getRight()); // recurse on the right child (right sub-tree)
	}

	/**
	 * Updates the record time of the winner who won the race in a specific year It
	 * PRINTS "No winner found!" if no winner was found for that year. This method
	 * MUST NOT throw any exception.
	 * 
	 * @param year competition year
	 * @param time record time to set
	 */
	public void updateRecordTime(int year, int time) {
		if(this.search(year)==null) {
			System.out.println("No winner found!");
		}else {
			this.search(year).setRecordTime(time);
		}
// TODO Complete the implementation of this method
	}

	/**
	 * Returns the smallest winner (with respect to the result of Winner.compareTo()
	 * method) in the subtree rooted at node
	 * 
	 * @param node root of a subtree of a binary search tree
	 * @return the smallest winner in the subtree rooted at node and null if node is
	 *         null.
	 */
	protected static Winner getMin(BSTNode<Winner> node) {
			
		if(node == null) {
			return null;
		}else {
			while(node.getLeft()!=null) {
				node = node.getLeft();
			}
			return node.getData();
		}
		
// TODO complete the implementation of this method with respect to its specification
// Feel free to design a recursive or an iterative implementation of this method

		 // TODO CHANGE THIS: included to avoid compiler errors
	}
//MAKE SURE TO SAVE your source file before uploading it to gradescope.  

	/**
	 * Deletes a winner given their phone number from this BST.
	 * 
	 * @param year competition year
	 * @throws NoSuchElementException if no match with year was found in this BST.
	 */
	public void delete(int year) {
// DO NOT MAKE ANY CHANGE TO THE IMPLEMENTATION OF THIS METHOD
		Winner toDelete = new Winner("winner", "US", year, 0);
		root = deleteHelper(toDelete, root);
		size--;
	}

	/**
	 * Deletes a winner from this records if match found with the provided one
	 * 
	 * @param winner a winner equal to the winner to be removed
	 * @param node   the root of a subtree of a binary search tree of winners
	 * @return the new root of the subtree after removing the specified winner
	 * @throws NoSuchElementException with or without error message if if no match
	 *                                found
	 * 
	 */
	protected static BSTNode<Winner> deleteHelper(Winner winner, BSTNode<Winner> node) {
		
// TODO Complete the missing code in this implementation
		if (node == null) { // Winner not found
// TODO Missing code
			return node;
		}
		if (winner.compareTo(node.getData()) < 0) {
// TODO recurse on the left subtree rooted at node.getLeft()
// Hint: node.setLeft(/* recursive call */);
			node.setLeft(deleteHelper(winner, node));

		} else if (winner.compareTo(node.getData()) > 0) {
// TODO recurse on the right subtree
			node.setRight(deleteHelper(winner, node));
		} else // Winner found
		if (node.getLeft() != null && node.getRight() != null) { // node has two children
// TODO replace the data of node with the data field value of its successor
			node.setData(getMin(node.getRight()));
// remove the successor
			node.setRight(deleteHelper(node.getData(), node.getRight()));
		} else // node has up to one child
		if (node.getLeft() != null) { // node has one left child
// TODO Set node to its left child
			return node.getRight();

		} else { // node has one right child or zero children
// TODO Set node to its right child
			return node.getLeft();

		}
		return node; // return the new root of this subtree otherwise the changes to node will be
						// lost
	}
//MAKE SURE TO SAVE your source file before uploading it to gradescope.

	/**
	 * Returns a String representation of the contents of this Winner records sorted
	 * in the increasing order
	 * 
	 * @return a String representation of this Winner records
	 */
	@Override
	public String toString() {
		return toStringHelper(root);
	}

	/**
	 * Returns a string representation of this BST
	 * 
	 * @param node root of a subtree of a BST storing winners
	 * @return a String representation of the subtree rooted at node
	 */
	protected static String toStringHelper(BSTNode<Winner> node) {
		String s = "";
		if (node == null)
			return s;
		else {
// visit left subtree
			s = s + toStringHelper(node.getLeft());
// visit data within the current node
			s = s + (node.getData()) + "; ";
// visit right subtree
			s = s + toStringHelper(node.getRight());
			return s;
		}
	}

	/**
	 * Runs a demo of this code
	 */
	public static void demo() {
		AutoRaceRecords records = new AutoRaceRecords();
		System.out.println("Size: " + records.size() + " ; Contents: " + records);
// Size: 0 ; Contents:
		records.addWinner(new Winner("w1", "US", 2000, 300));
		System.out.println("Size: " + records.size() + " ; Contents: " + records);
// Size: 1 ; Contents: w1(2000);
		records.addWinner(new Winner("w2", "US", 2019, 250));
		System.out.println("Size: " + records.size() + " ; Contents: " + records);
// Size: 2 ; Contents: w1(2000); w2(2019);
		records.addWinner(new Winner("w3", "US", 1995, 270));
		System.out.println("Size: " + records.size() + " ; Contents: " + records);
// Size: 3 ; Contents: w3(1995); w1(2000); w2(2019);
		records.addWinner(new Winner("w4", "US", 2005, 260));
		System.out.println("Size: " + records.size() + " ; Contents: " + records);
// Size: 4 ; Contents: w3(1995); w1(2000); w4(2005); w2(2019);
		records.addWinner(new Winner("w5", "US", 1990, 310));
		System.out.println("Size: " + records.size() + " ; Contents: " + records);
// Size: 5 ; Contents: w5(1990); w3(1995); w1(2000); w4(2005); w2(2019);
		records.addWinner(new Winner("w6", "US", 1998, 280));
		System.out.println("Size: " + records.size() + " ; Contents: " + records);
// Size: 6 ; Contents: w5(1990); w3(1995); w6(1998); w1(2000); w4(2005); w2(2019);
		System.out.println("Try to update the record time for 2005 race. ");
		records.updateRecordTime(2005, 275);
// Try to update the record time for 2005 race.
		System.out.print("Try to update the record time for 2010 race. ");
		records.updateRecordTime(2010, 200);
// Try to update the record time for 2010 race. No winner found!
		records.delete(2019);
		System.out.println("Size: " + records.size() + " ; Contents: " + records);
// Size: 5 ; Contents: w5(1990); w3(1995); w6(1998); w1(2000); w4(2005);
		records.delete(1995);
		System.out.println("Size: " + records.size() + " ; Contents: " + records);
// Size: 4 ; Contents: w5(1990); w6(1998); w1(2000); w4(2005);
	}

	/**
	 * main method
	 * 
	 * @param args input arguments
	 */
	public static void main(String[] args) {
		demo();
	}
}