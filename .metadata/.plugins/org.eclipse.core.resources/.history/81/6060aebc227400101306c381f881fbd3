package Day_3;

public class Voter {
	
	private String voter_Id;
    private String name;
    private boolean has_Voted;
    
    public void setVoterId(String voterId) {
        this.voter_Id = voterId;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getVoterId() {
        return voter_Id;
    }
    public String getName() {
        return name;
    }
    
    public void vote() {
        if (!has_Voted) {
            has_Voted = true;
            System.out.println(name + " has voted successfully.");
        } else {
            System.out.println(name + " has already voted. Duplicate voting not allowed!");
        }
    }
    public boolean hasAlreadyVoted() {
        return has_Voted;
    }
    
}
