import java.util.ArrayList;

public class CampusMap {

    ArrayList<Building> buildings;

    /* Default constructor, initializes empty ArrayList */
    public CampusMap() {
        buildings = new ArrayList<Building>();
    }

    /**
     * Adds a Building to the map
     * @param b the Building to add
     */
    public void addBuilding(Building b) {
        System.out.println("Adding building...");
        buildings.add(b);
        System.out.println("-->Successfully added " + b.getName() + " to the map.");
    }

    /**
     * Removes a Building from the map
     * @param b the Building to remove
     * @return the removed Building
     */
    public Building removeBuilding(Building b) {
        System.out.println("Removing building...");
        buildings.remove(b);
        System.out.println("-->Successfully removed " + b.getName() + " to the map.");
        return b;
    }

    public String toString() {
        String mapString = "DIRECTORY of BUILDINGS";

        for (int i = 0; i < this.buildings.size(); i ++) {
            mapString += "\n  " + (i+1) + ". "+ this.buildings.get(i).getName() + " (" + this.buildings.get(i).getAddress() + ")";
        }
        return mapString;
    }

    public static void main(String[] args) {
        CampusMap myMap = new CampusMap();
        myMap.addBuilding(new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Bass Hall", "4 Tyler Court Northampton, MA 01063", 4));
        myMap.addBuilding(new Library("Neilson Library", "7 Neilson Drive", 5, true)); //1
        myMap.addBuilding(new House("Talbot House", "25 Prospect Street", 4, false, false)); //2
        myMap.addBuilding(new Building("Seelye Hall", "2 Seelye Drive", 4)); //3
        myMap.addBuilding(new Cafe("Campus Center Cafe", "100 Elm Street", 1)); //4
        myMap.addBuilding(new House("Gillett House", "47 Elm Streeet", 4, true, true)); //5
        myMap.addBuilding(new House("Gardiner House", "1 Paradise Road", 4, false, false)); //6
        myMap.addBuilding(new Library("122 Green Street")); //7
        myMap.addBuilding(new Building("2 Tyler Ct")); //8
        myMap.addBuilding(new House("26 Prospect Street")); //9
        myMap.addBuilding(new Cafe("7 Neilson Drive")); //10
        System.out.println(myMap);
    }
    
}
