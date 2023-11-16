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
				<form:form modelAttribute="taoMay" action="addMay" method="post"
					id="Formtaomay">

	<div
		style="background-image: url(https://wallpapers.com/images/hd/world-map-cyber-security-ivcowv89j1g1ff4m.jpg); height: 18cm;"
		class="container">
		<div style="height: 100%;" class="row">
		<%@include file="Header1.jsp"%>
			<div
				style="background-size: cover; background-repeat: no-repeat; background-position: center; background-image: url(https://wallpapers.com/images/hd/world-map-cyber-security-ivcowv89j1g1ff4m.jpg); height: 70%; margin-top: 1%; margin-left: 1%; border: 1px solid rgb(203, 202, 202); color: white;"
				class="col-9">
				<div
					style="margin-top: 2%; border-bottom: 1px solid rgb(82, 77, 77);"
					class="row">
					<p>
						<a href="indexPage" style="color: rgb(233, 228, 228);">Quản lý
							người dùng</a>
					</p>
				</div>
				<div style="color: rgb(236, 234, 234);" class="row">
					<h5>Máy</h5>
				</div>
					<div class="form-outline">
						<label class="form-label" for="form6Example2">Mã MÁY</label>
						<c:choose>
							<c:when test="${taoMay.maMay == null}">
								<form:input path="maMay" cssClass="form-control "
									placeholder="Mã MÁY" name="maMay1" />
							</c:when>
							<c:otherwise>
								<form:input path="maMay" cssClass="form-control "
									placeholder="Mã MÁY" readonly="true" />
							</c:otherwise>
						</c:choose>
					</div>
					<span style="color: red;"> <c:if test="${not empty error}">							
									${error}				
							</c:if></span>
					<div class="form-outline">
						<label class="form-label" for="form6Example2">Vị Trí</label>
						<form:input path="viTri" cssClass="form-control "
							placeholder="Vị Trí" name="viTri1" />
					</div>
					<div class="form-outline mb-4">
						<label class="form-label" for="form6Example6">Trạng Thái
							Máy</label>
						<form:select path="trangThai" cssClass="form-control"
							id="form6Example6" name="trangThai1">
							<form:option value="">Trạng Thái</form:option>
							<form:option value=" Ranh"> rảnh </form:option>
							<form:option value="Ban">bận</form:option>
							<form:option value="Dung Duoc">dùng được</form:option>
							<form:option value="Sua Chua"> sửa chữa</form:option>
						</form:select>
					</div>
					<button
						style="background-color: aliceblue; color: black; margin-top: 3%;"
						type="submit" class="btn btn-primary btn-block mb-4">Submit
						Button</button>
					<button
						style="background-color: aliceblue; color: black; margin-top: 3%;"
						type="submit" class="btn btn-primary btn-block mb-4">Reset
						Button</button>
			</div>
		</div>
	</div>
	</form:form>
<!-- <script src="resources/genaral.js"></script> -->
</body>
</html>