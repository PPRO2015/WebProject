<%@tag description="Základní šablona stránky" pageEncoding="UTF-8"%>
<%@ attribute name="titulek" rtexprvalue="true" required="true" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${titulek}</title>
        <link rel='stylesheet' href='<c:url value="/css/style.css"/>' />
    </head>
    <body>
        <h1>Zápisník</h1>
 
       <jsp:doBody/>
   </body>
</html>
