<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<c:url value="/resources/bootstrap.min.css" />"
	rel="stylesheet">
	<script src="resources/code.jquery.com_jquery-3.7.0.min.js"></script>
<script src="resources/cdnjs.cloudflare.com_ajax_libs_jquery-validate_1.19.3_jquery.validate.min.js"></script>
</head>
<body>
	<form:form modelAttribute="khachHang" action="addkhachhang"
		method="post"  id="FormkhachHang">
		<div
			style="background-image: url(https://wallpapers.com/images/hd/world-map-cyber-security-ivcowv89j1g1ff4m.jpg); height: 18cm;"
			class="container">
			<div style="height: 100%;" class="row">
				<%@include file="Header1.jsp"%>

				<div
					style="background-size: cover;color: white; background-repeat: no-repeat; background-position: center; background-image: url(https://wallpapers.com/images/hd/world-map-cyber-security-ivcowv89j1g1ff4m.jpg); height: 70%; margin-top: 1%; margin-left: 1%; border: 1px solid rgb(203, 202, 202);"
					class="col-9">
					<div
						style="margin-top: 2%; border-bottom: 1px solid rgb(82, 77, 77);"
						class="row">
						<p>
							<a href="indexPage" style="color: rgb(236, 234, 234);">Quản
								lý người dùng</a>
						</p>
					</div>
					<div style="color: rgb(236, 234, 234);" class="row">
						<h5>Tạo mới khách hàng</h5>
					</div>

					<div class="form-outline">
						<label class="form-label" for="form6Example2">Mã khách
							hàng</label>
						<c:choose>
							<c:when test="${khachHang.maKH == null}">
								<form:input path="maKH" cssClass="form-control "
									placeholder="Mã khách hàng" name="maKH1" />
							</c:when>
							<c:otherwise>
								<form:input path="maKH" cssClass="form-control "
									placeholder="Mã khách hàng" readonly="true" />
							</c:otherwise>
						</c:choose>
											
					</div>
						<span style="color: red;"> <c:if test="${not empty error}">							
									${error}				
							</c:if></span>
					<div class="form-outline">
						<label class="form-label" for="form6Example2">Tên khách
							hàng</label>
						<form:input path="tenKH" cssClass="form-control "
							placeholder="Tên khách hàng" name="namekh" />
					</div>
					<div class="form-outline">
						<label class="form-label" for="form6Example2">Địa chỉ</label>
						<form:input path="diaChi" cssClass="form-control "
							placeholder="Địa chỉ" name="diaChikh" />
					</div>
					<div class="form-outline">
						<label class="form-label" for="form6Example2">Số điện
							thoại</label>
						<form:input path="soDienThoai" cssClass="form-control "
							placeholder="Số điện thoại" name="sdtkh" />
					</div>
					<div class="form-outline">
						<label class="form-label" for="form6Example2">Địa chi
							email</label>
						<form:input path="email" cssClass="form-control "
							placeholder="Địa chi email" name="emailkh" />
					</div>

					<button
						style="background-color: aliceblue; color: black; margin-top: 3%;"
						type="submit" class="btn btn-primary btn-block mb-4">Submit
						Button</button>
					<button
						style="background-color: aliceblue; color: black; margin-top: 3%;"
						type="reset" class="btn btn-primary btn-block mb-4">Reset
						Button</button>
				</div>
			</div>
		</div>
	</form:form>
<script src="resources/general.js"></script>
</body>
</html>