<html>
<head>
  <meta charset="UTF-8"/>
  <title>Welcome!</title>
</head>
<body>
  <h1>
    Welcome ${user}<#if user == "Big Joe">, our beloved leader</#if>!
  </h1>
  <p>Our latest product:
  
  <h2>
  	His Sex: 
  	<#if sex == 1>
  		Male
  	<#elseif sex ==2 >
  		Female
  	<#else>
  		Other
  	</#if>
  </h2>
  	
  	<br>
  	<#list userList as user>
  		${user}<br>
  	</#list>
</body>
</html>
