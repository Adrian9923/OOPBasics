package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] current_state = scanner.nextLine().split(" ");

        // Create a state machine for each traffic light
        TrafficLights[] state_machines = new TrafficLights[current_state.length];
        for (int i = 0; i < current_state.length; i++) {
            state_machines[i] = TrafficLights.valueOf(current_state[i]);
        }

        // Parse the input to get the number of state changes
        int n = scanner.nextInt();

        // Update the state of each traffic light n times
        for (int i = 0; i < n; i++) {
            // Update the state of each traffic light
            for (int j = 0; j < state_machines.length; j++) {
                state_machines[j] = getNextState(state_machines[j]);
                System.out.print(state_machines[j] + " ");
            }
            System.out.println();
        }

    }

    private static TrafficLights getNextState(TrafficLights state) {
        switch (state) {
            case RED:
                return TrafficLights.GREEN;
            case GREEN:
                return TrafficLights.YELLOW;
            case YELLOW:
                return TrafficLights.RED;
            default:
                return state;
        }
    }
}


