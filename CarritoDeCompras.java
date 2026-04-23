import java.util.ArrayList;

 class Carrito{
    private ArrayList<Item> items;

    public Carrito() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }
}

class Item {}