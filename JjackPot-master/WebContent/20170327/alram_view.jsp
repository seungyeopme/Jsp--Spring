<%@ page language="java" contentType="text/html;charset=euc-kr"%>  
<%  
response.setHeader("Pragma","No-cache"); //HTTP 1.0   
response.setDateHeader ("Expires", 0);   
response.setHeader ("Cache-Control", "no-cache");   
%>  
<%  
String msg = (request.getParameter("msg")==null)? "":java.net.URLDecoder.decode(request.getParameter("msg"), "euc-kr");  
%>  
<html>  
<head>  
<title>Alram</title>  
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">     
<style type="text/css">  
a { text-decoration:none; color: black; font-size: 12px;}  
a:Visited {}  
a:Active {}  
a:Hover { text-decoration:none; color:black;font-size: 12px;}  
body,table,td {  font-family: ""; font-size: 12px; }  
.button_normal {font-family:"";font-size:12px;}  
</style>  
<script language="javascript">  
    function _CloseOnEsc() {  
      if (event.keyCode == 27) { window.close(); return; }  
    }  
    function Init() {  
      document.body.onkeypress = _CloseOnEsc;  
    }  
    function Set(url) {  
        if(opener!=null){  
            opener.location.href = url;   
        }else{  
            var opener_win = dialogArguments;  
            opener_win.location.href = url;   
        }  
        window.close();  
    }  
    function popupResize(){   
        var pop_width = document.body.scrollWidth + 30;   
        var pop_height = document.body.scrollHeight + 60;   
        if(pop_width>800) pop_width = 800;   
        if(pop_height>500) pop_height = 500;   
        window.resizeTo(pop_width,pop_height);   
    }   
</script>  
</head>  
<body bgcolor="buttonface" onload="popupResize();Init();window.focus();">  
<center>  
<table border=0 cellspacing=0 cellpadding=0 width="95%">  
    <tr height="10">  
       <td align=center>  
       </td>  
    </tr>  
    <tr height="30">  
       <td align=center>  
       <%=msg%>  
       </td>  
    </tr>  
</table>  
</center>  
</body>  
</html>  

