package agentsystem.core.model;

public class AgentInitialDataResponseObject {

	private String responseCode;
	private String errorDescription;
	private String agentCode;
	private String agentParentCode;
	private String agentLevel;
	private String agentType;
	private String agentHasPending;
	private String agentTotalCredit;
	private String agentTotalPlayers;
	private String agentTotalSubAgents;
	
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getErrorDescription() {
		return errorDescription;
	}
	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}
	public String getAgentCode() {
		return agentCode;
	}
	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}
	public String getAgentParentCode() {
		return agentParentCode;
	}
	public void setAgentParentCode(String agentParentCode) {
		this.agentParentCode = agentParentCode;
	}
	public String getAgentLevel() {
		return agentLevel;
	}
	public void setAgentLevel(String agentLevel) {
		this.agentLevel = agentLevel;
	}
	public String getAgentType() {
		return agentType;
	}
	public void setAgentType(String agentType) {
		this.agentType = agentType;
	}
	public String getAgentHasPending() {
		return agentHasPending;
	}
	public void setAgentHasPending(String agentHasPending) {
		this.agentHasPending = agentHasPending;
	}
	public String getAgentTotalCredit() {
		return agentTotalCredit;
	}
	public void setAgentTotalCredit(String agentTotalCredit) {
		this.agentTotalCredit = agentTotalCredit;
	}
	public String getAgentTotalPlayers() {
		return agentTotalPlayers;
	}
	public void setAgentTotalPlayers(String agentTotalPlayers) {
		this.agentTotalPlayers = agentTotalPlayers;
	}
	public String getAgentTotalSubAgents() {
		return agentTotalSubAgents;
	}
	public void setAgentTotalSubAgents(String agentTotalSubAgents) {
		this.agentTotalSubAgents = agentTotalSubAgents;
	}
	
}