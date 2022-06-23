<%@ page import="java.util.*" %>
<html>

<%
	String firstName="john";
%>
welcome mr <%= firstName %>

<%
	
	String [] names=new String[3];
		names[0]="mike";
		names[1]="andy";
		names[2]="tony";
		
	for ( String s:names)
	{ 
	%>
		names : <%= s %>
		<br>
	<%
	}
	%>
	


	

<html>