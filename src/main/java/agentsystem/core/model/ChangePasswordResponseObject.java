package agentsystem.core.model;

/**
 * Used for Change OWN Password.
 * @author Paul
 *
 */
public class ChangePasswordResponseObject {

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

	public String getProcessType() {
		return processType;
	}

	public void setProcessType(String processType) {
		this.processType = processType;
	}
	
}
