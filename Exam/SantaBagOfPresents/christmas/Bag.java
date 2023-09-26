package christmas;

import java.util.ArrayList;
import java.util.List;

public class Bag {
    private String color;
    private int capacity;
    private List<Present> data;

    public Bag(String color, int capacity) {
        this.color = color;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public String getColor() {
        return this.color;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int count(){
        return this.data.size();
    }

    public void add(Present present){
        if (this.data.size() <= this.getCapacity()) {
            this.data.add(present);
        }
    }

    public boolean remove(String name) {
        for (Present gift : this.data) {
            if (gift.getName().equals(name)){
                this.data.remove(gift);
                return true;
            }
        }
        return false;
    }

    public Present heaviestPresent() {
        Present heaviest = null;
        double max = 0;
        for (Present gift : this.data) {
            if (gift.getWeight() >= max){
                max = gift.getWeight();
                heaviest = gift;
            }
        }
        return heaviest;
    }

    public Present getPresent(String name) {
        Present presentToGet = null;
        for (Present gift : this.data) {
            if (gift.getName().equals(name)){
                presentToGet = gift;
            }
        }
        return presentToGet;
    }

    public String report() {
        String bagInfo = String.format("%s bag contains:\n",this.color);
        StringBuilder sb = new StringBuilder(bagInfo);
        for (Present gift : this.data) {
            sb.append(gift.toString()).append(System.lineSeparator());
        }
        return sb.toString().trim();
    }
}
