package collections.Projects.VotingSystem;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;

public class VotingSystem {
    private Map<String, Integer> voteMap;
    private Map<String, Integer> orderedVoteMap;
    private Map<String, Integer> sortedVoteMap;

    public VotingSystem() {
        voteMap = new HashMap<>(); // Quick access to votes
        orderedVoteMap = new LinkedHashMap<>(); // Maintains order of votes
        sortedVoteMap = new TreeMap<>(); // Sorted order of candidates
    }

    public void castVote(String candidate) {
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
        orderedVoteMap.put(candidate, orderedVoteMap.getOrDefault(candidate, 0) + 1);
        sortedVoteMap.put(candidate, sortedVoteMap.getOrDefault(candidate, 0) + 1);
    }

    public Map<String, Integer> getVoteMap() {
        return voteMap;
    }

    public Map<String, Integer> getOrderedVoteMap() {
        return orderedVoteMap;
    }

    public Map<String, Integer> getSortedVoteMap() {
        return sortedVoteMap;
    }
}
