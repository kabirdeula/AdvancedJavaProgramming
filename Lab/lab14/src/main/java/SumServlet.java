import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class SumServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Sum</title><body>");
        out.println("<h1>Sum of Two Numbers</h1>");

        String number1 = request.getParameter("number1");
        String number2 = request.getParameter("number2");

        int sum = 0;
        try {
            int num1 = Integer.parseInt(number1);
            int num2 = Integer.parseInt(number2);
            sum = num1 + num2;

            out.println("<p>Number 1: " + num1 + "</p>");
            out.println("<p>Number 2: " + num2 + "</p>");
            out.println("<p>Sum: " + sum + "</p>");
        } catch (NumberFormatException e) {
            out.println("<p>Error: Invalid input!</p>");
        }

        out.println("</body></html>");
        out.close();
    }
}
