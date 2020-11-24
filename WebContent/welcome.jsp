/*
    머리말인 입력되어 있는 menu.jsp와 저작권이 입력되어 있는 footer.jsp를 이 파일에 포함시킨다
    스타일 시트를 이용하여 웹 홈페이지를 꾸민다
    웹 홈페이지에 접속하면 현재 접속한 시간을 표시하고 5초마다 갱신한다
*/
<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.Date"%>
<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
        <title>Welcome</title>
    </head>
    <body>
        <%@ include file="menu.jsp"%>
        <%!
            String greeting = "웹 쇼핑몰에 오신 것을 환영합니다";
            String tagline = "Welcome to Web Market!";
        %>
        <div class="jumbotron">
            <div class="container">
                <h1 class="display-3">
                    <%=greeting%>
                </h1>
            </div>
        </div>
        <div class="container">
            <div class="text-center">
                <h3>
                    <%=tagline%>
                </h3>
                <%  
                    response.setIntHeader("Refresh", 5);
                    Date day = new java.util.Date();
                    String am_pm;
                    int hour = day.getHours();
                    int minute = day.getMinutes();
                    int second = day.getSeconds();
                    if (hour <= 12) {
                    	am_pm = "AM";
                    } else {
                    	am_pm = "PM";
                    	hour = hour - 12;
                    }
                    String CT = hour + ":" + minute + ":" + second + " " + am_pm;
                    out.println("현재 접속 시각: " + CT + "\n");
                %>
            </div>
            <hr>
        </div>
        <%@ include file="footer.jsp"%>
    </body>
</html>