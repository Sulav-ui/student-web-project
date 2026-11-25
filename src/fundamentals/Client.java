package fundamentals;

public class Client {
	
	private int clientId;
	private String clientName;
    private String clientAdd;
    
    public Client (int clientId, String clientName, String clientAdd) {
        this.clientId = clientId;
        this.clientName = clientName;
        this.clientAdd = clientAdd;
    }
    
    public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getClientAdd() {
		return clientAdd;
	}
	public void setClientAdd(String clientAdd) {
		this.clientAdd = clientAdd;
	}
	
	 @Override
	    public String toString() {
	        return clientId + " " + clientName + " " + clientAdd;
	    }

}
