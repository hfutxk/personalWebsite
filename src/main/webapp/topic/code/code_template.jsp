<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>代码详情</title>

<link rel="shortcut icon" href="/images/favicon.ico">

<!-- jQuery -->
<script src="/plugins/jquery/js/jquery-3.2.1.min.js"></script>

<script src="/js/article/code-template.js"></script>

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

<script src="/js/article/article-markdown.js"></script>
<script src="/js/article/code-details.js"></script>
</head>
<body>
	<input id="menuBarNo" value="2" type="hidden">
	<div id="fh5co-page">
		<div id="fh5co-main">
			<div id="list_clode" class="fh5co-post">
				
				<div class="fh5co-entry markdown-body editormd-html-preview"
					id="content">
					
					<div>
						<h2 class="text-align-center"><input id="hiden_codeId" type="hidden" value="${code.codeId}" /> 
							<a href=#>${code.codeTitle}</a>
						</h2>
						<span class="fh5co-post-date"><fmt:formatDate value="${code.codeDate}" pattern="yyyy-MM-dd hh:mm:ss"/> </span>
						<span class="fh5co-post-date">作者：${code.codeAuthor}</span>
						<span class="fh5co-post-date">浏览 ${code.codeRead}次</span>
						<span class="fh5co-post-date" id="keywords">关键字： </span>
					</div>
					<hr/>
					${code.codeHtmlContent}
				</div>
			</div>
		</div>
		
	</div>

</body>
<script type="text/javascript">
	$(function(){
		var keywords = keywordsProcess('${code.codeLabel}');
		$('#keywords').append(keywords);	
		if (isSuperAdminOrSelf(data.codeAuthor)) {
			var codeBody = '<a href="/editor/article.hms?codeId='
					+ '${code.codeId}'
					+ '" target="_blank" role="button" class="btn btn-default btn-sm">编辑</a> '
					+ '<a id="btn_deleteCode" href="javascript:void(0)" role="button" class="btn btn-danger btn-sm">删除</a>';
					
			$('#keywords').after(codeBody);
		}
		loadBtnNeighbors('${code.codeId}');
		
	})

</script>
</html>