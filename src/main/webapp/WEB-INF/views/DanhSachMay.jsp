<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="<c:url value="/resources/bootstrap.min.css" />"
	rel="stylesheet">
<link
	href="<c:url value="/resources/fontawesome-free-6.4.0-web/css/all.min.css" />"
	rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute="taoMay" action="searchMay" method="get"
		id="">
		<div
			style="background-image: url(https://wallpapers.com/images/hd/world-map-cyber-security-ivcowv89j1g1ff4m.jpg); height: 18cm;"
			class="container">
			<div style="height: 100%;" class="row">
				<%@include file="Header1.jsp"%>
				<div
					style="background-size: cover; background-repeat: no-repeat; background-position: center; background-image: url(https://wallpapers.com/images/hd/world-map-cyber-security-ivcowv89j1g1ff4m.jpg); height: 70%; margin-top: 1%; margin-left: 1%; border: 1px solid rgb(203, 202, 202);"
					class="col-9">
					<div
						style="margin-top: 2%; border-bottom: 1px solid rgb(82, 77, 77);"
						class="row">
						<p>
							<a href="indexPage" style="color: rgb(233, 228, 228);">Quản
								lý người dùng</a>
						</p>
					</div>
					<div style="color: rgb(236, 234, 234);" class="row">
						<h5>Danh Sách Máy</h5>
					</div>
					<div class="form-outline">
						<div class="input-group">
							<div class="form-outline">
								<form:input path="maMay" cssClass="form-control "
									placeholder="Search" />
							</div>
							<button type="submit" class="btn btn-primary">
								<i class="fas fa-search"></i>
							</button>
						</div>
					</div>
					<div class="row">

						<table style="margin-top: 3%" class="table table-borderede">
							<thead>
								<tr>
									<th>Mã Máy</th>
									<th>Vị Trí</th>
									<th>Trạng Thái</th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${listMay}" var="lm" varStatus="status">
									<tr>
										<td>${lm.maMay}</td>
										<td>${lm.viTri}</td>
										<td>${lm.trangThai}</td>
										<td><a href="updatelm?maMay=${lm.maMay}"
											class="edit-icon"><i class="fas fa-edit"></i></a> <a
											href="delete?maMay=${lm.maMay}" class="delete-icon"><i
												class="fas fa-trash-alt"></i></a></td>
									</tr>
								</c:forEach>
								<c:if test="${not empty taoMay1}">
									<tr>
										<td>${taoMay1.maMay}</td>
										<td>${taoMay1.viTri}</td>
										<td>${taoMay1.trangThai}</td>
										<td><a href="updatelm?maMay=${taoMay1.maMay}"
											class="edit-icon"><i class="fas fa-edit"></i></a> <a
											href="delete?maMay=${taoMay1.maMay}" class="delete-icon"><i
												class="fas fa-trash-alt"></i></a></td>
									</tr>
								</c:if>
							</tbody>
						</table>
					</div>

				</div>
			</div>

		</div>
	</form:form>
</body>
</html>