<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<h1 id="json_test"></h1>
</body>

<script
  src="https://code.jquery.com/jquery-3.6.4.min.js"
  integrity="sha256-oP6HI9z1XaZNBrJURtCoUT5SUnxFr8s3BzRl+cbzUq8="
  crossorigin="anonymous"></script>
<script type="text/javascript">
	$.ajax({
		url: "https://infuser.odcloud.kr/oas/docs?namespace=15053336/v1",
		type: "GET",
		data: {
			
		},
		dataType: "JSON",
		success: function(res){
			document.getElementById("json_test").innerHTML = res.info.title;
		},
		error: function(err){
			console.error(err);
		}
	});
</script>
</html>