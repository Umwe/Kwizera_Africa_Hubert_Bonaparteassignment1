import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ForgotPasswordServlet")
public class ForgotPasswordServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get the user's email address from the form
        String email = request.getParameter("email");

        // Assuming some email validation logic here
        boolean isValidEmail = validateEmail(email);

        if (isValidEmail) {
            // Redirect to login.html if the email is valid
            response.sendRedirect("Login.html");
        } else {
            // Handle invalid email (e.g., show an error message)
            response.getWriter().println("Invalid email address. Please try again.");
        }
    }

    // Simple email validation (you can replace this with more robust validation)
    private boolean validateEmail(String email) {
        return email != null && email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}");
    }
}
