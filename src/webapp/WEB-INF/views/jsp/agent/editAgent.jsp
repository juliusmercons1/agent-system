<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Agent</title>
</head>
<body>
	<form action="" method="post">
		<table>
			<tr>
				<td>
					Username
				</td>
				<td>
					<input type="text" name="agentUsername" disabled/>
				</td>
			</tr>
			<tr>
				<td>
					Password
				</td>
				<td>
					<input type="password" name="agentPassword" disabled/>
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
					<input type="text" name="agentName"/>
				</td>
			</tr>
		
			<tr>
				<td>
					Comm %
				</td>
				<td>
					<input type="text" name="agentComm" disabled/>
				</td>
			</tr>
		</table>
		<br> <input type="submit" value="Update Agent"/>
		<br> <input type="button" value="Cancel"/>
	</form>
</body>
</html>