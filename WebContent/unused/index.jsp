<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <!-- Reaf - a Japanese stereotypical pronunciation of leaf. That is all. -->
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Reaf.</title>
		<script src="js/jquery-3.2.1.js"></script>
        <script src="js/index.js"></script>
		<link href="css/mainstyle.css" type="text/css" rel="stylesheet"></link>
		<link href="css/index.css" type="text/css" rel="stylesheet"></link>
    </head>
    <body>
        <div class="topbar">
            <div id="topbar-name">
                Reaf.
            </div>
            <div id="topbar-search-div">
                <input id="topbar-search-bar" type="search"></input>
            </div>
            <div>
                <button id="topbar-account-button">Sign-up/Login</button>	
            </div>
        </div>
        <div class="content">
        	<%-- <%
        		import java.util.ArrayList;
        		ArrayList<String> yes = request.getParameter("photos");
        		for(String s: request.getParameter("photos"))
        		{
        	%>
        	<div>
        		Photo
        	</div>
        	<%
        		}
        	%> --%>
        </div>
        <div class="popup">
            <div id="popup-account">
                <button id="popup-account-close">X</button>
                <br>
                <span id="popup-account-label">Login to Reaf</span>
                <form id="account-login" action="Login" method="POST">
                    <div id="popup-account-items">
                        Username
                        <br>
                        <input size="40" name="username" type="text"/>
                    </div>
                    <div id="popup-account-items">
                        Password
                        <br>
                        <input size="40" name="password" type="password"/>
                    </div>
                    <div id="popup-account-items">
                        <span style="font-size: 14px;">Remember me?</span>
                        <input type="checkbox" name="remember" value="remember" checked/>
                    </div>
                    <div id="popup-account-items">
                        <span style="font-size: 14px;">Create an account</span>
                        <input id="popup-account-submit" type="submit" value="Login"/>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>