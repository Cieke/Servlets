package be.vdab.nancy;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;



@WebServlet(urlPatterns = "/AgePredictor.html")

public class AgePredictor extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();


       // resp.setHeader("kevin", "Hallo");
        resp.setHeader("Content-Type", "html");

        //String agent = req.getHeader("User-Agent");
        //resp.setHeader("Content-Type", "image/jpeg");
        //resp.setContentType("image/jpeg");
        //resp.setStatus(307);
        //resp.setHeader("Location", "http://www.google.com");
        //of:
       // resp.sendRedirect("http://www.google.com"); //sugar-method of convenience method


        System.out.println(req.getHeader("Host"));

        String ageString = req.getParameter("age");
        try{
            int ageInt = Integer.parseInt(ageString);
            out.println("<!DOCTYPE html>");
            out.println("<html lang= 'en'>");
            out.println("<head>");
            out.println("<meta charset='UTF-8'/>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Hello, " + req.getParameter("name") + " <br>Your age next year will be: "+(Integer.parseInt(req.getParameter("age"))+1)+ "</h1>");
            out.println("</body>");
            out.println("<html>");
        }
        catch (NumberFormatException e){
            out.println("ongeldige invoer");

        }




    }

}




