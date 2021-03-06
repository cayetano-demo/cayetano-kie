package cayetano.demo.kie_demo;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class GameOutcome implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @org.kie.api.definition.type.Position(1)
	private java.lang.Integer gameState;

    @org.kie.api.definition.type.Position(0)
	private java.lang.Boolean isFinished;

    @org.kie.api.definition.type.Position(2)
	private java.lang.String ticketId;

    @org.kie.api.definition.type.Position(value = 3)
	private java.util.List<cayetano.demo.kie_demo.Transaction> transactions;

	public java.lang.Integer getGameState() {
        return this.gameState;
    }
    
    public void setGameState(java.lang.Integer gameState) {
        this.gameState = gameState;
    }

    public java.lang.Boolean getIsFinished() {
        return this.isFinished;
    }
    
    public void setIsFinished(java.lang.Boolean isFinished) {
        this.isFinished = isFinished;
    }

    public java.lang.String getTicketId() {
        return this.ticketId;
    }
    
    public void setTicketId(java.lang.String ticketId) {
        this.ticketId = ticketId;
    }

	public java.util.List<cayetano.demo.kie_demo.Transaction> getTransactions() {
		return this.transactions;
	}

	public void setTransactions(
			java.util.List<cayetano.demo.kie_demo.Transaction> transactions) {
		this.transactions = transactions;
	}

	public GameOutcome() {
	}

	public GameOutcome(java.lang.Boolean isFinished,
			java.lang.Integer gameState, java.lang.String ticketId,
			java.util.List<cayetano.demo.kie_demo.Transaction> transactions) {
		this.isFinished = isFinished;
		this.gameState = gameState;
		this.ticketId = ticketId;
		this.transactions = transactions;
	}

}