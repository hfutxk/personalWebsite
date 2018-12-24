<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>博客详细内容</title>

<meta name="description"
	content="欢迎来到何明胜的个人网站.本站主要用于记录和分享本人的学习心得和编程经验,并分享常见可复用代码、推荐书籍以及软件等资源.本站源码已托管github,欢迎访问：https://github.com/HelloHusen/web">
<meta name="keywords" content="何明胜,何明胜的个人网站,何明胜的博客,一格的程序人生">
<meta name="author" content="何明胜,一格">

<link rel="shortcut icon" href="/images/favicon.ico">

<!-- jQuery -->
<script src="/plugins/jquery/js/jquery-3.2.1.min.js"></script>

<script src="/js/article/blogdetail-template.js"></script>  

<!-- editor.md -->
<link rel="stylesheet"
	href="/plugins/editormd/css/editormd.preview.min.css">
<link rel="stylesheet" href="/plugins/editormd/css/editormd.min.css">

<!-- editor.md -->
<script src="/plugins/editormd/lib/marked.min.js"></script>
<script src="/plugins/editormd/lib/prettify.min.js"></script>
<script src="/plugins/editormd/js/editormd.min.js"></script>

<script src="/js/article/article-markdown.js"></script>

<link rel="stylesheet" href="/css/article/article.css">

<script src="/js/article/blog-details.js"></script>

</head>
<body>
	<input id="menuBarNo" value="1" type="hidden">
	<div id="fh5co-page">
	
		<div id="fh5co-main">
			<div id="list_blog" class="fh5co-post">
					
				<div class="fh5co-entry markdown-body editormd-html-preview"
					id="content">
					<div>
						<h2 class="text-align-center"><input id="hiden_blogId" type="hidden" value="${blog.blogId}" />
					         <a href=#> ${blog.blogTitle} </a>
						</h2>
						<span class="fh5co-post-date"><fmt:formatDate value="${blog.blogDate}" pattern="yyyy-MM-dd hh:mm:ss"/></span>
						<span class="fh5co-post-date">作者：${blog.blogAuthor}</span>
						<span class="fh5co-post-date">浏览：${blog.blogRead}次</span>
						<span class="fh5co-post-date" id="keywords">关键字：</span>
					</div>
					<hr/>
					 ${blog.blogHtmlContent}
				</div>
			</div>
		</div>

	</div>
</body>
<script type="text/javascript">
$(function() {
	
/* 	var blogBody = 
		'<div>'
		+ '	<h2 class="text-align-center"><input id="hiden_blogId" type="hidden" value="'
		+ 	'${blog.blogId}' + '" />' 
		+ '		<a href=#>' + '${blog.blogTitle}' + '</a>'
		+ '	</h2>' 
		+ '	<span class="fh5co-post-date">' + new Date('${blog.blogDate}').format('yyyy-MM-dd hh:mm:ss') + '</span>' 
		+ ' <span class="fh5co-post-date">作者:' + '${blog.blogAuthor}' + '</span>'
		+ ' <span class="fh5co-post-date">浏览' + '${blog.blogRead}' + '次</span>'
		+ ' <span class="fh5co-post-date">关键字：' + keywordsProcess('${blog.blogLabel}') + '</span>'; */
	var keywords = keywordsProcess('${blog.blogLabel}') ;
	$('#keywords').append(keywords);	
	if (isSuperAdminOrSelf('${blog.blogAuthor}')) {
		var blogBody = '<a href="/editor/article.hms?blogId='
				+ '${blog.blogId}'
				+ '" target="_blank" role="button" class="btn btn-default btn-sm">编辑</a> '
				+ '<a id="btn_deleteBlog" href="javascript:void(0)" role="button" class="btn btn-danger btn-sm">删除</a>';
		$('#keywords').after(blogBody);
}
/* blogBody +=  '<hr/>'+"${blog.blogHtmlContent}" + '</div>'; */
loadBtnNeighbors('${blog.blogId}');
	
});

</script>
</html>
