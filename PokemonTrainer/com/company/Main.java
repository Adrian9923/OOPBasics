package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<Pokemon>> trainerInfo = new LinkedHashMap<>();
        LinkedHashMap<String, Trainer> trainersPrinted = new LinkedHashMap<>();
        Pokemon pokemon = null;
        Trainer trainer = null;

        String command = scanner.nextLine();
        while (!command.equals("Tournament")) {

            String[] cmdParts = command.split("\\s+");
            String trainerName = cmdParts[0];
            String pokemonName = cmdParts[1];
            String element = cmdParts[2];
            int health = Integer.parseInt(cmdParts[3]);
            pokemon = new Pokemon(pokemonName, element, health);
            if (!trainerInfo.containsKey(trainerName)) {
                trainerInfo.put(trainerName, new ArrayList<>());
                trainerInfo.get(trainerName).add(pokemon);
            }else {
                trainerInfo.get(trainerName).add(pokemon);
            }
            trainer = new Trainer(trainerName, 0, 0);
            if (!trainersPrinted.containsKey(trainerName)) {
                trainersPrinted.put(trainerName, trainer);
            }

            command = scanner.nextLine();
        }
        String line = scanner.nextLine();
        while (!line.equals("End")) {

            String element = line;
            boolean elementFound = false;

            for (Map.Entry<String, List<Pokemon>> a : trainerInfo.entrySet()) {
                for (Pokemon z : a.getValue()) {
                    if (z.getElement().equals(element)){
                        trainersPrinted.get(a.getKey()).setNumBadges();
                        elementFound = true;
                        break;
                    }
                }
                if (!elementFound) {
                    ArrayDeque<Integer> deadPokemonIndexes = new ArrayDeque<>();

                    for (int i = 0; i < a.getValue().size(); i++) {
                        Pokemon currentPokemon = a.getValue().get(i);
                        currentPokemon.damagePokemon();
                        if (currentPokemon.getHealth() <= 0) {
                            deadPokemonIndexes.push(i);
                        }
                    }
                    while (!deadPokemonIndexes.isEmpty()) {
                        int index = deadPokemonIndexes.pop();
                        a.getValue().remove(index);
                    }
                }
            }


            line = scanner.nextLine();
        }

        trainersPrinted.entrySet().stream().forEach(a -> {
            trainerInfo.entrySet().stream().forEach(b -> {
                if (a.getKey().contains(b.getKey())) {
                    a.getValue().setPokemonCollections(b.getValue().size());
                }
            });
        });

        trainersPrinted.entrySet().stream()
                .sorted((a, b) -> Integer.compare(b.getValue().getNumBadges(),a.getValue().getNumBadges()))
                .forEach(a -> {
                    System.out.printf("%s %d %d\n",a.getValue().getName(), a.getValue().getNumBadges(), a.getValue().getPokemonCollections());
                });
    }
}


