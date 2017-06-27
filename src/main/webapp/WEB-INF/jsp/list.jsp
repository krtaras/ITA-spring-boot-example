<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

	<body>
		
		<form action="/list/add" method="post">
			<input type="text" name="name" placeholder="insert name" />
			<input type="text" name="description" placeholder="insert description" />
			<input type="submit" value="Save">
		</form>
	
		<table>
			<thead>
				<tr>
					<th>
						Name
					</th>
					<th>
						Description
					</th>
				</tr>
			</thead>
			<tbody>
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