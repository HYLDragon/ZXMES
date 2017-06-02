<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML>
<html>
  <head>
 	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<!-- Meta, title, CSS, favicons, etc. -->
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<jsp:include page="../inc.jsp"></jsp:include>
	<jsp:include page="../inccss.jsp"></jsp:include>
	<link type="text/css" rel="stylesheet" href="../style/tables_dynamic.css"></link>
	<jsp:include page="../incjs.jsp"></jsp:include>
	<script type="text/javascript">
		
		
		$(function(){
			$('#datatable').DataTable({
				"processing": true,
		        "serverSide": true,
				"language": {  
					"url": '${pageContext.request.contextPath}/jslib/dataTable-i18n/Chinese.json',
				},   
		        "ajax": '${pageContext.request.contextPath}/json/dataTable.json',
		        "columns": [
		                    { "data": "first_name" },
		                    { "data": "last_name" },
		                    { "data": "position" },
		                    { "data": "office" },
		                    { "data": "start_date" },
		                    { "data": "salary" }
		                ]
		    });
			
			$('#datatable-checkbox').DataTable({
				"language": {  
					"url": '${pageContext.request.contextPath}/jslib/dataTable-i18n/Chinese.json',
				},   
		        "ajax": '${pageContext.request.contextPath}/json/dataTable.json',

		    });
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
	</script>
  </head>
  
  <body>
	<div id="main-col" class="container-fluid">
		<!-- page-title -->
		<div class="row">
			<div class="col-md-12 col-sm-12 col-xs-12">
				<div class="page-title">
					<div class="col-md-6 col-sm-6 col-xs-6 title-left">
						<h3>用户 <small>的一些案例</small></h3>
					</div>
					<div class="col-md-3 col-sm-3 col-xs-12 titl-right pull-right form-group top-search">
						<div class="input-group">
							<input type="text" class="form-control" placeholder="查找"/>
							<span class="input-group-btn"><button type="button" class="btn btn-default">go</button></span>
						</div>
					</div>
				</div>
			</div>
		</div>
		
		<div class="clearfix"></div>
		
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
						<p class="text-muted">
	                      DataTables has most features enabled by default, so all you need to do to use it with your own tables is to call the construction function: <code>$().DataTable();</code>
	                    </p>
	                    <table id="datatable" class="table table-striped table-bordered">
					        <thead>
					            <tr>
					                <th>First name</th>
					                <th>Last name</th>
					                <th>Position</th>
					                <th>Office</th>
					                <th>Start date</th>
					                <th>Salary</th>
					            </tr>
					        </thead>
					        <tfoot>
					            <tr>
					                <th>First name</th>
					                <th>Last name</th>
					                <th>Position</th>
					                <th>Office</th>
					                <th>Start date</th>
					                <th>Salary</th>
					            </tr>
					        </tfoot>
					    </table>
					</div>
				</div> 
			</div>
		</div>
		
		<div class="clearfix"></div>
		
		
	</div>
  </body>
</html>
