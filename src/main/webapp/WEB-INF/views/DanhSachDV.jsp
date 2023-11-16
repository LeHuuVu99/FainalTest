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
	<form:form modelAttribute="dichVu" action="searchDV" method="get"
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
                <div style="color: rgb(236, 234, 234);" class="row"> <h5>Danh Sách Dịnh Vụ</h5></div>
                <div class="form-outline">
                    <div class="input-group">
                        <div class="form-outline">
                          <form:input path="tenDV" cssClass="form-control " placeholder="Search"/>
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
                                <th>Mã Dịch Vụ</th>
                                <th>Tên Dịch Vụ</th>
                                <th>Đơn Vị Tính</th>
                                <th>Đơn Giá</th>         
                                <th></th>                        
                            </tr>
                        </thead>
                        <tbody>
                         	<c:forEach items="${listdv}" var="dv" varStatus="status">
							<tr>
								<td>${dv.maDv}</td>
								<td>${dv.tenDV}</td>
								<td>${dv.donViTinh}</td>	
								<td>${dv.donGia}</td>				
								<td><a href="updateDV?maDv=${dv.maDv}"
									class="edit-icon"><i class="fas fa-edit"></i></a> <a
									href="deleteDV?maDv=${dv.maDv}" class="delete-icon"><i
										class="fas fa-trash-alt"></i></a></td>
							</tr>
						</c:forEach>			
                        </tbody>
                        	<c:if test="${not empty listSearchDV}">
					<Tbody>
						<c:forEach items="${listSearchDV}" var="dvl" varStatus="status">
							<tr>
								<td>${dvl.maDv}</td>
								<td>${dvl.tenDV}</td>
								<td>${dvl.donViTinh}</td>	
								<td>${dvl.donGia}</td>				
								<td><a href="updateDV?maDv=${dvl.maDv}"
									class="edit-icon"><i class="fas fa-edit"></i></a> <a
									href="deleteDV?maDv=${dvl.maDv}" class="delete-icon"><i
										class="fas fa-trash-alt"></i></a></td>
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