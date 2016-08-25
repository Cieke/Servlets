<%@ page import="static be.vdab.nancy.ToDoListServlet.TO_DO_ATTRIBUTE" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>To do list in JSP</title>
</head>
<body>

<div class="container">

    <h1>To do list with JSP</h1>

    <form method="post" action="/ToDoList">

        <div class="form-group">

            <label for="Task">Taak</label>
            <input id="task" type="text" name="task" class="form-control">

        </div>

        <button type="submit" class="btn btn-primary">Toevoegen</button>

    </form>


</div>





<%

    // if empty print "leeg"
    List<String> list=(List<String>) request.getSession().getAttribute("myToDoList");
    if (list == null){

    out.println("Je heb vandaag " + java.time.LocalDate.now() +" nog niets te doen");
    }

    else {
        //out.println(session.getAttribute("myToDoList"));
        out.println("<ol>");
        for (String task : list) {
            out.println("<li>" + task + "</li>");
        }
        out.println("</ol>");

    }

%>

</body>
</html>
