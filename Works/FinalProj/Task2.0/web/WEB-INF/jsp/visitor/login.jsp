
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 18.10.2021
  Time: 3:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="tryLogin.html">
    <p><input name="login" size="10" placeholder="${info.get("Login")}" /></p>
    <p><input name="password" type="password" size="10" maxlength="15" placeholder="${info.get("Password")}"/></p>
    <c:if test = "${exc!=null}">
        <p style="color:#FF0000">
            <small> ${exc} </small>
        </p>
    </c:if>
    <p>
        <input type="submit" value=${info.get("Login")} />
        <button type="button" onclick="location.href='${Back}'">
            ${info.get("Back")}
        </button>
    </p>
</form>
<div>
    <details>
        <summary>${info.get("language")}</summary>
        <ul>
            <li>
                <button
                        <c:if test="${info.get(\"webLang\").equalsString(info.get(\"languageNow\"), \"En\")}">
                            disabled
                        </c:if>
                        onclick="location.href='/Task2_0_war_exploded/languageEn.html'">
                    ${info.get("languageEn")}
                </button>
            </li>
            <li>
                <button
                        <c:if test="${info.get(\"webLang\").equalsString(info.get(\"languageNow\"), \"Ru\")}">
                            disabled
                        </c:if>
                        onclick="location.href='/Task2_0_war_exploded/languageRu.html'">
                    ${info.get("languageRu")}
                </button>
            </li>
        </ul>
    </details>
</div>
</body>
</html>
