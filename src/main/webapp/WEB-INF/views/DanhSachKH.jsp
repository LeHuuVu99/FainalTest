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
	<form:form modelAttribute="khachHang" action="searchKH" method="get"
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
						<h5>Danh Sách Khách Hàng</h5>
					</div>
					<div class="form-outline">
						<div class="input-group">
							<div class="form-outline">
								<form:input path="tenKH" cssClass="form-control "
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
									<th>Mã Khách Hàng</th>
									<th>Tên Khách Hàng</th>
									<th>Địa Chỉ</th>
									<th>Số Điện Thoại</th>
									<th>Dịa chỉ email</th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${list}" var="kh" varStatus="status">
									<tr>
										<td>${kh.maKH}</td>
										<td>${kh.tenKH}</td>
										<td>${kh.diaChi}</td>
										<td>${kh.soDienThoai}</td>
										<td>${kh.email}</td>
										<td><a href="updateKH?maKH=${kh.maKH}" class="edit-icon"><i
												class="fas fa-edit"></i></a> <a href="deleteKH?maKH=${kh.maKH}"
											class="delete-icon"><i class="fas fa-trash-alt"></i></a></td>
									</tr>
								</c:forEach>
							</tbody>
							<c:if test="${not empty listSearchKh}">
								<Tbody>
									<c:forEach items="${listSearchKh}" var="khl" varStatus="status">
										<tr>
											<td>${khl.maKH}</td>
											<td>${khl.tenKH}</td>
											<td>${khl.diaChi}</td>
											<td>${khl.soDienThoai}</td>
											<td>${khl.email}</td>
											<td><a href="updateKH?maKH=${khl.maKH}"
												class="edit-icon"><i class="fas fa-edit"></i></a> <a
												href="deleteKH?maKH=${khl.maKH}" class="delete-icon"><i
													class="fas fa-trash-alt"></i></a></td>
										</tr>
									</c:forEach>
								</Tbody>
							</c:if>
						</table>
						<br />
					<div class="pagination">
						<c:if test="${currentPage > 1}">
							<a href="list?page=${currentPage-1}">Previous</a>
						</c:if>
						<c:forEach begin="1" end="${totalPages}" var="i">
							<c:choose>
								<c:when test="${currentPage eq i}">
									<a class="active"> ${i} </a>
								</c:when>
								<c:otherwise>
									<a href="list?page=${i}">${i}</a>
								</c:otherwise>
							</c:choose>
						</c:forEach>

						<c:if test="${currentPage lt totalPages}">
							<a href="list?page=${currentPage+1}">Next</a>
						</c:if>
					</div>
					</div>

				</div>
			</div>

		</div>
	</form:form>
</body>
</html>