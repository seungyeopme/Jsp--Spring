<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
					<c:if test="${count == 0 }">
						<th style="text-align:center;"><label>출근기록이 없습니다</label></th>
					</c:if>
					
					<c:if test="${count > 0 }">
						<c:forEach var="wdto" items="${monthsh}" >	
						<tr>
							<td style="text-align:center;height: 30px;"><label id="onedayGolvwkMngPersForm_work_on" id="work_on">${sys.format(wdto.work_on)}</label></td>
							<td style="text-align:center;"><label id="onedayGolvwkMngPersForm_work_off" id="work_off">${sys.format(wdto.work_off)}</label></td>
							<td style="text-align:center;"><label id="onedayGolvwkMngPersForm_work_time" id="work_time">${wdto.work_time}</label></td>
							<td style="text-align:center;"><label id="onedayGolvwkMngPersForm_workOut" id="workOut">${wdto.workOut}</label></td>
							<td style="text-align:center;"><label id="onedayGolvwkMngPersForm_lateNess" id="lateNess">${wdto.lateNess}</label></td>
							<td style="text-align:center;"><label id="onedayGolvwkMngPersForm_early" id="early">${wdto.early}</label></td>
							<td id="onedayGolvwkMngPersForm_ip" style="text-align:center;"><label id="ip">${wdto.ip}</label></td>	
						
					</c:forEach>
				</c:if>
		