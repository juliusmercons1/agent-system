package agentsystem.core.model;

public class LoginResponseObject {

	private String agentCode;
	private String sessonId;
	private String processType;
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
	public String getSessonId() {
		return sessonId;
	}
	public void setSessonId(String sessonId) {
		this.sessonId = sessonId;
	}
	public String getProcessType() {
		return processType;
	}
	public void setProcessType(String processType) {
		this.processType = processType;
	}
	
}