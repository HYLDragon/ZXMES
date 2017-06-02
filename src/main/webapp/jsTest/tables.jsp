<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
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
			
		});
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
		
		$(function(){
			// Table
			$('table input').on('ifChecked', function () {
			    checkState = '';
			    $(this).parent().parent().parent().addClass('selected');
			    countChecked();
			});
			$('table input').on('ifUnchecked', function () {
			    checkState = '';
			    $(this).parent().parent().parent().removeClass('selected');
			    countChecked();
			});
			
			var checkState = '';
			
			$('.bulk_action input').on('ifChecked', function () {
			    checkState = '';
			    $(this).parent().parent().parent().addClass('selected');
			    countChecked();
			});
			$('.bulk_action input').on('ifUnchecked', function () {
			    checkState = '';
			    $(this).parent().parent().parent().removeClass('selected');
			    countChecked();
			});
			$('.bulk_action input#check-all').on('ifChecked', function () {
			    checkState = 'all';
			    countChecked();
			});
			$('.bulk_action input#check-all').on('ifUnchecked', function () {
			    checkState = 'none';
			    countChecked();
			});
			
			function countChecked() {
			    if (checkState === 'all') {
			        $(".bulk_action input[name='table_records']").iCheck('check');
			    }
			    if (checkState === 'none') {
			        $(".bulk_action input[name='table_records']").iCheck('uncheck');
			    }
			
			    var checkCount = $(".bulk_action input[name='table_records']:checked").length;
			
			    if (checkCount) {
			        $('.column-title').hide();
			        $('.bulk-actions').show();
			        $('.action-cnt').html(checkCount + ' Records Selected');
			    } else {
			        $('.column-title').show();
			        $('.bulk-actions').hide();
			    }
			}
		});
		
		
	</script>
  </head>
  
  <body>
	<div id="main-col" class="container-fluid">
		<!-- page_title -->
		<div class="row">
			<div class="col-md-12 col-sm-12 col-xs-12 page-title">
				<!-- 整个页面的标题 -->
				<div class="col-md-6 col-sm-6 col-xs-12 title-left">
					<!-- 左标题位置布局 -->
					<h3>表格挂件</h3>
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
		<!-- 基本表四种展示 -->
		<div class="row">
			<div class="col-md-6 col-sm-6 col-xs-12">
				<div class="x_panel">
					<div class="x_title">
						<h2><i class="fa fa-bars"></i> Basic Tables <small>basic table subtitle</small></h2>
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
			
			<div class="col-md-6 col-sm-6 col-xs-12">
				<div class="x_panel">
					<div class="x_title">
						<h2><i class="fa fa-bars"></i> Stripped table <small>条纹状表格</small></h2>
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
						<table class="table table-striped">
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
		</div>
		
		<div class="clearfix"></div>
		<!-- 基本表四种展示 -->
		<div class="row">
			<div class="col-md-6 col-sm-6 col-xs-12">
				<div class="x_panel">
					<div class="x_title">
						<h2><i class="fa fa-bars"></i> Hover rows <small>鼠标悬停</small></h2>
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
						<table class="table table-striped table-hover">
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
			
			<div class="col-md-6 col-sm-6 col-xs-12">
				<div class="x_panel">
					<div class="x_title">
						<h2><i class="fa fa-bars"></i> Boardered table <small>带边框的表格</small></h2>
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
						<table class="table table-striped table-hover table-bordered">
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
		</div>
		
		<div class="clearfix"></div>
		<!-- 稍微综合 -->
		<div class="row">
			<div class="col-md-12 col-sm-12 col-xs-12">
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
						<p>Add class <code>bulk_action</code> to table for bulk actions options on row select</p>
						<div class="table-responsive">
						  <table class="table table-striped jambo_table bulk_action">
						    <thead>
						      <tr class="headings">
						        <th>
						          <input type="checkbox" id="check-all" class="flat">
						        </th>
						        <th class="column-title">Invoice </th>
						        <th class="column-title">Invoice Date </th>
						        <th class="column-title">Order </th>
						        <th class="column-title">Bill to Name </th>
						        <th class="column-title">Status </th>
						        <th class="column-title">Amount </th>
						        <th class="column-title no-link last"><span class="nobr">Action</span>
						        </th>
						        <th class="bulk-actions" colspan="7">
						          <a class="antoo" style="color:#fff; font-weight:500;">Bulk Actions ( <span class="action-cnt"> </span> ) <i class="fa fa-chevron-down"></i></a>
						        </th>
						      </tr>
						    </thead>
						
						    <tbody>
						      <tr class="even pointer">
						        <td class="a-center ">
						          <input type="checkbox" class="flat" name="table_records">
						        </td>
						        <td class=" ">121000040</td>
						        <td class=" ">May 23, 2014 11:47:56 PM </td>
						        <td class=" ">121000210 <i class="success fa fa-long-arrow-up"></i></td>
						        <td class=" ">John Blank L</td>
						        <td class=" ">Paid</td>
						        <td class="a-right">$7.45</td>
						        <td class=" last"><a href="#">View</a>
						        </td>
						      </tr>
						      <tr class="odd pointer">
						        <td class="a-center ">
						          <input type="checkbox" class="flat" name="table_records">
						        </td>
						        <td class=" ">121000039</td>
						        <td class=" ">May 23, 2014 11:30:12 PM</td>
						        <td class=" ">121000208 <i class="success fa fa-long-arrow-up"></i>
						        </td>
						        <td class=" ">John Blank L</td>
						        <td class=" ">Paid</td>
						        <td class="a-right a-right ">$741.20</td>
						        <td class=" last"><a href="#">View</a>
						        </td>
						      </tr>
						      <tr class="even pointer">
						        <td class="a-center ">
						          <input type="checkbox" class="flat" name="table_records">
						        </td>
						        <td class=" ">121000038</td>
						        <td class=" ">May 24, 2014 10:55:33 PM</td>
						        <td class=" ">121000203 <i class="success fa fa-long-arrow-up"></i>
						        </td>
						        <td class=" ">Mike Smith</td>
						        <td class=" ">Paid</td>
						        <td class="a-right a-right ">$432.26</td>
						        <td class=" last"><a href="#">View</a>
						        </td>
						      </tr>
						      <tr class="odd pointer">
						        <td class="a-center ">
						          <input type="checkbox" class="flat" name="table_records">
						        </td>
						        <td class=" ">121000037</td>
						        <td class=" ">May 24, 2014 10:52:44 PM</td>
						        <td class=" ">121000204</td>
						        <td class=" ">Mike Smith</td>
						        <td class=" ">Paid</td>
						        <td class="a-right a-right ">$333.21</td>
						        <td class=" last"><a href="#">View</a>
						        </td>
						      </tr>
						      <tr class="even pointer">
						        <td class="a-center ">
						          <input type="checkbox" class="flat" name="table_records">
						        </td>
						        <td class=" ">121000040</td>
						        <td class=" ">May 24, 2014 11:47:56 PM </td>
						        <td class=" ">121000210</td>
						        <td class=" ">John Blank L</td>
						        <td class=" ">Paid</td>
						        <td class="a-right a-right ">$7.45</td>
						        <td class=" last"><a href="#">View</a>
						        </td>
						      </tr>
						      <tr class="odd pointer">
						        <td class="a-center ">
						          <input type="checkbox" class="flat" name="table_records">
						        </td>
						        <td class=" ">121000039</td>
						        <td class=" ">May 26, 2014 11:30:12 PM</td>
						        <td class=" ">121000208 <i class="error fa fa-long-arrow-down"></i>
						        </td>
						        <td class=" ">John Blank L</td>
						        <td class=" ">Paid</td>
						        <td class="a-right a-right ">$741.20</td>
						        <td class=" last"><a href="#">View</a>
						        </td>
						      </tr>
						      <tr class="even pointer">
						        <td class="a-center ">
						          <input type="checkbox" class="flat" name="table_records">
						        </td>
						        <td class=" ">121000038</td>
						        <td class=" ">May 26, 2014 10:55:33 PM</td>
						        <td class=" ">121000203</td>
						        <td class=" ">Mike Smith</td>
						        <td class=" ">Paid</td>
						        <td class="a-right a-right ">$432.26</td>
						        <td class=" last"><a href="#">View</a>
						        </td>
						      </tr>
						      <tr class="odd pointer">
						        <td class="a-center ">
						          <input type="checkbox" class="flat" name="table_records">
						        </td>
						        <td class=" ">121000037</td>
						        <td class=" ">May 26, 2014 10:52:44 PM</td>
						        <td class=" ">121000204</td>
						        <td class=" ">Mike Smith</td>
						        <td class=" ">Paid</td>
						        <td class="a-right a-right ">$333.21</td>
						        <td class=" last"><a href="#">View</a>
						        </td>
						      </tr>
						
						      <tr class="even pointer">
						        <td class="a-center ">
						          <input type="checkbox" class="flat" name="table_records">
						        </td>
						        <td class=" ">121000040</td>
						        <td class=" ">May 27, 2014 11:47:56 PM </td>
						        <td class=" ">121000210</td>
						        <td class=" ">John Blank L</td>
						        <td class=" ">Paid</td>
						        <td class="a-right a-right ">$7.45</td>
						        <td class=" last"><a href="#">View</a>
						        </td>
						      </tr>
						      <tr class="odd pointer">
						        <td class="a-center ">
						          <input type="checkbox" class="flat" name="table_records">
						        </td>
						        <td class=" ">121000039</td>
						        <td class=" ">May 28, 2014 11:30:12 PM</td>
						        <td class=" ">121000208</td>
						        <td class=" ">John Blank L</td>
						        <td class=" ">Paid</td>
						        <td class="a-right a-right ">$741.20</td>
						        <td class=" last"><a href="#">View</a>
						        </td>
						      </tr>
						    </tbody>
						  </table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
  </body>
</html>
