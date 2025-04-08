import java.util.ArrayList;


/* This is a stub for the House class */


public class House extends Building {
  // Attributes
  private ArrayList<Student> residents;
  private Boolean hasDiningRoom;
  private Boolean hasElevator;

/**
  * Constructor for House
  * @param name name of House
  * @param address address of House
  * @param nFloors number of floors in House
  * @param hasDiningRoom whether or not the House has a dining room
  * @param hasElevator whether or not the House has an elevator
  */  
public House(String name, String address, int nFloors, Boolean hasDiningRoom, Boolean hasElevator) {
    super(name, address, nFloors);
    this.residents = new ArrayList<Student>();
    this.hasDiningRoom = hasDiningRoom;
    this.hasElevator = hasElevator;
    System.out.println("You have built a house: 🏠");
  }


  /* Overloaded constructor with address only */
  public House(String address) {
    super(); // Call default constructor
    this.address = address; // Override address
}

  /**
  * Accessor to see if the House has a dining room
  */
  public Boolean getHasDiningRoom(){
    return this.hasDiningRoom;
    }


  /**
  * Accessor to see if the House has an elevator
  */
  public Boolean hasElevator(){
    return this.hasElevator;
  }

  /**
  * Accessor to see how many people live in the House
  */
  public Integer nResidents() {
    return this.residents.size();
  }

  /**
  * Updates the residents when someone moves in
  */
  public void moveIn(Student s){
    this.residents.add(s);
  }

  /**
  * OVERLOADING when two residents move into a double together
  */
  public void moveIn(Student d, Student k){
    this.residents.add(d);
    this.residents.add(k);

  }



  /**
  * Updates the residents when someone moves out, returns the student
  */
  public Student moveOut(Student s){
    if (residents.contains(s)){
      this.residents.remove(s);
    }
    return (s);
  }


  /**
  * Show options method from building
  */
  public void showOptions(){
    System.out.println("Available options at " + this.name + ":\n + enter() \n + exit() \n + goUp() \n + goDown()\n + goToFloor(n) \n + moveOut() \n + moveIn()");
  

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
    new House("Talbot House", "25 Prospect Street", 4, false, false);
    new House("26 Prospect Street");
  }

}

