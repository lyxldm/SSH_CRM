<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head> 
<TITLE>客户列表</TITLE> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<LINK href="${pageContext.request.contextPath }/css/Style.css" type=text/css rel=stylesheet>
<LINK href="${pageContext.request.contextPath }/css/Manage.css" type=text/css
	rel=stylesheet>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.4.4.min.js"></script>
<SCRIPT language=javascript>
	function choose(id,name){
		var win = window.opener;
		var doc = win.document;
		doc.getElementById("choose1").value=id;
		doc.getElementById("choose2").value=name
		window.close();
	}
</SCRIPT>

<META content="MSHTML 6.00.2900.3492" name=GENERATOR>
</HEAD>
<BODY>
		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_019.jpg"
						border=0></TD>
					<TD width="100%" background="${pageContext.request.contextPath }/images/new_020.jpg"
						height=20></TD>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_021.jpg"
						border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
		<input type="text" name="flag" id="flag" value="${parameters}"/>
		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15 background=${pageContext.request.contextPath }/images/new_022.jpg><IMG
						src="${pageContext.request.contextPath }/images/new_022.jpg" border=0></TD>
					<TD vAlign=top width="100%" bgColor=#ffffff>
						<TABLE cellSpacing=0 cellPadding=5 width="100%" border=0>
							<TR>
								<TD class=manageHead>当前位置：客户管理 &gt; 客户列表</TD>
							</TR>
							<TR>
								<TD height=2></TD>
							</TR>
						</TABLE>
						<TABLE borderColor=#cccccc cellSpacing=0 cellPadding=0
							width="100%" align=center border=0>
							<TBODY>
								<TR>
									<TD height=25>
									<FORM id="pageForm" name="customerForm"
										action="${pageContext.request.contextPath }/UserAction_list"
										method=post>
										<input type="hidden" name="flag" value="<s:property value="#parameters.flag"/>" />
										<!-- 隐藏域.当前页码 -->
										<input type="hidden" name="currentPage" id="currentPageInput" value="<s:property value="#pageBean.currentPage" />" />
										<!-- 隐藏域.每页显示条数 -->
										<input type="hidden" name="pageSize" id="pageSizeInput"       value="<s:property value="#pageBean.pageSize" />" />
										<TABLE cellSpacing=0 cellPadding=2 border=0>
											<TBODY>
												<TR>
													<TD>客户名称：</TD>
													<TD><INPUT class=textbox id="sChannel2"
														style="WIDTH: 80px" maxLength=50 name="name"></TD>
													<TD><INPUT class=button id=sButton2 type=submit
														value=" 筛选 " name=sButton2></TD>
												</TR>
											</TBODY>
										</TABLE>
									</FORM>
									</TD>
								</TR>
							    
								<TR>
									<TD>
										<TABLE id=grid
											style="BORDER-TOP-WIDTH: 0px; FONT-WEIGHT: normal; BORDER-LEFT-WIDTH: 0px; BORDER-LEFT-COLOR: #cccccc; BORDER-BOTTOM-WIDTH: 0px; BORDER-BOTTOM-COLOR: #cccccc; WIDTH: 100%; BORDER-TOP-COLOR: #cccccc; FONT-STYLE: normal; BACKGROUND-COLOR: #cccccc; BORDER-RIGHT-WIDTH: 0px; TEXT-DECORATION: none; BORDER-RIGHT-COLOR: #cccccc"
											cellSpacing=1 cellPadding=2 rules=all border=0>
											<TBODY>
												<TR
													style="FONT-WEIGHT: bold; FONT-STYLE: normal; BACKGROUND-COLOR: #eeeeee; TEXT-DECORATION: none">
													<TD>客户名称</TD>
													<TD>客户密码</TD>
													<TD>客户电话</TD>
												</TR>
												
												<s:iterator value="#session.list" var="User" >
												<TR
													style="FONT-WEIGHT: normal; FONT-STYLE: normal; BACKGROUND-COLOR: white; TEXT-DECORATION: none">
													<TD><s:property value="#User.id"/></TD>
													<TD><s:property value="#User.user_pwd"/></TD>
													<TD><s:property value="#User.user_phone"/></TD>
													<td>
													<s:if test="#parameters.flag!=null">
			<!-- 问题，客户刘表也会出现选择按钮，翻页却没有 -->	<td><input type="button" value="选择客户" onclick="choose(<s:property value="#User.id"/>,'<s:property value="#User.user_name"/>')"/></td>
													
													</s:if>
													</td>
												</TR>
												</s:iterator>
	
											</TBODY>
										</TABLE>
									</TD>
								</TR>
								
								<TR>
									<TD><SPAN id=pagelink>
											<DIV
												style="LINE-HEIGHT: 20px; HEIGHT: 20px; TEXT-ALIGN: right">
												共[<B><s:property value="#session.pageBean.getUserCount()"/></B>]条记录,[<B><s:property value="#session.pageBean.getPageCount()" /></B>]页
												,每页显示 <%-- changePageSize($('#pageSizeSelect option').filter(':selected').val()) --%> 
												<select name="pageSize" onchange="changePageSize($('#pageSizeSelect option:selected').val())" id="pageSizeSelect" >
													<option value="3" <s:property value="#pageBean.pageSize==3?'selected':''" /> >3</option>
													<option value="5" <s:property value="#pageBean.pageSize==5?'selected':''" /> >5</option>
												</select>
												条
												[<A href="${pageContext.request.contextPath }/UserAction_list?currentPage=${pageBean.currentPage-1}" />前一页</B>
												[<A href="${pageContext.request.contextPath }/UserAction_list?currentPage=${pageBean.currentPage+1}"  >后一页</A>] 
												到
												<input type="text" size="3" id="page" name="page" value="<s:property value="#pageBean.currentPage" />"  />
												页
												
												<input type="button" value="Go" onclick="changePage($('#page').val())"/>
											</DIV>
									</SPAN></TD>
								</TR>
							</TBODY>
						</TABLE>
					</TD>
					<TD width=15 background="${pageContext.request.contextPath }/images/new_023.jpg"><IMG
						src="${pageContext.request.contextPath }/images/new_023.jpg" border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_024.jpg"
						border=0></TD>
					<TD align=middle width="100%"
						background="${pageContext.request.contextPath }/images/new_025.jpg" height=15></TD>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_026.jpg"
						border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
	
</BODY>
</HTML>
