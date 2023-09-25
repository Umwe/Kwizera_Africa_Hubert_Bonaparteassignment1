import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve the user's entered username and password from the request parameters
        String username = "user";
        String password = "password";

        if (isValidUser(username, password)) {
            // Redirect to the home page
            response.sendRedirect("home");
        } else {
            // Redirect to the forget password page
            response.sendRedirect("forget");
        }
    }

    private boolean isValidUser(String username, String password) {
        
        
        
        return false;
        
        
        
    }
}
