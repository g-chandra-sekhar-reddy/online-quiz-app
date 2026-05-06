import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if(username.equals("admin") && password.equals("1234")) {

            response.sendRedirect("QuizServlet");

        } else {

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            out.println("<h2>Invalid Username or Password</h2>");
        }
    }
}
