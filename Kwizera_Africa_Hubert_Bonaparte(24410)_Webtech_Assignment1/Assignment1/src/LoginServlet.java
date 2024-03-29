import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get user input from the login form
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Check if the provided username and password match the default values
        if ("africa".equals(username) && "0000".equals(password)) {
            // Redirect to home.html if the credentials are correct
            response.sendRedirect("home.html");
        } else {
            // Redirect to forgetpassword.html if the credentials are incorrect
            response.sendRedirect("forgetpassword.html");
        }
    }
}
