import java.util.ArrayList;


/* This is a stub for the House class */


public class House extends Building {
  // Attributes
  private ArrayList<Student> residents;
  private Boolean hasDiningRoom;

/**
  * Constructor for House
  * @param name name of House
  * @param address address of House
  * @param nFloors number of floors in House
  * @param hasDiningRoom whether or not the House has a dining room
  */  
public House(String name, String address, int nFloors, Boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.residents = new ArrayList<Student>();
    this.hasDiningRoom = hasDiningRoom;
    System.out.println("You have built a house: 🏠");
  }

  /**
  * Accessor to see if the House has a dining room
  */
  public Boolean getHasDiningRoom(){
    return this.hasDiningRoom;
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
  * Updates the residents when someone moves out, returns the student
  */
  public Student moveOut(Student s){
    if (residents.contains(s)){
      this.residents.remove(s);
    }
    return (s);
  }

  




  public static void main(String[] args) {
    new House("Talbot House", "25 Prospect Street", 4, false);
  }

}

