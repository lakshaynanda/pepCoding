///////////////////////// CUMULATIVE QUIZ FILE HEADER //////////////////////////
//Full Name:
//Campus ID:
//WiscEmail:
////////////////////////////////////////////////////////////////////////////////

//MAKE SURE TO SAVE your source file before uploading it to gradescope.
import java.util.NoSuchElementException;

/**
 * This class models a winner in an annual auto-racing competition
 * 
 * TODO: Override the public int compareTo(Winner other){} method conforming to
 * the specification provided below. A winner is smaller than another winner if
 * its year is smaller than the other winner's year. A winner is greater than
 * another winner if its year is greater than the other winner's year. Two
 * winners are equals if they have the same winning year.
 * 
 */
class Winner implements Comparable<Winner> {
//Do not add any additional data field to this class
	private String name; // name of this winner
	private String country; // home country of this winner
	private int year; // competition year of this winner
	private int recordTime; // record time accomplished by this winner

// Do not make any change to the constructor and the getter/setter methods of this class
// The only method to change in this class is compareTo() method

	/**
	 * Creates a new winner
	 * 
	 * @param name    name to be assigned to this winner
	 * @param country home country of this winner
	 * @param year    competition year
	 * @param time    race record time accomplished by this winner
	 */
	public Winner(String name, String country, int year, int time) {
		this.name = name;
		this.country = country;
		this.year = year;
		this.recordTime = time;
	}

	/**
	 * Compares this Winner to another winner based on their competition years
	 * 
	 * @param other other winner to compare to
	 * @return a non-zero positive integer if this winner is greater than the other
	 *         winner, zero if this winner equals other, a non-zero negative integer
	 *         if this winner is less than the other winner.
	 */
	@Override
	public int compareTo(Winner other) {
		
		return Integer.compare(year, other.year);
		
// TODO Complete the implementation of this method
// TODO CHANGE THIS: included to avoid compiler errors
	}

	/**
	 * Checks whether this winner equals a specific object
	 * 
	 * @param o an object
	 * @return true if this winner equals the input provided object and false
	 *         otherwise
	 */
	@Override
	public boolean equals(Object o) {
		return o instanceof Winner && this.year == (((Winner) o).year);
	}

	/**
	 * Returns a String representation of this winner
	 * 
	 * @return a String representation of this winner
	 */
	@Override
	public String toString() {
		return this.name + "(" + this.year + ")";
	}

	/**
	 * Gets the record race time of this winner
	 * 
	 * @return the time
	 */
	public int getRecordTime() {
		return recordTime;
	}

	/**
	 * Sets the record race time of this winner
	 * 
	 * @param recordTime the record time to set
	 */
	public void setRecordTime(int recordTime) {
		this.recordTime = recordTime;
	}

	/**
	 * Returns the name of this winner
	 * 
	 * @return the name of this winner
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the home country of this winner
	 * 
	 * @return the country of this winner
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * Returns the competition year of this winner
	 * 
	 * @return the competition year
	 */
	public int getYear() {
		return year;
	}

}
