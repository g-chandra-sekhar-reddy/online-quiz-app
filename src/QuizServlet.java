import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class QuizServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
                         throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Quiz</title>");
        out.println("</head>");
        out.println("<body style='font-family:Arial;background:#f0f2f5;'>");

        out.println("<div style='width:500px;margin:50px auto;background:white;padding:30px;border-radius:10px;box-shadow:0px 0px 10px gray;'>");

        out.println("<h1>Online Quiz</h1>");

        out.println("<form action='ResultServlet' method='post'>");

        out.println("<p>1. What is Java?</p>");
        out.println("<input type='radio' name='q1' value='Programming Language'> Programming Language<br>");
        out.println("<input type='radio' name='q1' value='Animal'> Animal<br>");
        out.println("<input type='radio' name='q1' value='Car'> Car<br><br>");

        out.println("<p>2. Which tag is used in HTML?</p>");
        out.println("<input type='radio' name='q2' value='HTML'> HTML<br>");
        out.println("<input type='radio' name='q2' value='JAVA'> JAVA<br>");
        out.println("<input type='radio' name='q2' value='SQL'> SQL<br><br>");

        out.println("<p>3. Which language is used for styling?</p>");
        out.println("<input type='radio' name='q3' value='CSS'> CSS<br>");
        out.println("<input type='radio' name='q3' value='Python'> Python<br>");
        out.println("<input type='radio' name='q3' value='C'> C<br><br>");

        out.println("<button type='submit' style='padding:10px;width:100%;background:blue;color:white;border:none;'>Submit Quiz</button>");

        out.println("</form>");

        out.println("</div>");

        out.println("</body>");
        out.println("</html>");
    }
}
