/* This is a stub for the Library class */

import java.util.Hashtable;



public class Library extends Building {

  private Hashtable<String, Boolean> collection;


  /**
  * Constructor for Library
  * @param name name of Library
  * @param address address of Library
  * @param nFloors number of floors in Library
  */
  public Library(String name, String address, int nFloors) {
    super(name, address, nFloors);
    this.collection = new Hashtable<>();
    System.out.println("You have built a library: 📖");
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
   

  
    public static void main(String[] args) {
      new Library("Josten Library", "122 Green St", 2);
    }
  
  }