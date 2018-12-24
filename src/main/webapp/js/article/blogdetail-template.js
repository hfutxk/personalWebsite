
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
	/** 顶部导航栏 */
	$.ajax({
		url : '/module/navigation/topbar.html', 
		async : false,
		type : 'GET', 
		success : function(data) {
			$('#menuBarNo').before(data);
		}
	});

	/** 登录控制 */
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
	if ($.cookie('username') == 'xkang') {
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
function keywordsProcess(blogLabel) {
	var keyWordsStrBuf = [];
	var colorArray = [ "primary", "success", "info", "warning", "danger" ];

	if (typeof blogLabel != 'undefined' && blogLabel != "") {
		var keyWordsArray;
		if (blogLabel.indexOf(',') != -1) {
			keyWordsArray = blogLabel.split(",");
		} else {
			keyWordsArray = blogLabel.split(/\s+/);
		}

		for (var index = 0; index < keyWordsArray.length; index++) {
			keyWordsStrBuf += '<span class="label label-' + colorArray[index]
					+ '">' + keyWordsArray[index].trim() + '</span> ';
		}
	}

	return keyWordsStrBuf;
}

/**
 * 加载上下两篇按钮
 * 
 * @returns
 */
function loadBtnNeighbors(blogId) {
	var neighbors = '<nav>' + '	<ul class=\"pager\">'
			+ findPreviousBlog(blogId) + findNextBlog(blogId) + '	</ul>'
			+ '</nav>';

	$('#content').prepend(neighbors);
}

/**
 * 查找上一篇博客
 * 
 * @param blogId
 * @returns
 */
function findPreviousBlog(blogId) {
	var previousBlog = 0;
	$
			.ajax({
				type : 'POST',
				async : false,
				url : '/blog/query.hms',
				dataType : 'json',
				data : {
					type : 'query_previous',
					blogId : blogId
				},
				success : function(response) {
					if (response != 0) {
						previousBlog = '<li class="previous"><a href="/blog.hms?blogId='
								+ response
								+ '"><span class="glyphicon glyphicon-hand-left" aria-hidden="true"></span> 上一篇</a></li>\r\n';
					} else {
						previousBlog = '<li class="previous disabled"><a href="#"><span class="glyphicon glyphicon-hand-left" aria-hidden="true"></span> 上一篇</a></li>';
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

	return previousBlog;
}

/**
 * 查找下一篇博客
 * 
 * @param blogId
 * @returns
 */
function findNextBlog(blogId) {
	var nextBlog = 0;
	$
			.ajax({
				type : 'POST',
				async : false,
				url : '/blog/query.hms',
				dataType : 'json',
				data : {
					type : 'query_next',
					blogId : blogId
				},
				success : function(response) {
					if (response != 0) {
						nextBlog = '<li class="next"><a href="/blog.hms?blogId='
								+ response
								+ '">下一篇 <span class="glyphicon glyphicon-hand-right" aria-hidden="true"></span></a></li>';
					} else {
						nextBlog = '<li class="next disabled"><a href="#">下一篇 <span class="glyphicon glyphicon-hand-right" aria-hidden="true"></span></a></li>';
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

	return nextBlog;
}