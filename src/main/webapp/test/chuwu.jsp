<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<!-- Meta, title, CSS, favicons, etc. -->
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<jsp:include page="../inc.jsp"></jsp:include>
	<jsp:include page="../inccss.jsp"></jsp:include>
	<link type="text/css" rel="stylesheet" href="../style/tables.css"></link>
	<jsp:include page="../incjs.jsp"></jsp:include>
<script type="text/javascript">
	$(function(){
        // Panel toolbox
        $(document).ready(function() {
            $('.collapse-link').on('click', function() {
                var $BOX_PANEL = $(this).closest('.x_panel'),
                    $ICON = $(this).find('i'),
                    $BOX_CONTENT = $BOX_PANEL.find('.x_content');

                // fix for some div with hardcoded fix class
                if ($BOX_PANEL.attr('style')) {
                    $BOX_CONTENT.slideToggle(200, function(){
                        $BOX_PANEL.removeAttr('style');
                    });
                } else {
                    $BOX_CONTENT.slideToggle(200);
                    $BOX_PANEL.css('height', 'auto');
                }

                $ICON.toggleClass('fa-chevron-up fa-chevron-down');
            });

            $('.close-link').click(function () {
                var $BOX_PANEL = $(this).closest('.x_panel');

                $BOX_PANEL.remove();
            });
        });
        // /Panel toolbox
	});
</script>
</head>
<body>
	<div id="main-col" class="container-fluid">
		<!-- page_title -->
		<div class="row">
			<div class="col-md-12 col-sm-12 col-xs-12 page-title">
				<!-- 整个页面的标题 -->
				<div class="col-md-3 col-sm-3 col-xs-12 title-left">
					<!-- 左标题位置布局 -->

					<h3></h3>
				</div>

				<div class="col-md-6 col-sm-6 col-xs-12 title-middle">
					<!-- 中间位置布局 -->
					<div style="position: relative;text-align: center;">
						<h3>正新混除臭设备监控管理看板</h3>
					</div>

				</div>

				<div
						class="col-md-3 col-sm-3 col-xs-12 title-right form-group pull-right top-search">
					<!-- 右标题位置布局 -->
					<div class="input-group">
						<div style="margin-top: 30px;">
							更新时间:2015/9/01/11:00
						</div>
						
					</div>
				</div>
			</div>
		</div>

		<div class="clearfix"></div>

		<!-- 基本表四种展示 -->
		<div class="row">
			<div class="col-md-8 col-sm-8 col-xs-12">
				<div class="x_panel">
					<div class="x_title">
						<h2><i class="fa fa-bars"></i> 502A <small>车间</small></h2>
						<ul class="nav navbar-right panel-toolbox">
							<li><a class="collapse-link"><i class="fa fa-chevron-up"></i>
							</a></li>
							<li><a href="#" class="dropdown-toggle"
								   data-toggle="dropdown" role="button" aria-expanded="false"><i
									class="fa fa-wrench"></i> </a>
								<ul class="dropdown-menu" role="menu">
									<li><a href="#">设置 1</a></li>
									<li><a href="#">设置 2</a></li>
								</ul>
							</li>
							<li><a class="close-link"><i class="fa fa-close"></i> </a></li>
						</ul>
						<div class="clearfix"></div>
					</div>
					<div class="x_content">
						<!--
							scope 属性定义将表头单元与数据单元相关联的方法。
							scope 属性标识某个单元是否是列、行、列组或行组的表头。
							scope 属性不会在普通浏览器中产生任何视觉变化。
						 -->
						<div class="row">
							<div class="col-md-4">
								<div class="x_chuchou">
									<div class="x_S">
										<div>日用水量</div>
										<div>风压</div>
										<div>幽幽</div>
									</div>
									<div class="x_X" style="margin-top: 20px;">
										<div class="row">
											<div class="col-md-4">
												<div style="background-color:#4cae4c;">BM13</div>
											</div>
											<div class="col-md-4">
												<div style="background-color:#4cae4c;">BM14</div>
											</div>
											<div class="col-md-4">
												<div style="background-color:#4cae4c;">BM15</div>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="col-md-4">
								<div class="x_chuchou">
									<div class="x_S">
										<div>日用水量</div>
										<div>风压</div>
										<div>幽幽</div>
									</div>
									<div class="x_X" style="margin-top: 20px;">
										<div class="row">
											<div class="col-md-4">
												<div style="background-color:#4cae4c;">BM13</div>
											</div>
											<div class="col-md-4">
												<div style="background-color:#4cae4c;">BM14</div>
											</div>
											<div class="col-md-4">
												<div style="background-color:#4cae4c;">BM15</div>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="col-md-4">
								<div class="x_chuchou">
									<div class="x_S">
										<div>日用水量</div>
										<div>风压</div>
										<div>幽幽</div>
									</div>
									<div class="x_X" style="margin-top: 20px;">
										<div class="row">
											<div class="col-md-4">
												<div style="background-color:#4cae4c;">BM13</div>
											</div>
											<div class="col-md-4">
												<div style="background-color:#4cae4c;">BM14</div>
											</div>
											<div class="col-md-4">
												<div style="background-color:#4cae4c;">BM15</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>

			<div class="col-md-4 col-sm-4 col-xs-12">
				<div class="x_panel">
					<div class="x_title">
						<h2><i class="fa fa-bars"></i> 502B <small>车间</small></h2>
						<ul class="nav navbar-right panel-toolbox">
							<li><a class="collapse-link"><i class="fa fa-chevron-up"></i>
							</a></li>
							<li><a href="#" class="dropdown-toggle"
								   data-toggle="dropdown" role="button" aria-expanded="false"><i
									class="fa fa-wrench"></i> </a>
								<ul class="dropdown-menu" role="menu">
									<li><a href="#">设置 1</a></li>
									<li><a href="#">设置 2</a></li>
								</ul>
							</li>
							<li><a class="close-link"><i class="fa fa-close"></i> </a></li>
						</ul>
						<div class="clearfix"></div>
					</div>
					<div class="x_content">
						<div class="row">
							<div class="col-md-12">
								<div class="x_chuchou">
									<div class="x_S">
										<div>日用水量</div>
										<div>风压</div>
										<div>幽幽</div>
									</div>
									<div class="x_X" style="margin-top: 20px;">
										<div class="row">
											<div class="col-md-4">
												<div style="background-color:#4cae4c;">BM13</div>
											</div>
											<div class="col-md-4">
												<div style="background-color:#4cae4c;">BM14</div>
											</div>
											<div class="col-md-4">
												<div style="background-color:#4cae4c;">BM15</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="clearfix"></div>

		<div class="row">
			<div class="col-md-5">
				<div class="x_panel">
					<div class="x_title">
						<h2><i class="fa fa-bars"></i> 查询 <small>表格</small></h2>
						<ul class="nav navbar-right panel-toolbox">
							<li><a class="collapse-link"><i class="fa fa-chevron-up"></i>
							</a></li>
							<li><a href="#" class="dropdown-toggle"
								   data-toggle="dropdown" role="button" aria-expanded="false"><i
									class="fa fa-wrench"></i> </a>
								<ul class="dropdown-menu" role="menu">
									<li><a href="#">设置 1</a></li>
									<li><a href="#">设置 2</a></li>
								</ul>
							</li>
							<li><a class="close-link"><i class="fa fa-close"></i> </a></li>
						</ul>
						<div class="clearfix"></div>
					</div>
					<div class="x_content">

					</div>
				</div>
			</div>
			<div class="col-md-7">
				<div class="x_panel">
					<div class="x_title">
						<h2><i class="fa fa-bars"></i> 202 <small>车间</small></h2>
						<ul class="nav navbar-right panel-toolbox">
							<li><a class="collapse-link"><i class="fa fa-chevron-up"></i>
							</a></li>
							<li><a href="#" class="dropdown-toggle"
								   data-toggle="dropdown" role="button" aria-expanded="false"><i
									class="fa fa-wrench"></i> </a>
								<ul class="dropdown-menu" role="menu">
									<li><a href="#">设置 1</a></li>
									<li><a href="#">设置 2</a></li>
								</ul>
							</li>
							<li><a class="close-link"><i class="fa fa-close"></i> </a></li>
						</ul>
						<div class="clearfix"></div>
					</div>
					<div class="x_content">
						<div class="row">
							<div class="col-md-12">
								<div class="x_chuchou">
									<div class="x_S">
										<div>日用水量</div>
										<div>风压</div>
										<div>幽幽</div>
									</div>
									<div class="x_X" style="margin-top: 20px;">
										<div class="row">
											<div class="col-md-4">
												<div style="background-color:#4cae4c;">BM13</div>
											</div>
											<div class="col-md-4">
												<div style="background-color:#4cae4c;">BM14</div>
											</div>
											<div class="col-md-4">
												<div style="background-color:#4cae4c;">BM15</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>