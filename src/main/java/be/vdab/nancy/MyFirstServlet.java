package be.vdab.nancy;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;

@WebServlet(urlPatterns = "/hello.html")


public class MyFirstServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html");
        out.println("<html lang= 'en'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'/>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>" + LocalDateTime.now() + "</h1>");
        out.println("</body>");
        out.println("<html>");

        //super.doGet(req, resp);
    }
}
