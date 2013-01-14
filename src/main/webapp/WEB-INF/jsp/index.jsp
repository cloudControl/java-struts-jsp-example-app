<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<html>
	<head></head>
	
	<body>
		<h1>You are visiting this site from <bean:write name="com.cloudcontrolled.sample.struts.form.IndexForm" property="remoteAddress" />.</h1>
	</body>
</html>