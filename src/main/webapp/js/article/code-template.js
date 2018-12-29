/**
 * @author 何明胜
 *
 * 2017年12月20日
 */

/** 加载插件 * */
$.ajax({
	url : '/plugins/plugins.html', 
	async : false,
	type : 'GET', 
	success : function(data) {
		$($('head')[0]).find('script:first').after(data);
	}
});

$(function() {
	/** 顶部导航栏 * */
	$.ajax({
		url : '/module/navigation/topbar.html', 
		async : false,
		type : 'GET', 
		success : function(data) {
			$('#menuBarNo').before(data);
		}
	});

	/** 登录控制 * */
	$.ajax({
		url : '/module/login/login.html', 
		async : false,
		type : 'GET', 
		success : function(data) {
			$('#menuBarNo').before(data);
		}
	});

	/** 左侧导航栏 * */
	$.ajax({
		url : '/module/navigation/leftbar.html', 
		async : false,
		type : 'GET', 
		success : function(data) {
			$('#fh5co-main').before(data);
		}
	});

	/** 右侧导航栏 * */
	$.ajax({
		url : '/module/navigation/rightbar.html', 
		async : false,
		type : 'GET', 
		success : function(data) {
			$('#fh5co-main').after(data);
		}
	});
});

/**
 * 是否是管理员
 * 
 * @returns
 */
function isSuperAdminOrSelf(author) {
	if ($.cookie('username') == 'husen') {
		return true;
	}

	if ($.cookie('username') == author) {
		return true;
	}
	
	return false;
}

/**
 * 文章标签处理
 * 
 * @param blogLabel
 * @returns
 */
function keywordsProcess(codeLabel) {
	var keyWordsStrBuf = [];
	var colorArray = ["primary" , "success", "info", "warning", "danger"];
	
	if (typeof codeLabel != 'undefined' && codeLabel != "") {
		var keyWordsArray;
		if (codeLabel.indexOf(',') != -1) {
			keyWordsArray = codeLabel.split(",");
		} else {
			keyWordsArray = codeLabel.split(/\s+/);
		}

		for (var index = 0; index < keyWordsArray.length; index++) {
			keyWordsStrBuf += '<span class="label label-' + colorArray[index] + '">'
					+ keyWordsArray[index].trim() + '</span> ';
		}
	}

	return keyWordsStrBuf;
}

/**
 * 加载上下两篇按钮
 * 
 * @returns
 */
function loadBtnNeighbors(codeId) {
	var neighbors = 
			'<nav>'
			+ '	<ul class="pager">'
			+ findPreviousCode(codeId) + findNextCode(codeId) 
			+ '</ul>'
			+ '</nav>';

	$('#content').prepend(neighbors);
}

/**
 * 查找上一篇代码
 * @param codeId
 * @returns
 */
function findPreviousCode(codeId) {
	var previousCode = 0;
	$
			.ajax({
				type : 'POST',
				async : false,
				url : '/code/query.hms',
				dataType : 'json',
				data : {
					type : 'query_previous',
					codeId : codeId
				},
				success : function(response) {
					if (response != 0) {
						previousCode = '<li class="previous"><a href="/code.hms?codeId=' + response +  '"><span class="glyphicon glyphicon-hand-left" aria-hidden="true"></span> 上一篇</a></li>';
					}else {
						previousCode = '<li class="previous disabled"><a href="#"><span class="glyphicon glyphicon-hand-left" aria-hidden="true"></span> 上一篇</a></li>';
					}
				},
				error : function(XMLHttpRequest, textStatus) {
					$.confirm({
						title : '查询出错',
						content : textStatus + ' : ' + XMLHttpRequest.status,
						autoClose : 'ok|2000',
						type : 'red',
						buttons : {
							ok : {
								text : '确认',
								btnClass : 'btn-primary',
							},
						}
					});
				}
			});

	return previousCode;
}

/**
 * 查找下一篇代码
 * @param codeId
 * @returns
 */
function findNextCode(codeId) {
	var nextCode = 0;
	$
			.ajax({
				type : 'POST',
				async : false,
				url : '/code/query.hms',
				dataType : 'json',
				data : {
					type : 'query_next',
					codeId : codeId
				},
				success : function(response) {
					if (response != 0) {
						nextCode = '<li class="next"><a href="/code.hms?codeId=' + response + '">下一篇 <span class="glyphicon glyphicon-hand-right" aria-hidden="true"></span></a></li>';
					}else {
						nextCode = '<li class="next disabled"><a href="#">下一篇 <span class="glyphicon glyphicon-hand-right" aria-hidden="true"></span></a></li>';
					}
				},
				error : function(XMLHttpRequest, textStatus) {
					$.confirm({
						title : '查询出错',
						content : textStatus + ' : ' + XMLHttpRequest.status,
						autoClose : 'ok|2000',
						type : 'red',
						buttons : {
							ok : {
								text : '确认',
								btnClass : 'btn-primary',
							},
						}
					});
				}
			});

	return nextCode;
}