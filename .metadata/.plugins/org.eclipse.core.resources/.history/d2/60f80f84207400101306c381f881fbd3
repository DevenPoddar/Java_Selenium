package com;
import java.util.Scanner;

class Player {
    String name;
    Integer score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class Score_Board {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
        Player[] players = new Player[100];
        int count = 0;
        int choice;

        do {
            System.out.println("\n===== SCOREBOARD MENU =====");
            System.out.println("1. Add Player with Initial Score");
            System.out.println("2. Update Existing Player's Score");
            System.out.println("3. Display Scoreboard");
            System.out.println("4. Remove Player");
            System.out.println("5. Reset All Scores");
            System.out.println("6. Exit");
            
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter player name: ");
                String name = sc.nextLine();
                boolean exists = false;

                for (int i = 0; i < count; i++) {
                    if (players[i].name.equalsIgnoreCase(name)) {
                        exists = true;
                        break;
                    }
                }

                if (!exists) {
                    System.out.print("Enter initial score: ");
                    int score = sc.nextInt();
                    
                    players[count++] = new Player(name, score);
                    System.out.println(name + " added with score: " + score);
                } 
                else {
                    System.out.println("Player already exists.");
                }

            } 
            else if (choice == 2) {
                System.out.print("Enter player name to update score: ");
                String name = sc.nextLine();
                boolean found = false;

                for (int i = 0; i < count; i++) {
                    if (players[i].name.equalsIgnoreCase(name)) {
                        System.out.print("Enter new score to update (add to existing): ");
                        int addScore = sc.nextInt();
                        players[i].score += addScore;
                        System.out.println("Updated score for " + name + ": " + players[i].score);
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Player not found.");
                }

            } 
            else if (choice == 3) {
                if (count == 0) {
                    System.out.println("Scoreboard is empty.");
                } 
                else {
               
                    for (int i = 0; i < count - 1; i++) {
                        for (int j = i + 1; j < count; j++) {
                            if (players[j].score > players[i].score) {
                                Player temp = players[i];
                                players[i] = players[j];
                                players[j] = temp;
                            }
                        }
                    }

                    System.out.println("\n=== SORTED SCOREBOARD ===");
                    for (int i = 0; i < count; i++) {
                        System.out.println(players[i].name + ": " + players[i].score);
                    }
                }

            } 
            else if (choice == 4) {
                System.out.print("Enter player name to remove: ");
                String name = sc.nextLine();
                boolean removed = false;

                for (int i = 0; i < count; i++) {
                    if (players[i].name.equalsIgnoreCase(name)) {
                        for (int j = i; j < count - 1; j++) {
                            players[j] = players[j + 1];
                        }
                        players[--count] = null;
                        System.out.println(name + " removed.");
                        removed = true;
                        break;
                    }
                }

                if (!removed) {
                    System.out.println("Player not found.");
                }

            } 
            else if (choice == 5) {
                for (int i = 0; i < count; i++) {
                    players[i].score = 0;
                }
                System.out.println("All scores have been reset to 0.");

            } 
            else if (choice == 6) {
                System.out.println("Exiting...");

            } 
            else {
                System.out.println("Invalid choice.");
            }

        } while (choice != 6);

    }

}
