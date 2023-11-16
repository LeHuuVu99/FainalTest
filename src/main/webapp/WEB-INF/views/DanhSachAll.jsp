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

	<form:form modelAttribute="QuanNet" action="searchAll" method="get"
		id="">
<div
		style="background-image: url(https://wallpapers.com/images/hd/world-map-cyber-security-ivcowv89j1g1ff4m.jpg); height: 18cm;"
		class="container">
		<div style="height: 100%;" class="row">
             <%@include file="Header1.jsp"%>
		    <div style=" background-size: cover; background-repeat: no-repeat; background-position: center;  background-image: url(https://wallpapers.com/images/hd/world-map-cyber-security-ivcowv89j1g1ff4m.jpg); height: 70%; margin-top: 1%; margin-left: 1%; border: 1px solid rgb(203, 202, 202);" class="col-9">
                <div style="margin-top: 2%; border-bottom: 1px solid rgb(82, 77, 77);" class="row">
                    <p><a href="indexPage" style="color: rgb(233, 228, 228);">Quản lý người dùng</a></p>
                </div>
                <div style="color: rgb(236, 234, 234);" class="row"> <h5>Danh Sách Khách Hàng</h5></div>
                <div class="form-outline">
                    <div class="input-group">
                        <div class="form-outline">
                           <form:input path="tenKH" cssClass="form-control " placeholder="Search"/>
                        </div>
                        <button type="submit" class="btn btn-primary">
                          <i class="fas fa-search"></i>
                        </button>
                      </div>
                </div>
                <div class="row">
                
                  
                                  
                    <table style="margin-top: 3%;" class="table table-borderede">
                        <thead>
                            <tr>                            
                                <th>Mã KH</th>
                                <th>Tên KH</th>
                                <th>Mã máy</th>
                                <th>Vị trí</th>
                                <th>Trạng thái</th>
                                <th>Ngày bắt đầu sử dụng máy</th>
                                <th>Giờ bắt đầu sử dụng máy</th>
                                <th>Thời gian sử dụng máy</th>
                                <th>Mã dịch vụ</th>
                                <th>Ngày sử dụng dịch vụ</th>
                                <th>Giờ sử dụng dịch vụ</th>
                                <th>Số lượng</th>
                                <th>Tổng tiền</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${listQuanNet}" var="qn" varStatus="status">
							<tr>
								<td>${qn.maKH}</td>
								<td>${qn.tenKH}</td>
								<td>${qn.maMay}</td>
								<td>${qn.viTri}</td>
								<td>${qn.trangThai}</td>
								<td>${qn.ngayBatDauSuDung}</td>
								<td>${qn.gioBatDauSuDung}</td>
								<td>${qn.thoiGianSuDung}</td>
								<td>${qn.maDv}</td>
								<td>${qn.ngaySuDung}</td>
								<td>${qn.gioSuDung}</td>
								<td>${qn.soLuong}</td>								
								<td>${qn.soLuong * qn.donGia}</td>						
							</tr>
						</c:forEach>		
                        </tbody>
                           	<c:if test="${not empty listQuanNet1}">
					<Tbody>
						<c:forEach items="${listQuanNet1}" var="sql" varStatus="status">
							<tr>
								<td>${sql.maKH}</td>
								<td>${sql.tenKH}</td>
								<td>${sql.maMay}</td>
								<td>${sql.viTri}</td>
								<td>${sql.trangThai}</td>
								<td>${sql.ngayBatDauSuDung}</td>
								<td>${sql.gioBatDauSuDung}</td>
								<td>${sql.thoiGianSuDung}</td>
								<td>${sql.maDv}</td>
								<td>${sql.ngaySuDung}</td>
								<td>${sql.gioSuDung}</td>
								<td>${sql.soLuong}</td>								
								<td>${sql.soLuong * sql.donGia}</td>		
							</tr>
						</c:forEach>
							</Tbody>
							</c:if>
                    </table>
                </div>
             
            </div>
		</div>

	</div>
		</form:form>
</body>
</html>