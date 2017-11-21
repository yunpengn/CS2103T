import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item();
        Item item2 = new Item();

        Box box1 = new Box(item1);
        Box box2 = new Box(item2);

        item2.setMainCard(new Card());
        item2.addPreviousBox(box1);
        item2.addPreviousBox(box2);
    }
}

class Box {
    private Item item;

    Box (Item item) {
        this.item = item;
    }
}

class Item {
    private List<Box> previousBoxes = new ArrayList<>();
    private Card mainCard = null;
    private Card subCard = null;

    void setMainCard(Card card) {
        this.mainCard = card;
    }
    
    void setSubCard(Card card) {
        this.subCard = card;
    }

    void addPreviousBox(Box previousBox) {
        previousBoxes.add(previousBox);
    }
}

class Card {
    
}
