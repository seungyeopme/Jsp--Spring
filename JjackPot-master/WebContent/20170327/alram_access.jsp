<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.*" %>  
<%  
response.setHeader("Pragma","No-cache"); //HTTP 1.0   
response.setDateHeader ("Expires", 0);   
response.setHeader ("Cache-Control", "no-cache");   
%>  
<jsp:useBean id="alram_list" class="java.util.ArrayList" scope="application" />  
<%  
//�ǽð� �˶���� : application���� ������ �ش��ڿ��� �ѷ��ְ� �����Ѵ�.  
String access_session = session.getId()+"";  
int remove_alram_no = -1;  
for(int i=0;i<alram_list.size();i++){  
    Map map = (Map)alram_list.get(i);  
    String who = map.get("who")==null?"":map.get("who")+"";  
    String msg = map.get("msg")==null?"":map.get("msg")+"";  
    long msg_time = map.get("msg_time")==null?System.currentTimeMillis():Long.parseLong(map.get("msg_time")+"");  
    if(access_session.equals(who)) {  
        out.print(java.net.URLEncoder.encode(msg, "euc-kr"));//�˶�����  
        remove_alram_no = i;//������ ����  
    }else if((System.currentTimeMillis()-msg_time)>10*1000) {  
        remove_alram_no = i;//10�� �����޼��� ����  
    }else{//�ƹ��͵���������  
    }  
}  
//�˶��� �о����� ����  
if(remove_alram_no>-1){  
    alram_list.remove(remove_alram_no);  
}  
%>  

