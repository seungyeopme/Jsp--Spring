<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 
1.������ ���� �� �������� �ۼ��ض�. 
�ڹٽ�ũ��Ʈ ���� ���� �κп� �ƹ��͵� �Է� ���ϰ� �Է¿Ϸ��ư�� ������ 
�������� �Է¡� �̶�� ���â�� ����ϰ� ���ڸ� �Է��ϸ� �����ڿ��� �ȵȴ١���� 
���â�� ����ض�. ���ڸ� �Է��ϸ� 1���� �� ���ڱ��� ��µȴ�. 
(isNaN�Լ� ��� , request ��ü ���)
 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<script type="text/javascript">
		function on() {
			if(!isNaN(aa.num.value)){ //����, ������ ���
				alert("������ �Է�");
				return false;
			}
			if(isNaN(aa.num.value)) {
				alert("���ڿ��� �ȵȴ�")
				aa.num.value="";
				return false;
			}
			return true;
		}
	</script>

	<form action="j33_isNaN_result.jsp" name="aa" onsubmit="on()">
	����: <input name="num">
	<input type="submit" value="�Է¿Ϸ�">
	</form>
</body>
</html>