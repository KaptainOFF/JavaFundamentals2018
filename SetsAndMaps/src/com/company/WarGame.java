package com.company;

import java.util.*;

public class WarGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> playerOneSet = new LinkedHashSet<Integer>();
        Set<Integer> playerTwoSet = new LinkedHashSet<>();

        String[] player1 = scanner.nextLine().split("\\s+");
        String[] player2 = scanner.nextLine().split("\\s+");

        for (int i = 0; i < player1.length; i++) {
            playerOneSet.add(Integer.parseInt(player1[i]));
            playerTwoSet.add(Integer.parseInt(player2[i]));
        }

        for (int i = 0; i < 50; i++) {
            if(playerOneSet.isEmpty()) {
                break;
            } else if (playerTwoSet.isEmpty()) {
                break;
            } else {
                Iterator<Integer> playerOneIterator = playerOneSet.iterator();
                Iterator<Integer> playerTwoIterator = playerTwoSet.iterator();
                int playerOneNextNumber = playerOneIterator.next();
                int playerTwoNextNumber = playerTwoIterator.next();
                playerOneSet.remove(playerOneNextNumber);
                playerTwoSet.remove(playerTwoNextNumber);

                if( playerOneNextNumber > playerTwoNextNumber) {
                    playerOneSet.add(playerOneNextNumber);
                    playerOneSet.add(playerTwoNextNumber);
                } else if( playerOneNextNumber < playerTwoNextNumber){
                    playerTwoSet.add(playerOneNextNumber);
                    playerTwoSet.add(playerTwoNextNumber);
                }
            }
        }

        if (playerOneSet.size() > playerTwoSet.size()) {
            System.out.println("First player win!");
        } else {
            System.out.println("Second player win!");
        }
    }
}
