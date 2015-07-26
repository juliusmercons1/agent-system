package agentsystem.core.model;

public class GetCreditResponseObject {

	private String agentCode;
	private String agentCredit;
	private String targetCredit;
	private String responseCode;
	private String errorDescription;
	
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
	public String getAgentCredit() {
		return agentCredit;
	}
	public void setAgentCredit(String agentCredit) {
		this.agentCredit = agentCredit;
	}
	public String getTargetCredit() {
		return targetCredit;
	}
	public void setTargetCredit(String targetCredit) {
		this.targetCredit = targetCredit;
	}	
}
