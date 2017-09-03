<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-cn">
<%@include file="/common/include.jsp"%>
<head lang="en">
    <meta charset="UTF-8">
    <title>知脉国际-走进知脉</title>
    <link rel="stylesheet" href="${ctx }/css/CommonCss.css">
    <link rel="stylesheet" href="${ctx }/css/common.css">
    <link rel="stylesheet" href="${ctx }/css/index.css">
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
	<script type="text/javascript" src="${ctx }/js/index.js"></script>
</head>
<body>
<div id="page">
    <!--顶部-->
    <div id="head">
        <div class="w clearfloat">
            <!--顶部菜单栏-->
            <ul id="nav" class="clearfloat">
                <li class="nav-items"><a  href="${ctx }/index.jsp">首页</a></li>
                <li class="nav-items"><a class="head-tivace" href="${ctx }/business.jsp">走进知脉</a></li>
                <li class="nav-items"><a   href="${ctx }/join.jsp">业务范围</a></li>
                <li class="nav-logo"><img src="${ctx }/images/logo.png"> </li>
                <li class="nav-items"><a href="${ctx }/review.jsp">往期回顾</a></li>
                <li class="nav-items"><a href="${ctx }/#">招才引智</a></li>
                <li class="nav-items"><a href="${ctx }/Contactus.jsp">联系我们</a></li>
            </ul>
        </div>
        <div id="language">
            <a class="chinese" onclick="changeLaug(1)" style="color: #e3c575;">中文</a>
            <span>&nbsp;&nbsp;|&nbsp;&nbsp;</span>
            <a class="english" onclick="changeLaug(2)">English</a>
        </div>
    </div>
    <!--展示图片区-->
    <div class="banimg">
        <img src="${ctx }/images/banimg.jpg">
    </div>
    <!--走进知脉-->
    <div class="w clearfloat">
        <ul id="jo-tab">
            <!--业务范围-->
            <li>
                <ul class="jo-tabs">
                </ul>
                <!--内容切换-->
                <div class="jo-tabcon">
                    <p class="jo-tabctit" style="border-bottom: none;">关于知脉</p>
                     <div style="display:none;" id="context"></div>
                </div>
            </li>
        </ul>
    </div>
    <!--底部-->
    
 <c:if test="${laugType != '2' }">
	<%@include file="/common/foot.jsp"%>
 </c:if>
 <c:if test="${laugType == '2' }">
	<%@include file="/common/enFoot.jsp"%>
 </c:if>
</div>
<script type="text/javascript" src="${ctx }/js/business.js"></script>
<script type="text/javascript">
	$(".chinese,.english").on("click",function() {
		window.location.reload();
	})
</script>
</body>
</html>