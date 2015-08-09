<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Agent</title>
</head>
<body>
	<form action="" method="post">
		<table>
			<tr>
				<td>
					Username
				</td>
				<td>
					<input type="text" name="agentUsername"/>
				</td>
			</tr>
			
			<tr>
				<td>
					Password
				</td>
				<td>
					<input type="password" name="agentPassword"/>
				</td>
			</tr>
		
			<tr>
				<td>
					Confirm Password
				</td>
				<td>
					<input type="password" name="agentConfirmPassword"/>
				</td>
			</tr>
		
			<tr>
				<td>
					Name
				</td>
				<td>
					<input type="text" name="agentName"/>
				</td>
			</tr>
		
			<tr>
				<td>
					Email
				</td>
				<td>
					<input type="text" name="agentEmail"/>
				</td>
			</tr>
		
			<tr>
				<td>
					Contact No.
				</td>
				<td>
					<input type="text" name="agentContactNo"/>
				</td>
			</tr>
		
			<tr>
				<td>
					Comm %
				</td>
				<td>
					<input type="text" name="agentComm"/>
				</td>
			</tr>
		</table>
		<br> <input type="submit" value="Save Agent"/>
		<br> <input type="button" value="Cancel"/>
	</form>
</body>
</html>