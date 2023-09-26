package guild;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Guild {
    private Collection<Player> roster;
    private String name;
    private int capacity;

    public Guild(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.roster = new ArrayList<>();

    }

    public void addPlayer(Player player){
        if (this.roster.size() + 1 <= this.capacity) {
            this.roster.add(player);
        }
    }

    public boolean removePlayer(String name) {
       return this.roster.removeIf(p -> p.getName().equals(name));
    }

    public void promotePlayer(String name) {
       Player playerToPromote = this.getPlayerByName(name);
       if (playerToPromote != null && !playerToPromote.getRank().equals("Member")) {
           playerToPromote.setRank("Member");
       }
    }

    public void demotePlayer(String name) {
        Player playerToDemote = this.getPlayerByName(name);
        if (playerToDemote != null && !playerToDemote.getRank().equals("Trial")) {
            playerToDemote.setRank("Trial");
        }
    }

    public Player[] kickPlayersByClass(String clazz) {
        List<Player> playersToKick = this.roster.stream().filter(p -> p.getClazz().equals(clazz)).collect(Collectors.toList());

        Player[] kickedPlayers = new Player[playersToKick.size()];
        playersToKick.toArray(kickedPlayers);
        this.roster.removeAll(playersToKick);
        return kickedPlayers;

    }

    public int count() {
        return this.roster.size();
    }

    public String report() {
        String guildInfo = String.format("Players in the guild: %s:\n",this.name);
        StringBuilder sb = new StringBuilder(guildInfo);
        for (Player player : this.roster) {
            sb.append(player.toString()).append(System.lineSeparator());
        }
        return sb.toString().trim();
    }


    private Player getPlayerByName(String name) {
        for (Player player : this.roster) {
            if (player.getName().equals(name)) {
                return player;
            }
        }
        return null;
    }

}
