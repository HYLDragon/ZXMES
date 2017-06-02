<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML>
<html>
<head>
<title>常用挂件</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Meta, title, CSS, favicons, etc. -->
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<jsp:include page="../inc.jsp"></jsp:include>
<jsp:include page="../inccss.jsp"></jsp:include>
<jsp:include page="../incjs.jsp"></jsp:include>
<link type="text/css" rel="stylesheet"
	href="../style/general_elements.css"></link>

<script type="text/javascript">
	$(function() {

	});
	$(function () {
		  $('[data-toggle="tooltip"]').tooltip({
		        container: 'body'
		    });
	});
	
	// iCheck
	$(document).ready(function() {
	    if ($("input.flat")[0]) {
	        $(document).ready(function () {
	            $('input.flat').iCheck({
	                checkboxClass: 'icheckbox_flat-green',
	                radioClass: 'iradio_flat-green'
	            });
	        });
	    }
	});
	// /iCheck
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
</script>
</head>

<body>
	<div id="main-col" class="container-fluid">
		<div class="row">
			<div class="col-md-12 col-sm-12 col-xs-12 page-title">
				<!-- 整个页面的标题 -->
				<div class="col-md-6 col-sm-6 col-xs-12 title-left">
					<!-- 左标题位置布局 -->
					<h3>常用挂件案例展示</h3>
				</div>
				<div
					class="col-md-3 col-sm-3 col-xs-12 title-right form-group pull-right top-search">
					<!-- 右标题位置布局 -->
					<div class="input-group">
						<input type="text" class="form-control" placeholder="查找..." /> <span
							class="input-group-btn">
							<button type="button" class="btn btn-default">go</button> </span>
					</div>
				</div>
			</div>
		</div>

		<div class="clearfix"></div>

		<div class="row">
			<div class="col-md-6 col-sm-6 col-xs-12">
				<div class="x_panel">
					<div class="x_title">
						<h2>
							<i class="fa fa-bars"></i> Tabs <small>Float left</small>
						</h2>
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
						<!-- 清除ul中li 浮动带来的影响 让白线下来 -->
					</div>
					<div class="x_content">
						<div role="tabpanel" data-example-id="togglable-tabs">
							<ul class="nav nav-tabs bar_tabs" role="tablist">
								<li role="presentation" class="active"><a
									href="#tab_content1" id="home-tab" role="tab" data-toggle="tab"
									aria-expanded="true">Home</a></li>
								<li role="presentation"><a href="#tab_content2" role="tab"
									id="profile-tab" data-toggle="tab" aria-expanded="false">Profile</a>
								</li>
								<li role="presentation"><a href="#tab_content3" role="tab"
									id="profile-tab2" data-toggle="tab" aria-expanded="false">Profile</a>
								</li>
							</ul>
							<div id="myTabContent" class="tab-content">
								<div role="tabpanel" class="tab-pane fade active in"
									id="tab_content1" aria-labelledby="home-tab">
									<p>Raw denim you probably haven't heard of them jean shorts
										Austin. Nesciunt tofu stumptown aliqua, retro synth master
										cleanse. Mustache cliche tempor, williamsburg carles vegan
										helvetica. Reprehenderit butcher retro keffiyeh dreamcatcher
										synth. Cosby sweater eu banh mi, qui irure terr.</p>
								</div>
								<div role="tabpanel" class="tab-pane fade" id="tab_content2"
									aria-labelledby="profile-tab">
									<p>Food truck fixie locavore, accusamus mcsweeney's marfa
										nulla single-origin coffee squid. Exercitation +1 labore
										velit, blog sartorial PBR leggings next level wes anderson
										artisan four loko farm-to-table craft beer twee. Qui photo
										booth letterpress, commodo enim craft beer mlkshk aliquip</p>
								</div>
								<div role="tabpanel" class="tab-pane fade" id="tab_content3"
									aria-labelledby="profile-tab">
									<p>xxFood truck fixie locavore, accusamus mcsweeney's marfa
										nulla single-origin coffee squid. Exercitation +1 labore
										velit, blog sartorial PBR leggings next level wes anderson
										artisan four loko farm-to-table craft beer twee. Qui photo
										booth letterpress, commodo enim craft beer mlkshk</p>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>

			<!-- <div class="clearfix"></div>  不能去除浮动，class="row"浮动被去除会出问题  -->

			<div class="col-md-6 col-sm-6 col-xs-12">
				<div class="x_panel">
					<div class="x_title">
						<h2>
							<i class="fa fa-bars"></i> Tabs <small>Float right</small>
						</h2>
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
						<!-- 清除ul中li 浮动带来的影响 让白线下来 -->
					</div>
					<div class="x_content">
						<div role="tabpanel" data-example-id="togglable-tabs">
							<ul class="nav nav-tabs right bar_tabs" role="tablist">
								<li role="presentation" class="active"><a
									href="#tab_content1" id="home-tab" role="tab" data-toggle="tab"
									aria-expanded="true">Home</a></li>
								<li role="presentation"><a href="#tab_content2" role="tab"
									id="profile-tab" data-toggle="tab" aria-expanded="false">Profile</a>
								</li>
								<li role="presentation"><a href="#tab_content3" role="tab"
									id="profile-tab2" data-toggle="tab" aria-expanded="false">Profile</a>
								</li>
							</ul>
							<div id="myTabContent" class="tab-content">
								<div role="tabpanel" class="tab-pane fade active in"
									id="tab_content1" aria-labelledby="home-tab">
									<p>Raw denim you probably haven't heard of them jean shorts
										Austin. Nesciunt tofu stumptown aliqua, retro synth master
										cleanse. Mustache cliche tempor, williamsburg carles vegan
										helvetica. Reprehenderit butcher retro keffiyeh dreamcatcher
										synth. Cosby sweater eu banh mi, qui irure terr.</p>
								</div>
								<div role="tabpanel" class="tab-pane fade" id="tab_content2"
									aria-labelledby="profile-tab">
									<p>Food truck fixie locavore, accusamus mcsweeney's marfa
										nulla single-origin coffee squid. Exercitation +1 labore
										velit, blog sartorial PBR leggings next level wes anderson
										artisan four loko farm-to-table craft beer twee. Qui photo
										booth letterpress, commodo enim craft beer mlkshk aliquip</p>
								</div>
								<div role="tabpanel" class="tab-pane fade" id="tab_content3"
									aria-labelledby="profile-tab">
									<p>xxFood truck fixie locavore, accusamus mcsweeney's marfa
										nulla single-origin coffee squid. Exercitation +1 labore
										velit, blog sartorial PBR leggings next level wes anderson
										artisan four loko farm-to-table craft beer twee. Qui photo
										booth letterpress, commodo enim craft beer mlkshk</p>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>

		</div>

		<div class="clearfix"></div>

		<div class="row">
			<div class="col-md-6 col-sm-6 col-xs-12">
				<div class="x_panel">
					<div class="x_title">
						<h2>
							<i class="fa fa-bars"></i>Vertical Tabs <small>Float left</small>
						</h2>
						<ul class="nav navbar-right panel-toolbox">
							<li><a class="collapse-link"><i class="fa fa-chevron-up"></i>
							</a></li>
							<li><a href="#" class="dropdown-toggle"
								data-toggle="dropdown"><i class="fa fa-wrench"></i> </a>
								<ul class="dropdown-menu">
									<li><a href="#">设置 1</a></li>
									<li><a href="#">设置 2</a></li>
								</ul>
							</li>
							<li><a class="close-link"><i class="fa fa-close"></i> </a></li>
						</ul>
						<div class="clearfix"></div>
						<!-- 清除ul中li 浮动带来的影响 让白线下来 -->
					</div>
					<div class="x_content">
						<div class="row" data-example-id="togglable-tabs">
							<div class="col-md-3 col-sm-3 col-xs-3">
								<ul class="nav nav-tabs tabs-left">
									<!-- 
										aria-haspopup :true表示点击的时候会出现菜单或是浮动元素； false表示没有pop-up效果。 aria-expanded:表示展开状态。默认为undefined,
										 表示当前展开状态未知。其它可选值：true表示元素是展开的；false表示元素不是展开的。
									 -->
									<li class="active"><a href="#tab_content4" id="home-tab"
										data-toggle="tab">Home</a></li>
									<li><a href="#tab_content5" id="profile-tab"
										data-toggle="tab">Profile</a></li>
									<li><a href="#tab_content6" id="profile-tab2"
										data-toggle="tab">Profile</a></li>
								</ul>
							</div>
							<div class="col-md-9 col-sm-9 col-xs-9">
								<div id="myTabContent" class="tab-content">
									<div class="tab-pane fade active in" id="tab_content4">
										<p>神Raw denim you probably haven't heard of them jean
											shorts Austin. Nesciunt tofu stumptown aliqua, retro synth
											master cleanse. Mustache cliche tempor, williamsburg carles
											vegan helvetica. Reprehenderit butcher retro keffiyeh
											dreamcatcher synth. Cosby sweater eu banh mi, qui irure terr.</p>
									</div>
									<div class="tab-pane fade" id="tab_content5">
										<p>佛Food truck fixie locavore, accusamus mcsweeney's marfa
											nulla single-origin coffee squid. Exercitation +1 labore
											velit, blog sartorial PBR leggings next level wes anderson
											artisan four loko farm-to-table craft beer twee. Qui photo
											booth letterpress, commodo enim craft beer mlkshk aliquip</p>
									</div>
									<div class="tab-pane fade" id="tab_content6">
										<p>魔xxFood truck fixie locavore, accusamus mcsweeney's
											marfa nulla single-origin coffee squid. Exercitation +1
											labore velit, blog sartorial PBR leggings next level wes
											anderson artisan four loko farm-to-table craft beer twee. Qui
											photo booth letterpress, commodo enim craft beer mlkshk</p>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>

			<!-- <div class="clearfix"></div>  不能去除浮动，class="row"浮动被去除会出问题  -->

			<div class="col-md-6 col-sm-6 col-xs-12">
				<div class="x_panel">
					<div class="x_title">
						<h2>
							<i class="fa fa-bars"></i>Vertical Tabs <small>Float
								right</small>
						</h2>
						<ul class="nav navbar-right panel-toolbox">
							<li><a class="collapse-link"><i class="fa fa-chevron-up"></i>
							</a></li>
							<li><a href="#" class="dropdown-toggle"
								data-toggle="dropdown"><i class="fa fa-wrench"></i> </a>
								<ul class="dropdown-menu">
									<li><a href="#">设置 1</a></li>
									<li><a href="#">设置 2</a></li>
								</ul>
							</li>
							<li><a class="close-link"><i class="fa fa-close"></i> </a></li>
						</ul>
						<div class="clearfix"></div>
						<!-- 清除ul中li 浮动带来的影响 让白线下来 -->
					</div>
					<div class="x_content">
						<div class="row" data-example-id="togglable-tabs">
							<div class="col-md-9 col-sm-9 col-xs-9">
								<div id="myTabContent" class="tab-content">
									<div class="tab-pane fade active in" id="tab_content7">
										<p>神Raw denim you probably haven't heard of them jean
											shorts Austin. Nesciunt tofu stumptown aliqua, retro synth
											master cleanse. Mustache cliche tempor, williamsburg carles
											vegan helvetica. Reprehenderit butcher retro keffiyeh
											dreamcatcher synth. Cosby sweater eu banh mi, qui irure terr.</p>
									</div>
									<div class="tab-pane fade" id="tab_content8">
										<p>佛Food truck fixie locavore, accusamus mcsweeney's marfa
											nulla single-origin coffee squid. Exercitation +1 labore
											velit, blog sartorial PBR leggings next level wes anderson
											artisan four loko farm-to-table craft beer twee. Qui photo
											booth letterpress, commodo enim craft beer mlkshk aliquip</p>
									</div>
									<div class="tab-pane fade" id="tab_content9">
										<p>魔xxFood truck fixie locavore, accusamus mcsweeney's
											marfa nulla single-origin coffee squid. Exercitation +1
											labore velit, blog sartorial PBR leggings next level wes
											anderson artisan four loko farm-to-table craft beer twee. Qui
											photo booth letterpress, commodo enim craft beer mlkshk</p>
									</div>
								</div>
							</div>
							<div class="col-md-3 col-sm-3 col-xs-3">
								<ul class="nav nav-tabs tabs-left">
									<li class="active"><a href="#tab_content7" id="home-tab"
										data-toggle="tab">Home</a></li>
									<li><a href="#tab_content8" id="profile-tab"
										data-toggle="tab">Profile</a></li>
									<li><a href="#tab_content9" id="profile-tab2"
										data-toggle="tab">Profile</a></li>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="clearfix"></div>

		<div class="row">
			<div class="col-md-6 col-sm-6 col-xs-12">
				<div class="x_panel">
					<div class="x_title">
						<h2>
							<i class="fa fa-align-left"></i>手风琴<small>Sessions</small>
						</h2>
						<ul class="nav navbar-right panel-toolbox ">
							<li><a class="collapse-link"><i class="fa fa-chevron-up"></i>
							</a></li>
							<li><a href="#" class="dropdown-toggle"
								data-toggle="dropdown"><i class="fa fa-wrench"></i> </a>
								<ul class="dropdown-menu">
									<li><a href="#">设置 1</a></li>
									<li><a href="#">设置 2</a></li>
								</ul>
							</li>
							<li><a class="close-link"><i class="fa fa-close"></i> </a></li>
						</ul>
						<div class="clearfix"></div>
					</div>
					<div class="x_content">
						<div class="panel-group" id="accordion" role="tablist"
							aria-multiselectable="true">
							<div class="panel panel-default">
								<div class="panel-heading" role="tab" id="headingOne">
									<h4 class="panel-title">
										<a role="button" data-toggle="collapse"
											data-parent="#accordion" href="#collapseOne"
											aria-expanded="true" aria-controls="collapseOne">
											Collapsible Group Item #1 </a>
									</h4>
								</div>
								<div id="collapseOne" class="panel-collapse collapse in"
									role="tabpanel" aria-labelledby="headingOne">
									<div class="panel-body">
										<!-- 
											scope 属性定义将表头单元与数据单元相关联的方法。
											scope 属性标识某个单元是否是列、行、列组或行组的表头。
											scope 属性不会在普通浏览器中产生任何视觉变化。
										 -->
										<table class="table">
											<thead>
												<tr>
													<th>#</th>
													<th>First Name</th>
													<th>Last Name</th>
													<th>Username</th>
												</tr>
											</thead>
											<tbody>
												<tr>
													<th scope="row">1</th>
													<td>Mark</td>
													<td>Otto</td>
													<td>@mdo</td>
												</tr>
												<tr>
													<th scope="row">2</th>
													<td>Jacob</td>
													<td>Thornton</td>
													<td>@fat</td>
												</tr>
												<tr>
													<th scope="row">3</th>
													<td>Larry</td>
													<td>the Bird</td>
													<td>@twitter</td>
												</tr>
											</tbody>
										</table>
									</div>
								</div>
							</div>
							<div class="panel panel-default">
								<div class="panel-heading" role="tab" id="headingTwo">
									<h4 class="panel-title">
										<a class="collapsed" role="button" data-toggle="collapse"
											data-parent="#accordion" href="#collapseTwo"
											aria-expanded="false" aria-controls="collapseTwo">
											Collapsible Group Item #2 </a>
									</h4>
								</div>
								<div id="collapseTwo" class="panel-collapse collapse"
									role="tabpanel" aria-labelledby="headingTwo">
									<div class="panel-body">
										<p>
											<strong>Collapsible Item 2 data</strong>
										</p>
										Anim pariatur cliche reprehenderit, enim eiusmod high life
										accusamus terry richardson ad squid. 3 wolf moon officia aute,
										non cupidatat skateboard dolor brunch. Food truck quinoa
										nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt
										aliqua put a bird on it squid single-origin coffee nulla
										assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft
										beer labore wes anderson cred nesciunt sapiente ea proident.
										Ad vegan excepteur butcher vice lomo. Leggings occaecat craft
										beer farm-to-table, raw denim aesthetic synth nesciunt you
										probably haven't heard of them accusamus labore sustainable
										VHS.
									</div>
								</div>
							</div>
							<div class="panel panel-default">
								<div class="panel-heading" role="tab" id="headingThree">
									<h4 class="panel-title">
										<a class="collapsed" role="button" data-toggle="collapse"
											data-parent="#accordion" href="#collapseThree"
											aria-expanded="false" aria-controls="collapseThree">
											Collapsible Group Item #3 </a>
									</h4>
								</div>
								<div id="collapseThree" class="panel-collapse collapse"
									role="tabpanel" aria-labelledby="headingThree">
									<div class="panel-body">Anim pariatur cliche
										reprehenderit, enim eiusmod high life accusamus terry
										richardson ad squid. 3 wolf moon officia aute, non cupidatat
										skateboard dolor brunch. Food truck quinoa nesciunt laborum
										eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on
										it squid single-origin coffee nulla assumenda shoreditch et.
										Nihil anim keffiyeh helvetica, craft beer labore wes anderson
										cred nesciunt sapiente ea proident. Ad vegan excepteur butcher
										vice lomo. Leggings occaecat craft beer farm-to-table, raw
										denim aesthetic synth nesciunt you probably haven't heard of
										them accusamus labore sustainable VHS.</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>

			<div class="col-md-6 col-sm-6 col-xs-12"></div>
		</div>

		<div class="clearfix"></div>

		<div class="row">

			<div class="col-md-6 col-sm-6 col-xs-12">
				<div class="x_panel">
					<div class="x_title">
						<h2>tooltip<small>Sessions</small></h2>
						<ul class="nav navbar-right panel-toolbox ">
							<li><a class="collapse-link"><i class="fa fa-chevron-up"></i>
							</a></li>
							<li><a href="#" class="dropdown-toggle"
								data-toggle="dropdown"><i class="fa fa-wrench"></i> </a>
								<ul class="dropdown-menu">
									<li><a href="#">设置 1</a></li>
									<li><a href="#">设置 2</a></li>
								</ul>
							</li>
							<li><a class="close-link"><i class="fa fa-close"></i> </a></li>
						</ul>
						<div class="clearfix"></div>
					</div>
					<div class="x_content">
						<button type="button" class="btn btn-default" data-toggle="tooltip" data-placement="left" title="Tooltip on left">Tooltip left</button>
						<button type="button" class="btn btn-default" data-toggle="tooltip" data-placement="top" title="Tooltip on top">Tooltip top</button>
						<button type="button" class="btn btn-default" data-toggle="tooltip" data-placement="bottom" title="Tooltip on bottom">Tooltip bottom</button>
						<button type="button" class="btn btn-default" data-toggle="tooltip" data-placement="right" title="Tooltip on right">Tooltip right</button>	
						<div><strong>tooltip测试 没有成功</strong></div>					
					</div>
				</div>
			</div>
		</div>
		
		<div class="clearfix"></div>
		<!-- 用户每日活跃度 -->
		<div class="row">
			<div class="col-md-6 col-sm-6 col-xs-6">
				<div class="x_panel">
					<div class="x_title">
						<h2>小控件<small>Sessions</small></h2>
						<ul class="nav navbar-right panel-toolbox ">
							<li><a class="collapse-link"><i class="fa fa-chevron-up"></i>
							</a></li>
							<li><a href="#" class="dropdown-toggle"
								data-toggle="dropdown"><i class="fa fa-wrench"></i> </a>
								<ul class="dropdown-menu">
									<li><a href="#">设置 1</a></li>
									<li><a href="#">设置 2</a></li>
								</ul>
							</li>
							<li><a class="close-link"><i class="fa fa-close"></i> </a></li>
						</ul>
						<div class="clearfix"></div>
					</div>
					<div class="x_content">
						<div class="dashboard-widget-content">
		                    <ul class="list-unstyled timeline widget">
		                      <li>
		                        <div class="block">
		                          <div class="block_content">
		                            <h2 class="title">
                                         <a>Who Needs Sundance When You’ve Got&nbsp;Crowdfunding?</a>
                                     </h2>
		                            <div class="byline">
		                              <span>13 hours ago</span> by <a>Jane Smith</a>
		                            </div>
		                            <p class="excerpt">Film festivals used to be do-or-die moments for movie makers. They were where you met the producers that could fund your project, and if the buyers liked your flick, they’d pay to Fast-forward and… <a>Read&nbsp;More</a>
		                            </p>
		                          </div>
		                        </div>
		                      </li>
		                      <li>
		                        <div class="block">
		                          <div class="block_content">
		                            <h2 class="title">
		                                <a>Who Needs Sundance When You’ve Got&nbsp;Crowdfunding?</a>
		                            </h2>
		                            <div class="byline">
		                              <span>13 hours ago</span> by <a>Jane Smith</a>
		                            </div>
		                            <p class="excerpt">Film festivals used to be do-or-die moments for movie makers. They were where you met the producers that could fund your project, and if the buyers liked your flick, they’d pay to Fast-forward and… <a>Read&nbsp;More</a>
		                            </p>
		                          </div>
		                        </div>
		                      </li>
		                      <li>
		                        <div class="block">
		                          <div class="block_content">
		                            <h2 class="title">
		                                <a>Who Needs Sundance When You’ve Got&nbsp;Crowdfunding?</a>
		                            </h2>
		                            <div class="byline">
		                              <span>13 hours ago</span> by <a>Jane Smith</a>
		                            </div>
		                            <p class="excerpt">Film festivals used to be do-or-die moments for movie makers. They were where you met the producers that could fund your project, and if the buyers liked your flick, they’d pay to Fast-forward and… <a>Read&nbsp;More</a>
		                            </p>
		                          </div>
		                        </div>
		                      </li>
		                      <li>
		                        <div class="block">
		                          <div class="block_content">
		                            <h2 class="title">
                                        <a>Who Needs Sundance When You’ve Got&nbsp;Crowdfunding?</a>
                                    </h2>
		                            <div class="byline">
		                              <span>13 hours ago</span> by <a>Jane Smith</a>
		                            </div>
		                            <p class="excerpt">Film festivals used to be do-or-die moments for movie makers. They were where you met the producers that could fund your project, and if the buyers liked your flick, they’d pay to Fast-forward and… <a>Read&nbsp;More</a>
		                            </p>
		                          </div>
		                        </div>
		                      </li>
		                  </ul>
	                  </div>
					</div>
				</div>
			</div>
			<div class="col-md-6 col-sm-6 col-xs-6">
				<div class="row">
					<div class="col-md-12 col-sm-12 col-xs-12">
						<div class="x_panel">
							<div class="x_title">
								<h2>
									小控件<small>Sessions</small>
								</h2>
								<ul class="nav navbar-right panel-toolbox ">
									<li><a class="collapse-link"><i
											class="fa fa-chevron-up"></i> </a>
									</li>
									<li><a href="#" class="dropdown-toggle"
										data-toggle="dropdown"><i class="fa fa-wrench"></i> </a>
										<ul class="dropdown-menu">
											<li><a href="#">设置 1</a>
											</li>
											<li><a href="#">设置 2</a>
											</li>
										</ul></li>
									<li><a class="close-link"><i class="fa fa-close"></i>
									</a>
									</li>
								</ul>
								<div class="clearfix"></div>
							</div>
							<div class="x_content">
								<div class="bs-example" data-example-id="simple-jumbotron">
									<div class="jumbotron">
										<h1>Hello, world!</h1>
										<p>This is a simple hero unit, a simple jumbotron-style
											component for calling extra attention to featured content or
											information.</p>
										<p>
											<a class="btn btn-primary btn-lg" href="#" role="button">Learn
												more</a>
										</p>
									</div>
								</div>
							</div>
						</div>
					</div>

					<div class="col-md-12 col-sm-12 col-xs-12">
						<div class="x_panel">
							<div class="x_title">
								<h2>
									小控件<small>Sessions</small>
								</h2>
								<ul class="nav navbar-right panel-toolbox ">
									<li><a class="collapse-link"><i
											class="fa fa-chevron-up"></i> </a>
									</li>
									<li><a href="#" class="dropdown-toggle"
										data-toggle="dropdown"><i class="fa fa-wrench"></i> </a>
										<ul class="dropdown-menu">
											<li><a href="#">设置 1</a>
											</li>
											<li><a href="#">设置 2</a>
											</li>
										</ul></li>
									<li><a class="close-link"><i class="fa fa-close"></i>
									</a>
									</li>
								</ul>
								<div class="clearfix"></div>
							</div>
							<div class="x_content">
								<!-- Split button -->
								<div class="btn-group">
								  <button type="button" class="btn btn-primary">primary</button>
								  <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
								    <span class="caret"></span>
								    <span class="sr-only">Toggle Dropdown</span>
								  </button>
								  <ul class="dropdown-menu">
								    <li><a href="#">Action</a></li>
								    <li><a href="#">Another action</a></li>
								    <li><a href="#">Something else here</a></li>
								    <li role="separator" class="divider"></li>
								    <li><a href="#">Separated link</a></li>
								  </ul>
								</div>
								
								<!-- Split button -->
								<div class="btn-group">
								  <button type="button" class="btn btn-default">default</button>
								  <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
								    <span class="caret"></span>
								    <span class="sr-only">Toggle Dropdown</span>
								  </button>
								  <ul class="dropdown-menu">
								    <li><a href="#">Action</a></li>
								    <li><a href="#">Another action</a></li>
								    <li><a href="#">Something else here</a></li>
								    <li role="separator" class="divider"></li>
								    <li><a href="#">Separated link</a></li>
								  </ul>
								</div>
								
								<!-- Split button -->
								<div class="btn-group">
								  <button type="button" class="btn btn-success">success</button>
								  <button type="button" class="btn btn-success dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
								    <span class="caret"></span>
								    <span class="sr-only">Toggle Dropdown</span>
								  </button>
								  <ul class="dropdown-menu">
								    <li><a href="#">Action</a></li>
								    <li><a href="#">Another action</a></li>
								    <li><a href="#">Something else here</a></li>
								    <li role="separator" class="divider"></li>
								    <li><a href="#">Separated link</a></li>
								  </ul>
								</div>
								
								<!-- Split button -->
								<div class="btn-group">
								  <button type="button" class="btn btn-info">info</button>
								  <button type="button" class="btn btn-info dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
								    <span class="caret"></span>
								    <span class="sr-only">Toggle Dropdown</span>
								  </button>
								  <ul class="dropdown-menu">
								    <li><a href="#">Action</a></li>
								    <li><a href="#">Another action</a></li>
								    <li><a href="#">Something else here</a></li>
								    <li role="separator" class="divider"></li>
								    <li><a href="#">Separated link</a></li>
								  </ul>
								</div>
								
								<!-- Split button -->
								<div class="btn-group">
								  <button type="button" class="btn btn-warning">warning</button>
								  <button type="button" class="btn btn-warning dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
								    <span class="caret"></span>
								    <span class="sr-only">Toggle Dropdown</span>
								  </button>
								  <ul class="dropdown-menu">
								    <li><a href="#">Action</a></li>
								    <li><a href="#">Another action</a></li>
								    <li><a href="#">Something else here</a></li>
								    <li role="separator" class="divider"></li>
								    <li><a href="#">Separated link</a></li>
								  </ul>
								</div>
								
								<!-- Split button -->
								<div class="btn-group">
								  <button type="button" class="btn btn-danger">danger</button>
								  <button type="button" class="btn btn-danger dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
								    <span class="caret"></span>
								    <span class="sr-only">Toggle Dropdown</span>
								  </button>
								  <ul class="dropdown-menu">
								    <li><a href="#">Action</a></li>
								    <li><a href="#">Another action</a></li>
								    <li><a href="#">Something else here</a></li>
								    <li role="separator" class="divider"></li>
								    <li><a href="#">Separated link</a></li>
								  </ul>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		
		<div class="clearfix"></div>
		<!-- 消息提示 -->
		<div class="row">
			<div class="col-md-6 col-sm-6 col-xs-12">
				<div class="x_panel">
					<div class="x_title">
						<h2>弹出对话框并进行遮盖<small>Sessions</small></h2>
						<ul class="nav navbar-right panel-toolbox ">
							<li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a></li>
							<li><a href="#" class="dropdown-toggle"
								data-toggle="dropdown"><i class="fa fa-wrench"></i> </a>
								<ul class="dropdown-menu">
									<li><a href="#">设置 1</a></li>
									<li><a href="#">设置 2</a></li>
								</ul>
							</li>
							<li><a class="close-link"><i class="fa fa-close"></i> </a></li>
						</ul>
						<div class="clearfix"></div>
					</div>
					<div class="x_content">
						<!-- Large modal -->
						<button type="button" class="btn btn-primary" data-toggle="modal" data-target=".bs-example-modal-lg">Large modal</button>
						
						<div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
						  <div class="modal-dialog modal-lg" role="document">
						    <div class="modal-content">
							    <div class="modal-header">
		                          <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span>
		                          </button>
		                          <h4 class="modal-title" id="myModalLabel">对话框名称</h4>
		                        </div>
		                        <div class="modal-body">
		                          <h4>文本内容</h4>
		                          <p>Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor.</p>
		                          <p>Aenean lacinia bibendum nulla sed consectetur. Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Donec sed odio dui. Donec ullamcorper nulla non metus auctor fringilla.</p>
		                        </div>
		                        <div class="modal-footer">
		                          <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
		                          <button type="button" class="btn btn-primary">保存</button>
		                        </div>
						    </div>
						  </div>
						</div>
						
						<!-- Small modal -->
						<button type="button" class="btn btn-primary" data-toggle="modal" data-target=".bs-example-modal-sm">Small modal</button>
						
						<div class="modal fade bs-example-modal-sm" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
						  <div class="modal-dialog modal-sm" role="document">
						    <div class="modal-content">
						      <div class="modal-header">
		                          <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span>
		                          </button>
		                          <h4 class="modal-title" id="myModalLabel2">Modal title</h4>
		                       </div>
		                       <div class="modal-body">
		                          <h4>Text in a modal</h4>
		                          <p>Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor.</p>
		                          <p>Aenean lacinia bibendum nulla sed consectetur. Praesent commodo cursus magna, vel scelerisque nisl consectetur et. Donec sed odio dui. Donec ullamcorper nulla non metus auctor fringilla.</p>
		                       </div>
		                       <div class="modal-footer">
		                          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
		                          <button type="button" class="btn btn-primary">Save changes</button>
		                       </div>
						    </div>
						  </div>
						</div>
					</div>
				</div>
			</div>
			
			<div class="col-md-6 col-sm-6 col-xs-12">
				<div class="x_panel">
					<div class="x_title">
						<h2><i class="fa fa-bell"></i> Notifications <small>Styled & Custom notifications</small></h2>
						<ul class="nav navbar-right panel-toolbox ">
							<li><a class="collapse-link"><i class="fa fa-chevron-up"></i>
							</a></li>
							<li><a href="#" class="dropdown-toggle"
								data-toggle="dropdown"><i class="fa fa-wrench"></i> </a>
								<ul class="dropdown-menu">
									<li><a href="#">设置 1</a></li>
									<li><a href="#">设置 2</a></li>
								</ul>
							</li>
							<li><a class="close-link"><i class="fa fa-close"></i> </a></li>
						</ul>
						<div class="clearfix"></div>
					</div>
					<div class="x_content">
					
						<p>Regular notifications</p>
						<button class="btn btn-default source" onclick="new PNotify({
						                title: 'Regular Success',
						                text: 'That thing that you were trying to do worked!',
						                type: 'success',
						                styling: 'bootstrap3'
						            });">Success</button>
						
						<button class="btn btn-default source" onclick="new PNotify({
						                title: 'New Thing',
						                text: 'Just to let you know, something happened.',
						                type: 'info',
						                styling: 'bootstrap3'
						            });">Info</button>
						
						<button class="btn btn-default source" onclick="new PNotify({
						                title: 'Regular Notice',
						                text: 'Check me out! I\'m a notice.',
						                styling: 'bootstrap3'
						            });">Notice</button>
						
						<button class="btn btn-default source" onclick="new PNotify({
						                title: 'Oh No!',
						                text: 'Something terrible happened.',
						                type: 'error',
						                styling: 'bootstrap3'
						            });">Error</button>
						
						<button class="btn btn-default source" onclick="new PNotify({
						                title: 'Oh No!',
						                text: 'Something terrible happened.',
						                type: 'info',
						                styling: 'bootstrap3',
						                addclass: 'dark'
						            });">Dark</button>
						
						<hr />
						
						<p>Sticky notifications.. these wont close unless user closes them.</p>
						<button class="btn btn-default source" onclick="new PNotify({
						                title: 'Sticky Success',
						                text: 'Sticky success... I\'m not even gonna make a joke.',
						                type: 'success',
						                hide: false,
						                styling: 'bootstrap3'
						            });">Success</button>
						
						
						<button class="btn btn-default source" onclick="new PNotify({
						                title: 'Sticky Info',
						                text: 'Sticky Info... I\'m not even gonna make a joke.',
						                type: 'info',
						                hide: false,
						                styling: 'bootstrap3'
						            });">Info</button>
						
						
						<button class="btn btn-default source" onclick="new PNotify({
						                title: 'Sticky Warning',
						                text: 'Sticky Warning... I\'m not even gonna make a joke.',
						                hide: false,
						                styling: 'bootstrap3'
						            });">Warning</button>
						
						
						<button class="btn btn-default source" onclick="new PNotify({
						                title: 'Sticky Danger',
						                text: 'Sticky Danger... I\'m not even gonna make a joke.',
						                type: 'error',
						                hide: false,
						                styling: 'bootstrap3'
						            });">Error</button>
						
						
						<button class="btn btn-default source" onclick="new PNotify({
						                title: 'Sticky Success',
						                text: 'Sticky success... I\'m not even gonna make a joke.',
						                type: 'info',
						                hide: false,
						                styling: 'bootstrap3',
						                addclass: 'dark'
						            });">Dark</button>
						
						<hr/>
						
						<button class="btn btn-default source" onclick="new PNotify({
						                title: 'Non-Blocking Notice',
						                type: 'info',
						                text: 'When you hover over me I\'ll fade to show the elements underneath. Feel free to click any of them just like I wasn\'t even here.',
						                nonblock: {
						                    nonblock: true
						                },
						                styling: 'bootstrap3',
						                addclass: 'dark'
						            });">Non-Blocking Notice</button>
						
						<hr />
						
						<div id="antoox">
						  <div>
						    <div></div>
						    <div></div>
						    <div></div>
						  </div>
						
						</div>
						
						<button class="btn btn-default source" onclick="new TabbedNotification({
						                title: 'Tabbed Notificat',
						                text: 'Sticky success... Raw denim you probably haven\'t heard of them jean shorts Austin. Nesciunt tofu stumptown aliqua, retro synth master cleanse. Mustache cliche tempor, williamsburg carles vegan helvetica. ',
						                type: 'success',
						                sound: false
						            })">Success</button>
						
						<button class="btn btn-default source" onclick="new TabbedNotification({
						                title: 'Tabbed Notificat',
						                text: 'Custom Info... Raw denim you probably haven\'t heard of them jean shorts Austin. Nesciunt tofu stumptown aliqua, retro synth master cleanse. Mustache cliche tempor, williamsburg carles vegan helvetica.',
						                type: 'info',
						                sound: false
						            })">Info</button>
						
						<button class="btn btn-default source" onclick="new TabbedNotification({
						                title: 'Tabbed Notificat',
						                text: 'Custom Warning... Raw denim you probably haven\'t heard of them jean shorts Austin. Nesciunt tofu stumptown aliqua, retro synth master cleanse. Mustache cliche tempor, williamsburg carles vegan helvetica. ',
						                type: 'warning',
						                sound: false
						            })">Warning</button>
						
						<button class="btn btn-default source" onclick="new TabbedNotification({
						                title: 'Custom Notification error',
						                text: 'Custom Error... Raw denim you probably haven\'t heard of them jean shorts Austin. Nesciunt tofu stumptown aliqua, retro synth master cleanse. Mustache cliche tempor, williamsburg carles vegan helvetica. ',
						                type: 'error',
						                sound: false
						            })">Error</button>
						
						<button class="btn btn-default source" onclick="new TabbedNotification({
						                title: 'Tabbed notification dark',
						                text: 'Custom Dark... Raw denim you probably haven\'t heard of them jean shorts Austin. Nesciunt tofu stumptown aliqua, retro synth master cleanse. Mustache cliche tempor, williamsburg carles vegan helvetica. ',
						                type: 'dark',
						                sound: false
						            })">Dark</button>

					</div>
				</div>
			</div>
		</div>
		
		<div class="clearfix"></div>
		
		<div class="row">
			<div class="col-md-6 col-sm-6 col-xs-12">
				<div class="x_panel">
					<div class="x_title">
						<h2>
							Pop Overs<small>Sessions</small>
						</h2>
						<ul class="nav navbar-right panel-toolbox ">
							<li><a class="collapse-link"><i class="fa fa-chevron-up"></i>
							</a></li>
							<li><a href="#" class="dropdown-toggle"
								data-toggle="dropdown"><i class="fa fa-wrench"></i> </a>
								<ul class="dropdown-menu">
									<li><a href="#">设置 1</a></li>
									<li><a href="#">设置 2</a></li>
								</ul>
							</li>
							<li><a class="close-link"><i class="fa fa-close"></i> </a></li>
						</ul>
						<div class="clearfix"></div>
					</div>
					<div class="x_content">
						<div class="alert alert-success" role="alert">
							<a href="#" class="alert-link">
								<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">×</span>
								</button>
								<strong>Holy guacamole!</strong> Best check yo self, you're not looking too good.
							</a>
						</div>
						<div class="alert alert-info" role="alert">
							<a href="#" class="alert-link">
								<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">×</span>
								</button>
								<strong>Holy guacamole!</strong> Best check yo self, you're not looking too good.
							</a>
						</div>
						<div class="alert alert-warning" role="alert">
							<a href="#" class="alert-link">
								<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">×</span>
								</button>
								<strong>Holy guacamole!</strong> Best check yo self, you're not looking too good.
							</a>
						</div>
						<div class="alert alert-danger" role="alert">
							<a href="#" class="alert-link">
								<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">×</span>
								</button>
								<strong>Holy guacamole!</strong> Best check yo self, you're not looking too good.
							</a>
						</div>
					</div>
				</div>
			</div>
			
			<div class="col-md-6 col-sm-6 col-xs-12">
				<div class="x_panel">
					<div class="x_title">
						<h2><i class="fa fa-align-left"></i> Progress bar<small>Sessions</small></h2>
						<ul class="nav navbar-right panel-toolbox ">
							<li><a class="collapse-link"><i class="fa fa-chevron-up"></i>
							</a></li>
							<li><a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-wrench"></i></a>
								<ul class="dropdown-menu">
									<li><a href="#">设置 1</a></li>
									<li><a href="#">设置 2</a></li>
								</ul>
							</li>
							<li><a class="close-link"><i class="fa fa-close"></i> </a></li>
						</ul>
						<div class="clearfix"></div>
					</div>
					<div class="x_content">
						<p>Bootstrap progress bar with animated loading bar, add right to .progress to align right</p>
						<div class="row">
						  <div class="col-md-6">
						    <div class="progress right">
								<div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100" style="width: 20%">
								    <span class="sr-only">20% Complete (success)</span>
								</div>
							</div>
							<div class="progress right">
							  <div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
							    <span class="sr-only">40% Complete</span>
							  </div>
							</div>
							<div class="progress right">
							  <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%">
							    <span class="sr-only">60% Complete (warning)</span>
							  </div>
							</div>
							<div class="progress right">
							  <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%">
							    <span class="sr-only">80% Complete (danger)</span>
							  </div>
							</div>
						  </div>
						  <div class="col-md-6">
						  	<div class="progress">
								<div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100" style="width: 20%">
								    <span class="sr-only">20% Complete (success)</span>
								</div>
							</div>
							<div class="progress">
							  <div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
							    <span class="sr-only">40% Complete</span>
							  </div>
							</div>
							<div class="progress">
							  <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%">
							    <span class="sr-only">60% Complete (warning)</span>
							  </div>
							</div>
							<div class="progress">
							  <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%">
							    <span class="sr-only">80% Complete (danger)</span>
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
			<div class="col-md-6 col-sm-6 col-xs-12">
				<div class="x_panel">
					<div class="x_title">
						<h2><i class="fa fa-bars"></i> to_do list <small>list</small></h2>
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
						<ul class="to_do">
                          <li>
                            <p>
                              <input type="checkbox" class="flat"> Schedule meeting with new client </p>
                          </li>
                          <li>
                            <p>
                              <input type="checkbox" class="flat"> Create email address for new intern</p>
                          </li>
                          <li>
                            <p>
                              <input type="checkbox" class="flat"> Have IT fix the network printer</p>
                          </li>
                          <li>
                            <p>
                              <input type="checkbox" class="flat"> Copy backups to offsite location</p>
                          </li>
                          <li>
                            <p>
                              <input type="checkbox" class="flat"> Food truck fixie locavors mcsweeney</p>
                          </li>
                          <li>
                            <p>
                              <input type="checkbox" class="flat"> Food truck fixie locavors mcsweeney</p>
                          </li>
                          <li>
                            <p>
                              <input type="checkbox" class="flat"> Create email address for new intern</p>
                          </li>
                          <li>
                            <p>
                              <input type="checkbox" class="flat"> Have IT fix the network printer</p>
                          </li>
                          <li>
                            <p>
                              <input type="checkbox" class="flat"> Copy backups to offsite location</p>
                          </li>
                        </ul>
					</div>
				</div>
			</div>
			
			<div class="col-md-6 col-sm-6 col-xs-12">
				<div class="x_panel">
					<div class="x_title">
						<h2><i class="fa fa-bars"></i> Tabs <small>Float left</small></h2>
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
						<ul class="list-unstyled msg_list">
						  <li>
						    <a>
						      <span class="image">
						        <img src="../images/img.jpg" alt="img" />
						      </span>
						      <span>
						        <span>John Smith</span>
						        <span class="time">3 mins ago</span>
						      </span>
						      <span class="message">
						        Film festivals used to be do-or-die moments for movie makers. They were where you met the producers that
						      </span>
						    </a>
						  </li>
						  <li>
						    <a>
						      <span class="image">
						        <img src="../images/img.jpg" alt="img" />
						      </span>
						      <span>
						        <span>John Smith</span>
						        <span class="time">3 mins ago</span>
						      </span>
						      <span class="message">
						        Film festivals used to be do-or-die moments for movie makers. They were where you met the producers that
						      </span>
						    </a>
						  </li>
						  <li>
						    <a>
						      <span class="image">
						        <img src="../images/img.jpg" alt="img" />
						      </span>
						      <span>
						        <span>John Smith</span>
						        <span class="time">3 mins ago</span>
						      </span>
						      <span class="message">
						        Film festivals used to be do-or-die moments for movie makers. They were where you met the producers that
						      </span>
						    </a>
						  </li>
						  <li>
						    <a>
						      <span class="image">
						        <img src="../images/img.jpg" alt="img" />
						      </span>
						      <span>
						        <span>John Smith</span>
						        <span class="time">3 mins ago</span>
						      </span>
						      <span class="message">
						        Film festivals used to be do-or-die moments for movie makers. They were where you met the producers that
						      </span>
						    </a>
						  </li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
