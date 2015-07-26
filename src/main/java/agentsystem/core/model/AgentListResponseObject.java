package agentsystem.core.model;

import java.util.List;

public class AgentListResponseObject {

	private String responseCode;
	private String errorDescription;
	private String agentCode;
	private String agentType;
	private List<Agent> agentList;
	
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
	public String getAgentType() {
		return agentType;
	}
	public void setAgentType(String agentType) {
		this.agentType = agentType;
	}
	public List<Agent> getAgentList() {
		return agentList;
	}
	public void setAgentList(List<Agent> agentList) {
		this.agentList = agentList;
	}
}
