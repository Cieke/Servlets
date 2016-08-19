package be.vdab.nancy;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet(urlPatterns = "/dual.html")
public class DualServlet extends HttpServlet{

    private int maxSize;
    // see this as a "constructor" for the servlet
    @Override
    public void init (ServletConfig config) throws ServletException{
        System.out.println("Creation Servlet now");
        maxSize = Integer.parseInt(config.getInitParameter("maxSize"));
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("GET");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //..
    }
}
