<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

 <script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
 
 <style>

.ajax{
position: absolute;
right: 0;
bottom: 0;
width: 400px;
height: 200px;
}

#ajaxReturn {
    background-color: #ffb3b3;
    width: 140;
    position: absolute;
    right: 0;
    bottom: 65;
    padding: 20;
    font-size: 14px;
    color: ghostwhite;
    text-align: center;
    margin-bottom: 5;
}

#ajaxRetur{
    background-color: #2d5461;
    width: 150px;
    position: absolute;
    right: 0;
    bottom: 0;
    padding: 15;
    font-size: 14px;
    color: ghostwhite;   
    text-align: center;   
    
 }
 
 </style>
 
 
  <script type="text/javascript">
    $(document).ready(function(){
    	window.setInterval('callMsg()', 2000); //n�ʸ����ѹ��� �Լ��� �����Ѵ�..!! 
    	window.setInterval('callAjax()', 10000); //n�ʸ����ѹ��� �Լ��� �����Ѵ�..!!
    });
    function callMsg(){
    	 $.ajax({
 	        type: "post",
 	        url : "index.jp",
 	        success: test,	// ��������û ������ ���� �Լ�
 	        error: whenError	//��������û ���н� �����Լ�
      	});
    }
    function test(aaa){	// ��û������ ������������ aaa ������ �ݹ�ȴ�. 
        $("#ajaxReturn").html(aaa).fadeIn(4000).fadeOut(4000);	//id�� ajaxReturn�� �κп� �־��
        
    }
    function whenError(){
        return false;
    }
    
    
    $(document).ready(function(){
        $("#ajaxReturn").click(function(){
            open("/JackPot/msgmain.jp","����������","width=1200, height=600, toolbar=no, menubar=no, scrollbars=no, resizable=yes");
        });
        
    });
    
    
    /* -------------------------------- */
    
    
    
    function callAjax(){
	 $.ajax({
	        type: "post",
	        url : "alarm.jp",
	        success: test2,	// ��������û ������ ���� �Լ�
	        error: whenError	//��������û ���н� �����Լ�
  	});
}
function test2(aaa){	// ��û������ ������������ aaa ������ �ݹ�ȴ�. 
    $("#ajaxRetur").html(aaa).fadeToggle(5000);	//id�� ajaxReturn�� �κп� �־��
    
}
function whenError(){    

}

$(document).ready(function(){
    $("#ajaxRetur").click(function(){
    	$("#ajaxRetur").hide();
        open("/JackPot/msgmain.jp","����������","width=1200, height=600, toolbar=no, menubar=no, scrollbars=no, resizable=yes");
    });    
});
    

    
  </script>

	 <div class="ajax">
	 <div id="ajaxRetur" style="display:none;">������ ����</div> <!-- ��⿡ -->
	 </div>

	 <div id="ajaxReturn" style="display:none;">�� ����</div>
	 