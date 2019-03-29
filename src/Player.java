import java.util.ArrayList;

public class Player {
    private String name, description;
    private ArrayList<Item> items;
    private Level.Room currentRoom;

    public Player(String name, String description) {
        this.name = name;
        this.description = description;
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public Item removeItem(String name) {
        for (Item item : items) {
            if (item.getName().equals(name)) {
                items.remove(item);
                return item;
            }
        }
        return null;
    }

    public boolean destroyItem(String name) {
        for (Item item : items) {
            if (item.getName().equals(name)) {
                return items.remove(item);
            }
        }
        return false;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void displayInventory() {
        System.out.println("Items in Inventory: ");
        if (items.size() == 0) {
            System.out.println("(bag is empty)");
            return;
        }
        String inventory = "";
        for (Item item : items) {
            inventory += "-> " + item.getName() + " >> " + item.getDescription() + "\n";
        }
        if (inventory.length() > 1) inventory = inventory.substring(0, inventory.length() - 1);
        System.out.println(inventory);
    }

    public Level.Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Level.Room newRoom) {
        currentRoom = newRoom;
    }

}