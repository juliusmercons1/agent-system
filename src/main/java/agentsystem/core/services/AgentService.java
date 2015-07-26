package agentsystem.core.services;

public class AgentService {

	/**
	 * Validates all input fields.
	 * @param agentUsername
	 * @param agentPassword
	 * @param agentConfirmPassword
	 * @param agentName
	 * @param agentEmail
	 * @param agentContactNo
	 * @param agentComm
	 * @return
	 */
	public boolean validateinputParams (String agentUsername , String agentPassword, 
			String agentConfirmPassword, String agentName, 
			String agentEmail, String agentContactNo, String agentComm){
		boolean validAgentInput = false;
		FieldValidatorService fvalidator = new FieldValidatorService();
		
		//TODO: update from nested if to a better validation
		if(fvalidator.isTextFieldValid(agentUsername)){
			if(fvalidator.isTextFieldValid(agentPassword)){
				if(fvalidator.isTextFieldValid(agentConfirmPassword)){
					if(fvalidator.isTextFieldValid(agentName)){
						if(fvalidator.isTextFieldValid(agentEmail)){
							if(fvalidator.isTextFieldValid(agentContactNo)){
								if(fvalidator.isTextFieldValid(agentComm)){
									validAgentInput = true;
								}
							}
						}
					}
				}
			}
		}
		
		return validAgentInput;
	}
	
	/**
	 * Bind parameters and create the XML request for add agent.
	 */
	public void submitAddAgent (){
		
	}
	
	/**
	 * Bind parameters and create the XML request for edit agent.
	 */
	public void submitEditAgent (){
		
	}
}
