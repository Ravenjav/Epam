<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 18.10.2021
  Time: 2:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Start</title>
</head>
<body>
<!-- header -->
<div>
    <h1>${info.get("welcomeMes")} </h1>
</div>

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

<div>       <!-- content -->
    <button onclick="location.href='/Task2_0_war_exploded/login.html'">${info.get("login")}</button>
    <button onclick="location.href='/Task2_0_war_exploded/registration.html'">${info.get("registration")}</button>
    <button onclick="location.href='/Task2_0_war_exploded/shop'">${info.get("continue")}</button>
</div>
</body>
</html>
