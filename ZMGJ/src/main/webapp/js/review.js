$(function() {
	loadAdInfo($(".nav-items a").eq(3).attr("id"),1);
	$(".nav-items a").removeClass("head-tivace");
	$(".nav-items a").eq(3).addClass("head-tivace");
	if(laugType == '2') {
		$(".chinese").attr("style","");
		$(".english").attr("style","color: #e3c575;");
		$(".jo-tabctit").html("Review");
	} else {
		$(".english").attr("style","");
		$(".chinese").attr("style","color: #e3c575;");
		$(".jo-tabctit").html("往期回顾");
	}
})

// 加载详情
var typeId = 4;
function loadAdInfo(id,page) {
	$.ajax({
		url : ctx + "/zmgj/getAdvertise.do",
		dataType : "json",
		data : {
			"id" : id,
			"page":page
		},
		type : "post",
		success : function(data) {
			if(laugType == '2') {
				$("#infoList p").eq(0).text("Review");
			} else {
				$("#infoList p").eq(0).text("往期回顾");
			}
			if (data.success) {
				// 加载详情
				var str = "";
				$.each(data.list, function(index,item) {
					var time = new Date(item.createTime).Format("yyyy-MM-dd hh:mm");
					if(laugType == '2') {
						var name = encodeURI("Review");   
					}else {
						var name = encodeURI("往期回顾");   
					}
					str += "<li class='jo-msglists clearfloat'>"+
				               "    <a href='"+ ctx+"/joindetail.jsp?adId="+item.adId+"&typeName=" + name +"' >"+
				              "      <p>"+item.adDetailDesc+"</p>"+
				             "       <span class='jo-msgltime'>"+time+"</span>"+
				                "</a>"+
				            "</li>";
				});
				var fy = "";
				for(var i = 1; i <= data.totalPages; i++) {
					if(i == page) {
						fy += "<li class='fyUlli active' id='pageli"+i+"' onclick='upPage("+i+");'>"+i+"</li>";
					}else {
						fy += "<li class='fyUlli' id='pageli"+i+"' onclick='upPage("+i+");'>"+i+"</li>";
					}
							
				}
				$("#nowPage").val(data.nowPage);
				$("#totalPages").val(data.totalPages);
				$("#fyUl").html(fy);
				$(".jo-msglist").html(str);
				$("#fy").show();
			} else{
				$("#fy").hide();
				$(".jo-msglist").html("暂无数据Temporarily no data");
			}
		}
	})
}

function loadDetails(id) {
	location.href=ctx + "/zmgj/loadAdDetails.do?adId=" + id;
}


function clickLastPage(){
	var nowpage = parseInt($("#nowPage").val())-1;
	if(nowpage != 0){
		loadAdInfo(typeId,nowpage);
	}
}
function clickNextPage(){
	var nowpage = parseInt($("#nowPage").val())+1;
	if(nowpage <= parseInt($("#totalPages").val()) ){
		loadAdInfo(typeId,nowpage);
	}
}

function jumpPage(){
	var nowpage = parseInt($("#nowPage").val());
	if(nowpage != 0 && nowpage <= parseInt($("#totalPages").val() ) ){
		loadAdInfo(typeId,nowpage);
	}
}
function clickFirst(page){
	var nowpage = 1;
	loadAdInfo(typeId,nowpage);
}
function clickLast(page){
	var nowpage = parseInt($("#totalPages").val());
	loadAdInfo(typeId,nowpage);
}
function upPage(page) {
	loadAdInfo(typeId,page);
}
