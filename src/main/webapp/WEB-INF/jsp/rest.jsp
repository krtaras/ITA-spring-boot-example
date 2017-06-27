<html>
<head>
<script src="https://code.jquery.com/jquery-1.12.4.min.js"
	integrity="sha256-ZosEbRLbNQzLpnKIkEdrPv7lOy9C27hHQ+Xp8a4MxAQ="
	crossorigin="anonymous"></script>

<script type="text/javascript">

	function addItem() {
		$.post("/api/items", {
			name : $('#iname').val(),
			description : $('#idescription').val()
		}).done(function(data) {
			refresh();
		});
	}
</script>
</head>
<body>

	<div>
		<input type="text" id="iname" name="name" placeholder="insert name" />
		<input type="text" id="idescription" name="description" placeholder="insert description" />
		<button onclick="addItem()">Save</button>
	</div>

	<table>
		<thead>
			<tr>
				<th>Name</th>
				<th>Description</th>
			</tr>
		</thead>
		<tbody id="itable">
			<c:forEach var="item" items="${list}">
				<tr>
					<td>${item.name}</td>
					<td>${item.description}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>

</html>