<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Change Agent Password</title>
</head>
<body>
	<form action="" method="post">
		<table>
			<tr>
				<td>
					Old Password
				</td>
				<td>
					<input type="password" name="agentOldPassword" value=""/>
				</td>
			</tr>
			<tr>
				<td>
					New Password
				</td>
				<td>
					<input type="password" name="agentNewPassword" value=""/>
				</td>
			</tr>
			<tr>
				<td>
					Confirm Password
				</td>
				<td>
					<input type="password" name="agentConfirmPassword"  value=""/>
				</td>
			</tr>
		</table>
		<br> <input type="submit" value="Change Agent Password"/>
		<br> <input type="button" value="Cancel"/>
	</form>
</body>
</html>