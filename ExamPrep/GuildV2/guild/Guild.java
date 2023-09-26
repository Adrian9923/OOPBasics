package guild;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Guild {
    private List<Player> roster;
    private String name;
    private int capacity;


    public Guild(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.roster = new ArrayList<>();

    }

    public void addPlayer(Player player){
        if (Player.count <= this.capacity) {
            this.roster.add(player);
        }
    }

    public boolean removePlayer(String name) {
        for (Player player : this.roster) {
            if (player.getName().equals(name)){
                this.roster.remove(player);
                return true;
            }
        }
        return false;
    }

    public void promotePlayer(String name) {
        for (Player player : this.roster) {
            if (player.getName().equals(name)){
                player.setRank("Member");
                break;
            }
        }
    }

    public void demotePlayer(String name) {
        for (Player player : this.roster) {
            if (player.getName().equals(name)){
                player.setRank("Trial");
                break;
            }
        }
    }

    public Player[] kickPlayersByClass(String clazz) {
        List<Player> removedPlayers = new ArrayList<>();
        Iterator<Player> iterator = this.roster.iterator();
        while (iterator.hasNext()) {
            Player player = iterator.next();
            if (player.getClazz().equals(clazz)) {
                removedPlayers.add(player);
                iterator.remove();
            }
        }
        return removedPlayers.toArray(new Player[0]);
    }

    public int count() {
        return this.roster.size();
    }

    public String report() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nPlayers in the guild: ").append(this.name).append(":");
        for (Player player : this.roster) {
            sb.append("\n").append(player.toString());
        }
        return sb.toString();
    }

}
