<%--
  Created by IntelliJ IDEA.
  User: sqyc
  Date: 2017/12/27
  Time: 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();//
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=no">
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <!-- 可选的Bootstrap主题文件（一般不使用） -->
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"></script>
    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://static.zhihu.com/static/revved/-/css/m.7c4d48ad.css">
    <link rel="stylesheet" href="<%=basePath%>static/hudui.css">
    <style>
        a{
            text-decoration:none;
        }
    </style>
    <title>互怼</title>
</head>
<body>
<div class="panel panel-default">
    <div class="panel panel-primary">
        <div class="panel-heading">
            <h3 class="panel-title">赞不赞同死刑？</h3>
        </div>
        <div class="panel-heading">
            在联邦宪法的框架之下，美国各州的法律规定又各有不同之处，美国曾在1972年的“弗曼案”后曾短暂禁止过死刑，后沃伦大法官主持的最高法院又同意重新执行死刑，此外美国社会似乎越来越欢迎死刑。1976年至1986年，仅有6人被处死；到了1984年，被执行死刑的人数上升到21人；1995年，是56人。但无论怎样，沃伦法院确定的“死刑非同小可”这一观念，还是深入人心的。在中国，死刑人数目前仍被当成国家机密，有一个判断是“中国的死刑人数超过世界上其他所有国家之和”。
        </div>
        <div class="panel-body">
            <div style="width: 100%"><font style="color:#32cd32;font-size: 14px;margin:10px;font-weight:bold;">支持
                38%（1829人）</font> | <font style="color:red;font-size: 14px;margin:10px;font-weight:bold;">反对
                62%（3218人）</font></div>
            <div class="zm-meta-panel" style="float: none">
                <a href="#" class="meta-item toggle-comment js-toggleCommentBox">
                    <i class="z-icon-comment"></i>39
                    <a href="#" class="meta-item js-share"><i class="z-icon-share"></i>分享</a>
                    <span class="zg-bull">•</span>
                    <%--<a href="https://zhuanlan.zhihu.com/p/32371587" class="meta-item" target="_blank">怼回去</a>--%>
                    <input type="button" class="btn-blue" value="怼回去"/>
                </a>
            </div>
            <h1 class="page-header" style="margin: 8px 0 20px;"></h1>
            <table>
                <tr>
                    <td>
                        <div class="zm-meta-panel">
                            <div class="clearfix">
                                <div style="float: left;color: darkgoldenrod">
                                    神：
                                </div>
                                <i style="float: right;">1234</i>
                                <i style="float: right;" class="z-icon-zan"></i>
                                <div style="float: left">
                                    <p class="limit-text">
                                        在Google工作的那些年里，我遇到不少IPO前加入公司的程序员。然而他们无一炫富，甚至有时给人一种寒酸的感觉。比如我的好友C，员工号小三位数，资产在千万美元级。这个美国小伙子一年四季穿各种免费领取的印着公司标志的文化衫，特别爱穿的几件都磨出了洞。他租住在Mountain
                                        View一处1B1B的老公寓房，平日里开一辆再普通不过的Toyota Prius上班。后来为了方便找男朋友（他是gay），他从Mountain
                                        View这个不适合约会的大农村搬到旧金山市里，居然还把唯一的车卖了，因为他觉得在旧金山养车太贵太麻烦，还不如上下班坐Caltrain周末租zipcar好。离开Google之后他加入了一家医疗科技创业公司，理由根本不是为了上市发财，而纯粹是希望帮助他们组建团队，努力改善美国落后的医保体系。</p>
                                </div>
                            </div>
                            <div class="panel-body h-huifu-div">
                                <span class="top_point">◆</span>
                                <p class="limit-text"><a href="#">哈士奇不是狼</a>：投资股市，许多股民梦想着能够通过内幕消息来获得高额回报，赚它个钵满盆盈。河南人曹某等嫌犯就是利用股民的这一心理，伪造虚假的私募公司网站，以提供股票内幕消息的方式取得股民的信任，又以50%—80%的高额回报为诱饵实施诈骗，涉嫌作案20余起，案值40余万元。</p>
                                <p class="limit-text"><a href="#">中央喜剧学院</a> 回复 哈士奇不是狼：投资股市，许多股民梦想着能够通过内幕消息来获得高额回报，赚它个钵满盆盈。河南人曹某等嫌犯就是利用股民的这一心理，伪造虚假的私募公司网站，以提供股票内幕消息的方式取得股民的信任，又以50%—80%的高额回报为诱饵实施诈骗，涉嫌作案20余起，案值40余万元。</p>
                                <a href="#">查看26条评论</a>
                            </div>
                        </div>
                    </td>
                </tr>
                <tr>
                    <td>
                        <div class="zm-meta-panel">
                            <div class="clearfix">
                                <div style="float: left;color: darkgoldenrod">
                                    神：
                                </div>
                                <i style="float: right;">1234</i>
                                <i style="float: right;" class="z-icon-zan"></i>
                                <div style="float: left">
                                    <p class="limit-text">
                                        在Google工作的那些年里，我遇到不少IPO前加入公司的程序员。然而他们无一炫富，甚至有时给人一种寒酸的感觉。比如我的好友C，员工号小三位数，资产在千万美元级。这个美国小伙子一年四季穿各种免费领取的印着公司标志的文化衫，特别爱穿的几件都磨出了洞。他租住在Mountain
                                        View一处1B1B的老公寓房，平日里开一辆再普通不过的Toyota Prius上班。后来为了方便找男朋友（他是gay），他从Mountain
                                        View这个不适合约会的大农村搬到旧金山市里，居然还把唯一的车卖了，因为他觉得在旧金山养车太贵太麻烦，还不如上下班坐Caltrain周末租zipcar好。离开Google之后他加入了一家医疗科技创业公司，理由根本不是为了上市发财，而纯粹是希望帮助他们组建团队，努力改善美国落后的医保体系。</p>
                                </div>
                            </div>
                        </div>
                    </td>
                </tr>
                <tr>
                    <td>
                        <div class="zm-meta-panel">
                            <div class="clearfix">
                                <div style="float: left;color: darkgoldenrod">
                                    神：
                                </div>
                                <i style="float: right;">1234</i>
                                <i style="float: right;" class="z-icon-zan"></i>
                                <div style="float: left">
                                    <p class="limit-text">
                                        在Google工作的那些年里，我遇到不少IPO前加入公司的程序员。然而他们无一炫富，甚至有时给人一种寒酸的感觉。比如我的好友C，员工号小三位数，资产在千万美元级。这个美国小伙子一年四季穿各种免费领取的印着公司标志的文化衫，特别爱穿的几件都磨出了洞。他租住在Mountain
                                        View一处1B1B的老公寓房，平日里开一辆再普通不过的Toyota Prius上班。后来为了方便找男朋友（他是gay），他从Mountain
                                        View这个不适合约会的大农村搬到旧金山市里，居然还把唯一的车卖了，因为他觉得在旧金山养车太贵太麻烦，还不如上下班坐Caltrain周末租zipcar好。离开Google之后他加入了一家医疗科技创业公司，理由根本不是为了上市发财，而纯粹是希望帮助他们组建团队，努力改善美国落后的医保体系。</p>
                                </div>
                            </div>
                        </div>
                    </td>
                </tr>
            </table>
        </div>
    </div>
    <input id="btntext" type="button" value="添加文本组件" data-toggle="modal" data-target="#myModal" href="#"/>
    <div class="modal hide fade" id="myModal" tabindex="-1" role="dialog">
        <div class="modal-header"><button class="close" type="button" data-dismiss="modal">×</button>
            <h3 id="myModalLabel">Modal header</h3>
        </div>
        <div class="modal-body"></div>
    </div>
</div>
</body>
</html>
