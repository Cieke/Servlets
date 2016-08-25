package be.vdab.nancy;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/ToDoList")
public class ToDoListServlet extends HttpServlet{
    public static final String TO_DO_ATTRIBUTE = "myToDoList";

/*
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException{

        HttpSession s = req.getSession();

        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html lang= 'en'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'/>");
        out.println("<title>To do list</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class=\"container\">\n" +
                "\n" +
                "\n" +
                "        <h1>Wat moet ik nog doen?</h1>\n" +
                "        <form method=\"post\" action=\"/ToDoList\">\n" +
                "\n" +
                "            <div class=\"form-group\">\n" +
                "                <label for=\"Task\">Taak</label>\n" +
                "                <input id=\"task\" type=\"text\" name=\"task\" class=\"form-control\">\n" +
                "\n" +
                "\n" +
                "            </div>\n" +
                "\n" +
                "            <button type=\"submit\" class=\"btn btn-primary\">Toevoegen</button>\n" +
                "\n" +
                "        </form>\n" +
                "</div>");

        out.println("</body>");
        out.println("<html>");


    }
*/


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException{

        List<String> list=(List<String>) req.getSession().getAttribute(TO_DO_ATTRIBUTE);
        if (list == null){

            list = new ArrayList<>();
            req.getSession().setAttribute(TO_DO_ATTRIBUTE, list);

        }

       String task = req.getParameter("task");
       System.out.println(task);
        list.add(task);


        resp.sendRedirect("/ToDoList.jsp");
    }
}
