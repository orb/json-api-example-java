<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/css/bootstrap.css" />
<title>API</title>
</head>
<body>



	<div class="container">
		<div class="jumbotron">
		<h1>API Demo</h1>
		<p><button id="clickme" class="btn btn-primary btn-lg">Load Data</button></p>

	</div>
		<div class="progress">
			<div id="bar" class="progress-bar progress-bar-warning" style="width: 100%">
			   Not Loaded...
			</div>
		</div>
	</div>

	<script src="/js/jquery-2.1.1.js"></script>
	<script src="/js/bootstrap.js"></script>
	<script>
	function loadData() {
		$.get("/random", function(data) {
			var number = data.number;
			$("#bar").removeClass("progress-bar-warning")
			         .addClass("progress-bar-success")
			         .width(number + "%")
			         .text(number);
		});
	}
	
	$(function(){
		$("#clickme").click(loadData);
	});
	</script>

</body>
</html>



