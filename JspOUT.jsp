<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jsp out</title>
</head>
<body>
<% int var1=10;%>
<table>
<% 
for(int i=1;i<=10;i++)
{
	%>
	<tr>
	<td>
	<% out.println(var1+"*"+i+"="+i*var1);
%>
</td>
</tr>	
}

%>
</table>

</body>
</html>