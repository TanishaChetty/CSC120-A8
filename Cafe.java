/* This is a stub for the Cafe class */
public class Cafe extends Building{

    // Attributes
    private int nCoffeeOunces;
    private int nSugarPackets;
    private int nCreams;
    private int nCups;

    
    /**
    * Constructor for Cafe
    * @param name name of Cafe
    * @param address address of Cafe
    * @param nFloors number of floors in Cafe
    */
    public Cafe(String name, String address, int nFloors) {
        super (name, address, nFloors);
        this.nCoffeeOunces = 500;
        this.nSugarPackets = 100;
        this.nCreams = 100;
        this.nCups = 100;
        System.out.println("You have built a cafe: ☕");
    }

    /**
     * Selling coffee and subtracting from inventory
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams){

        if (size > this.nCoffeeOunces || nSugarPackets > this.nSugarPackets || nCreams > this.nCreams){
            restock(500, 100, 100, 100);
        }

        this.nCoffeeOunces = this.nCoffeeOunces - size;
        this.nSugarPackets = this.nSugarPackets - nSugarPackets;
        this.nCreams = this.nCreams - nCreams;
        this.nCups = this.nCups - 1;

    }

    /**
     * Restocking inventory!
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces = this.nCoffeeOunces + nCoffeeOunces;
        this.nSugarPackets = this.nSugarPackets + nSugarPackets;
        this.nCreams = this.nCreams + nCreams;
        this.nCups = this.nCups + nCups;

    }

   


    
    public static void main(String[] args) {
        new Cafe("Compass Cafe", "7 Neilson Drive", 1);
    }
    
}
