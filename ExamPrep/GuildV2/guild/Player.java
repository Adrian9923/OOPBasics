package guild;

public class Player {
    private String name;
    private String clazz;
    private String rank;
    private String description;
    static int count = 0;

    public Player(String name, String clazz) {
        this.name = name;
        this.clazz = clazz;
        this.rank = "Trial";
        this.description = "n/a";
        count++;
    }

    public String getName() {
        return name;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getClazz() {
        return clazz;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("Player %s: %s\nRank: %s\nDescription: %s",this.name,this.clazz,this.rank,this.description);
    }
}
