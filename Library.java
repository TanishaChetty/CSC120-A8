/* This is a stub for the Library class */

import java.util.Hashtable;



public class Library extends Building {

  private Hashtable<String, Boolean> collection;
  private Boolean hasElevator;


  /**
  * Constructor for Library
  * @param name name of Library
  * @param address address of Library
  * @param nFloors number of floors in Library
  * @param hasElevator whether or not the library has an elevator
  */
  public Library(String name, String address, int nFloors, Boolean hasElevator) {
    super(name, address, nFloors);
    this.collection = new Hashtable<>();
    this.hasElevator = hasElevator;
    System.out.println("You have built a library: 📖");
  }

  /* Overloaded constructor with address only */
  public Library(String address) {
    super(); // Call default constructor
    this.address = address; // Override address
}


  /**
  * Accessor to see if the Library has an elevator
  */
  public Boolean hasElevator(){
    return this.hasElevator;
  }

  /**
  * Adding a book to the library collection
  */
  public void addTitle (String title){
    collection.put(title, true);
   
  }

  /**
  * returns the title we removed
  */
  public String removeTitle (String title){
    collection.remove(title, true);
    return title;

  }

  /**
  * checking out a book
  */
  public void checkOut (String title){
    collection.replace(title, true, false);

  }

  /**
  * checking out a book
  */
  public void checkOut (String title, String title2){
    collection.replace(title, true, false);
    collection.replace(title2, true, false);

  }



  /**
  * returning the book the the collection
  */
  public void returnBook (String title){
    collection.replace(title, false, true);

  }

  /**
  * returns true if the title appears as a key in the Libary's collection, false otherwise
  */
  public boolean containsTitle(String title){
    if (collection.contains(title)){
      return true;
    } else {
      return false;
    }

  }

  /**
  * returns true if the title is currently available, false otherwise
  */
  public boolean isAvailable(String title){
    if (collection.get(title) == true){
      return true;
    } else {
      return false;
    }

  }

  /**
  * prints out the entire collection
  */
  public void printCollection(){
    System.out.println(collection.toString());

  }


  /**
  * Show options method from building
  */
  public void showOptions(){
    System.out.println("Available options at " + this.name + ":\n + enter() \n + exit() \n + goUp() \n + goDown()\n + goToFloor(n) \n + addTitle() \n + removeTitle() \n + checkOut() \n + returnBook() \n + containsTitle() \n + isAvailable() \n + printCollection()");

  }

  /**
  * Modifying the go to floor method
  */
  public void goToFloor(int floorNum){
    if (this.hasElevator == true){
      super.goToFloor(floorNum);
    } else {
      System.out.println("Sorry! This house does Not have an elevator");
    }
  
  }
   

  
    public static void main(String[] args) {
      new Library("Josten Library", "122 Green St", 2, true);
    }
  
  }