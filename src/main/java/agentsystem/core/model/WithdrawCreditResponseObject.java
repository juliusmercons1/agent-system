package agentsystem.core.model;

public class WithdrawCreditResponseObject {
	
	private String agentCode;
	private String agentCredit;
	private String agentSubAccountCredit;
	private String agentSubAccountCode;
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
	public String getAgentSubAccountCredit() {
		return agentSubAccountCredit;
	}
	public void setAgentSubAccountCredit(String agentSubAccountCredit) {
		this.agentSubAccountCredit = agentSubAccountCredit;
	}
	public String getAgentSubAccountCode() {
		return agentSubAccountCode;
	}
	public void setAgentSubAccountCode(String agentSubAccountCode) {
		this.agentSubAccountCode = agentSubAccountCode;
	}
	
}
