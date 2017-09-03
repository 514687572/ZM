$(function() {
	loadAdInfo($(".nav-items a").eq(5).attr("id"),"联系我们");
	$(".nav-items a").removeClass("head-tivace");
	$(".nav-items a").eq(5).addClass("head-tivace");
	if(laugType == '2') {
		$(".chinese").attr("style","");
		$(".english").attr("style","color: #e3c575;");
	} else {
		$(".english").attr("style","");
		$(".chinese").attr("style","color: #e3c575;");
	}
})
var typeId,typeName;

// 加载详情
function loadAdInfo(id,name) {
	if(id != null) {
		typeId = id;
	}
	if(name != null ) {
		typeName = name;
	}
	$.ajax({
		url : ctx + "/zmgj/getAdvertiseWithoutPage.do",
		dataType : "json",
		data : {
			"id" : id
		},
		type : "post",
		success : function(data) {
			if (data.success) {
				// 加载详情
				$(".conus-text").html(data.list.remark1);
			} else{
				if(laugType == '2') {
					$(".conus-text").html('<p class="conus-tit">'
												+'<br />'
												+'</p>'
												+'<p class="conus-tit">'
												+'Contact Us'
												+'	</p>'
												+'	<p class="conus-tp">'
												+'		firm name: Beijing Zhi Mai International education consulting firm '
												+'	</p>'
												+'	<p class="conus-tp">'
												+'		tel : 010- 5719 2911 '
												+'	</p>'
												+'	<p class="conus-tp">'
												+'		Address: Chang Ying Constellation, Chang Tong Road, No.3 Courtyard,	<br /> Building 2, 1207, Chao Yang District'
												+'	</p>'
												+'	<p class="conus-tp">'
												+'		zip code: 100024'
												+'	</p>'
												+'	<p class="conus-tp">'
												+'		Email：ggoffice@zhimaizx.com'
												+'	</p>'
												+'	<p>'
												+'		<br />'
												+'	</p>'
												+'	<span><img src="images/ewms.jpg" /></span>');
				} else {
					$(".conus-text").html("<p>qwq(^_−)☆(^_−)☆c(^_−)☆数据君粗去玩了(^_−)☆(^_−)☆c(^_−)☆qwq</p>");
				}
			}
		}
	})
}
