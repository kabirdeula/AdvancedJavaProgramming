import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class CookieServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Cookie Example</h2>");

        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                String name = cookie.getName();
                String value = cookie.getValue();
                out.println("<p>Cookie Name: " + name + "</p><p>Value: " + value + "</p>");
            }
        }

        Cookie cookie1 = new Cookie("username", "msanisha");
        cookie1.setMaxAge(24 * 60 * 60);
        response.addCookie(cookie1);
        
        Cookie cookie2 = new Cookie("language", "java");
        cookie2.setMaxAge(24 * 60 * 60);
        response.addCookie(cookie2);
        
        out.println("<p>Cookies have been set.</p></body></html>");
        out.close();
    }
}
