package be.vdab.nancy;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (urlPatterns = "/cookie.html")
public class CookieServlet extends HttpServlet  {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        //setting a cookie
        resp.addCookie (new Cookie("myName", "jimi"));
        //c.setDomain("/bla");
        // c.setMaxAge(3600);
        //resp.addCookie(c);

        //reading cookies (possibly another servlet)
        Cookie[] cookies = req.getCookies();
        for (Cookie cookie : cookies){
            if (cookie.getName().equals("myName")){
                resp.getWriter().println("Hello " + cookie.getValue());
            }
        }

    }

}
