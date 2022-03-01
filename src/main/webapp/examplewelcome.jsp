<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>

welcome <s:property value = "fName" /> <s:property value = "lName" /> 
<br>
Address <s:property value = "address" />


	<s:append var="appendIterator">
		<s:param value="%{myList1}" /><s:param value="%{myList2}" />
	</s:append>
	<ul>
		<s:iterator value="%{#appendIterator}">  
			<li>
				<s:property />    
			 </li>
		</s:iterator>
	</ul>