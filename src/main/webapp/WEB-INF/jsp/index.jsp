<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Java Spring Boot</title>
</head>
<body>
Hello World!
<form>
	aid <input type="text" name="aid" placeholder="${obj.aid}"><br>
	aname <input type="text" name="aname" placeholder="${obj.aname}"><br>
	tech <input type="text" name="tech" placeholder="${obj.tech}">
	<input type="submit">
</form>
<br>
Hello ${obj.aid}, ${obj.aname}, ${obj.tech}.
</body>
</html>