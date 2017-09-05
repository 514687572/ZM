$(function() {
	loadModules();
	if(laugType == '2') {
		$(".chinese").attr("style","");
		$(".english").attr("style","color: #e3c575;");
	} else {
		$(".english").attr("style","");
		$(".chinese").attr("style","color: #e3c575;");
	}
	changeLaug = function (type) {
		if(type == '1') {
			$(".english").attr("style","");
			$(".chinese").attr("style","color: #e3c575;");
		} else {
			$(".chinese").attr("style","");
			$(".english").attr("style","color: #e3c575;");
		}
		$.ajax({
			url:ctx + "/zmgj/changeLaug.do",
			data:{"type":type},
			type:"post",
			dataType:"json",
			success:function() {
				loadModules();
			}
		})
	}
})
function loadModules() {
	$.ajax({
		url:ctx + "/zmgj/loadModules.do",
		async:false,
		dataType:"json",
		type:"post",
		success:function(data) {
			if(data.success) {
				if(data.type == '1') {
					$("#work .wtit").html("业务<i class='wicon'></i>板块");
				} else {
					$("#work .wtit").html("Our<i class='wicon'></i>Businesses");
				}
				var str = "";
				str = "<li class='nav-items'>  <a id='"+data.list[0].id+"' class='head-tivace' href='"+ctx+"/index.jsp'>"+data.list[0].dicName+"</a></li> " +
						"<li class='nav-items'><a id='"+data.list[1].id+"' href='"+ctx+"/business.jsp'>"+data.list[1].dicName+"</a></li>" +
						"<li class='nav-items'><a id='"+data.list[2].id+"' href='"+ctx+"/join.jsp'>"+data.list[2].dicName+"</a></li>" +
						"<li class='nav-logo'><img src='"+ctx+"/images/logo.png'></li>" +
						"<li class='nav-items'><a id='"+data.list[3].id+"' href='"+ctx+"/review.jsp'>"+data.list[3].dicName+"</a></li>" +
						"<li class='nav-items'><a id='"+data.list[4].id+"' href='#'>"+data.list[4].dicName+"</a></li>" +
						"<li class='nav-items'><a id='"+data.list[5].id+"' href='"+ctx+"/Contactus.jsp'>"+data.list[5].dicName+"</a></li>";
				$("#nav").html(str);
				$.each(data.wlist,function(index,item) {
					$("#wlist p").eq(index).text(item.dicName);
				})
				$.each(data.jlist,function(index,item) {
					if(index == 0) {
						$("#join .wtit").html(item);
					} else {
						$(".join-iconp").eq(index - 1).html(item);
						
					}
				})
			}
		}
	})
}