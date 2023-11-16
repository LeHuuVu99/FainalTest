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
	<form:form modelAttribute="dichVu" action="addDichVu" method="post"
			id="FormdichVu">
    <div style="background-image: url(https://wallpapers.com/images/hd/world-map-cyber-security-ivcowv89j1g1ff4m.jpg);height: 18cm;" class="container">
        <div style="height: 100%; " class="row">
              <%@include file="Header1.jsp"%>
            <div  style=" background-size: cover; color: white; background-repeat: no-repeat; background-image: url(https://wallpapers.com/images/hd/world-map-cyber-security-ivcowv89j1g1ff4m.jpg); height: 70%; margin-top: 1%; margin-left: 1%; border: 1px solid rgb(203, 202, 202);" class="col-9">
                <div style="margin-top: 2%; border-bottom: 1px solid rgb(82, 77, 77);" class="row">
                    <p><a href="indexPage" style="color: rgb(244, 240, 240);">Quản lý người dùng</a></p>
                </div>
                <div style="color: rgb(236, 234, 234);" class="row"> <h5>Dịch Vụ</h5></div>
                <div class="form-outline">
                    <label class="form-label" for="form6Example2">Mã Dịch Vụ</label>
                    	<c:choose>
							<c:when test="${dichVu.maDv == null}">
								    <form:input path="maDv" cssClass="form-control " placeholder="Mã Dịch Vụ" name="maDv1" />
							</c:when>
							<c:otherwise>
								  <form:input path="maDv" cssClass="form-control " placeholder="Mã Dịch Vụ" readonly="true" />
							</c:otherwise>
						</c:choose>
                </div>
                		<span style="color: red;"> <c:if test="${not empty error}">							
									${error}				
							</c:if></span>
                <div class="form-outline">
                    <label class="form-label" for="form6Example2">Tên Dịch Vụ</label>
                   <form:input path="tenDV" cssClass="form-control " placeholder="Tên Dịch Vụ" name="tenDV1" />
                </div>
                <div class="form-outline">
                    <label class="form-label" for="form6Example2">Đơn Vị Tính</label>
                   <form:input path="donViTinh" cssClass="form-control " placeholder="Đơn Vị Tính"  name="donViTinh1" />
                </div>
                <div class="form-outline">
                    <label class="form-label" for="form6Example2">Đơn Giá</label>
                   <form:input path="donGia" cssClass="form-control " placeholder="Đơn Giá"  name="donGia1" />
                </div>
                <button style="background-color: aliceblue; color: black;margin-top: 3%;"  type="submit" class="btn btn-primary btn-block mb-4">Submit Button</button>
                <button style="background-color: aliceblue; color: black;margin-top: 3%;"   type="submit" class="btn btn-primary btn-block mb-4">Reset Button</button>
            </div>
             </div>
              </div>
              </form:form>
<script src="resources/general.js"></script>
</body>
</html>
