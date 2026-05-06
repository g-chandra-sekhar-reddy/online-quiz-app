import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ResultServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException {

        int score = 0;

        String q1 = request.getParameter("q1");
        String q2 = request.getParameter("q2");
        String q3 = request.getParameter("q3");

        if(q1 != null && q1.equals("Programming Language"))
            score++;

        if(q2 != null && q2.equals("HTML"))
            score++;

        if(q3 != null && q3.equals("CSS"))
            score++;

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body style='font-family:Arial;background:#f0f2f5;'>");

        out.println("<div style='width:400px;margin:100px auto;background:white;padding:30px;border-radius:10px;box-shadow:0px 0px 10px gray;text-align:center;'>");

        out.println("<h1>Quiz Result</h1>");

        out.println("<h2>Your Score: " + score + " / 3</h2>");

        out.println("</div>");

        out.println("</body>");
        out.println("</html>");
    }
}
