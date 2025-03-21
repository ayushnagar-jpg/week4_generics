package collections.Projects.VotingSystem;

public class Main {
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();
        VotingManager votingManager = new VotingManager(votingSystem);

        // Casting votes
        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");
        votingSystem.castVote("Charlie");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");

        // Display voting results
        votingManager.displayVotesInOrder();
        votingManager.displaySortedResults();
        votingManager.displayWinner();
    }
}
