<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/21
  Time: 8:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <jsp:include page="../../inc.jsp"></jsp:include>
    <jsp:include page="../../inccss.jsp"></jsp:include>
    <jsp:include page="../../incjs.jsp"></jsp:include>
    <style type="text/css">
        .demo-placeholder {
            height: 280px
        }
    </style>
    <title>电力记录</title>
    <script type="text/javascript">
        //init_flot_chart

        var randNum = function() {
            return (Math.floor(Math.random() * (1 + 40 - 20))) + 20;
        };
        function gd(year, month, day) {
            return new Date(year, month - 1, day).getTime();
        }

        function init_flot_chart(){

            if( typeof ($.plot) === 'undefined'){ return; }
            console.log('init_flot_chart');

            var arr_data1 = [
                [gd(2017, 1, 1), 17],
                [gd(2017, 1, 2), 74],
                [gd(2017, 1, 3), 6],
                [gd(2017, 1, 4), 39],
                [gd(2017, 1, 5), 20],
                [gd(2017, 1, 6), 85],
                [gd(2017, 1, 7), 7],
                [gd(2017, 1, 8), 19],
                [gd(2017, 1, 9), 25]
            ];

            var arr_data2 = [
                [gd(2017, 1, 1), 82],
                [gd(2017, 1, 2), 23],
                [gd(2017, 1, 3), 66],
                [gd(2017, 1, 4), 9],
                [gd(2017, 1, 5), 119],
                [gd(2017, 1, 6), 6],
                [gd(2017, 1, 7), 9],
                [gd(2017, 1, 8), 12],
                [gd(2017, 1, 9), 30]
            ];

            var chart_plot_01_settings = {
                series: {
                    lines: {
                        show: false,
                        fill: true
                    },
                    splines: {
                        show: true,
                        tension: 0.4,
                        lineWidth: 1,
                        fill: 0.4
                    },
                    points: {
                        radius: 0,
                        show: true
                    },
                    shadowSize: 2
                },
                grid: {
                    verticalLines: true,
                    hoverable: true,
                    clickable: true,
                    tickColor: "#d5d5d5",
                    borderWidth: 1,
                    color: '#fff'
                },
                colors: ["rgba(38, 185, 154, 0.38)", "rgba(3, 88, 106, 0.38)"],
                xaxis: {
                    tickColor: "rgba(51, 51, 51, 0.06)",
                    mode: "time",
                    tickSize: [1, "day"],
                    //tickLength: 10,
                    axisLabel: "Date",
                    axisLabelUseCanvas: true,
                    axisLabelFontSizePixels: 12,
                    axisLabelFontFamily: 'Verdana, Arial',
                    axisLabelPadding: 10,
                    color:"rgba(169, 68, 66, 0.8)",
                },
                legend: {
                    color:"rgba(169, 68, 66, 0.8)",
                    backgroundColor:"rgba(230, 230, 230, 0.8)"
                },
                yaxis: {
                    ticks: 8,
                    tickColor: "rgba(51, 51, 51, 0.06)",
                },
                tooltip: true
            }

            if ($("#chart_plot_01").length){
                console.log('Plot1');

//                $.plot( $("#chart_plot_01"), [ arr_data1, arr_data2 ],  chart_plot_01_settings );
                $.plot( $("#chart_plot_01"), [ {data:arr_data1,label:"本月"}, {data:arr_data2,label:"上月"} ],
                    chart_plot_01_settings );
            }


//            https://github.com/flot/flot/blob/master/API.md

        }
    </script>

    <script>
        $(function () {
            init_flot_chart();

            $("<div id='tooltip'></div>").css({
                position: "absolute",
                display: "none",
                border: "1px solid #fdd",
                padding: "2px",
                "background-color": "#fee",
                opacity: 0.80
            }).appendTo("body");

            $("#chart_plot_01").bind("plothover", function (event, pos, item) {
                if ($("#enablePosition:checked").length > 0) {
                    //将字符串转换成数字
                    var str = "(" +  new Date(pos.x.toFixed(2)*1).format() + ", " + pos.y.toFixed(2) + ")";
                    $("#hoverdata").text(str);
                }

                if ($("#enableTooltip:checked").length > 0) {
                    if (item) {
                        var x = item.datapoint[0].toFixed(2),
                            y = item.datapoint[1].toFixed(2);

                        $("#tooltip").html(item.series.label + " " + new Date(x*1).format() + "  " + y)
                            .css({top: item.pageY+5, left: item.pageX+5})
                            .fadeIn(200);
                    } else {
                        $("#tooltip").hide();
                    }
                }
            });


//            alert(new Date(new Date().getTime()).format());

//            $("#placeholder").bind("plotclick", function (event, pos, item) {
//                if (item) {
//                    $("#clickdata").text(" - click point " + item.dataIndex + " in " + item.series.label);
//                    plot.highlight(item.series, item.datapoint);
//                }
//            });

        });
    </script>
</head>
<body>
    <div id="main-col" class="container-fluid">
        <div class="col-md-12">
            <div id="chart_plot_01" class="demo-placeholder"></div>
        </div>
        <p>
            <label><input id="enablePosition" type="checkbox" checked="checked">显示鼠标所在位置</label>
            <span id="hoverdata">(时间, 用电量)</span>
            <%--<span id="clickdata"> - click point 0 in cos(x)</span>--%>
        </p>
        <p><label><input id="enableTooltip" type="checkbox" checked="checked">是否提示数值</label></p>
    </div>
</body>
</html>
