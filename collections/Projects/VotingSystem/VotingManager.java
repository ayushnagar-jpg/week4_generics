package collections.Projects.VotingSystem;

import java.util.Collections;
import java.util.Map;

public class VotingManager {
    private VotingSystem votingSystem;

    public VotingManager(VotingSystem votingSystem) {
        this.votingSystem = votingSystem;
    }

    public void displayVotesInOrder() {
        System.out.println("Votes in Order of Voting:");
        for (Map.Entry<String, Integer> entry : votingSystem.getOrderedVoteMap().entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue() + " votes");
        }
    }

    public void displaySortedResults() {
        System.out.println("\nVotes in Sorted Order (Alphabetical):");
        for (Map.Entry<String, Integer> entry : votingSystem.getSortedVoteMap().entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue() + " votes");
        }
    }

    public void displayWinner() {
        String winner = Collections.max(votingSystem.getVoteMap().entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("\nWinner: " + winner + " with " + votingSystem.getVoteMap().get(winner) + " votes.");
    }
}
