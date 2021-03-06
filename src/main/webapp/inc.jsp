<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script type="text/javascript" src="${pageContext.request.contextPath}/jslib/extBrowser.js" charset="utf-8"></script>
<%--easyui-1.5.X美化组件--%>
<%--<link href="${pageContext.request.contextPath}/jslib/reset.min.css" rel="stylesheet" type="text/css">--%>
<%--<link href="${pageContext.request.contextPath}/jslib/insdep/easyui_full.css" rel="stylesheet" type="text/css">--%>
<%--easyui-1.5.X美化组件--%>

<!-- 引入my97日期时间控件 -->
<script type="text/javascript" src="${pageContext.request.contextPath}/jslib/My97DatePicker4.8b3/My97DatePicker/WdatePicker.js" charset="utf-8"></script>

<!-- 引入kindEditor插件 -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/jslib/kindeditor-4.1.7/themes/default/default.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/jslib/kindeditor-4.1.7/kindeditor-all-min.js" charset="utf-8"></script>

<!-- 引入jQuery -->
<!-- <script src="${pageContext.request.contextPath}/jslib/jquery-1.8.3.js" type="text/javascript" charset="utf-8"></script>  -->
<script src="${pageContext.request.contextPath}/jslib/jquery-2.2.4.js" type="text/javascript" charset="utf-8"></script>

<!-- 引入Highcharts -->
<script src="${pageContext.request.contextPath}/jslib/Highcharts-3.0.1/js/highcharts.js" type="text/javascript" charset="utf-8"></script>


<!-- 引入bootstrap样式 -->
<link href="${pageContext.request.contextPath}/jslib/bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="${pageContext.request.contextPath}/jslib/bootstrap-fileinput/css/fileinput.min.css" media="all" rel="stylesheet" type="text/css" />

<!-- 引入FileUpload -->

<script src="${pageContext.request.contextPath}/jslib/bootstrap-fileinput/js/plugins/canvas-to-blob.min.js" type="text/javascript"></script>

<script src="${pageContext.request.contextPath}/jslib/bootstrap-fileinput/js/plugins/sortable.min.js" type="text/javascript"></script>

<script src="${pageContext.request.contextPath}/jslib/bootstrap-fileinput/js/plugins/purify.min.js" type="text/javascript"></script>

<script src="${pageContext.request.contextPath}/jslib/bootstrap-fileinput/js/fileinput.min.js"></script>



<script charset="utf-8" src="${pageContext.request.contextPath}/jslib/bootstrap-3.3.7/js/bootstrap.min.js" charset="utf-8"></script>


<!-- 引入FileUpload -->
<script src="${pageContext.request.contextPath}/jslib/bootstrap-fileinput/themes/gly/theme.js"></script>
<!-- optionally if you need translation for your language then include 
    locale file as mentioned below -->
<script type="text/javascript" src="${pageContext.request.contextPath}/jslib/bootstrap-fileinput/js/locales/zh.js"></script>

<!-- 引入EasyUI -->
<link id="easyuiTheme" rel="stylesheet" href="${pageContext.request.contextPath}/jslib/jquery-easyui-1.5.1/themes/<c:out value="${cookie.easyuiThemeName.value}" default="bootstrap"/>/easyui.css" type="text/css">
<!-- <link rel="stylesheet" href="${pageContext.request.contextPath}/jslib/jquery-easyui-1.3.3/themes/icon.css" type="text/css"> -->
<script type="text/javascript" src="${pageContext.request.contextPath}/jslib/jquery-easyui-1.5.1/jquery.easyui.min.js" charset="utf-8"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/jslib/jquery-easyui-1.5.1/locale/easyui-lang-zh_CN.js" charset="utf-8"></script>

<!-- 引入EasyUI Portal插件 -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/jslib/jquery-easyui-portal/portal.css" type="text/css">
<script type="text/javascript" src="${pageContext.request.contextPath}/jslib/jquery-easyui-portal/jquery.portal.js" charset="utf-8"></script>

<!-- 扩展EasyUI -->
<script type="text/javascript" src="${pageContext.request.contextPath}/jslib/extEasyUI.js?v=201305241044" charset="utf-8"></script>

<!-- 扩展EasyUI Icon -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/style/extEasyUIIcon.css?v=201305301906" type="text/css">
<script type="text/javascript" src="${pageContext.request.contextPath}/jslib/syUtil.js" charset="utf-8"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/jslib/hylUtil.js" charset="utf-8"></script>

<!-- 扩展jQuery -->
<script type="text/javascript" src="${pageContext.request.contextPath}/jslib/extJquery.js?v=201305301341" charset="utf-8"></script>
