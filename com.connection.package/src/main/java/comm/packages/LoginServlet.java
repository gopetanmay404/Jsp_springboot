package comm.packages;
import jakarta.servlet.annotation.WebServlet; // ✅ For Tomcat 10/11
import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;




@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    
    private static final long serialVersionUID = 1L;

    // Post method for login check
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve the username and password from environment variables
        String username = System.getenv("APP_USERNAME");
        String password = System.getenv("APP_PASSWORD");

        // Print the values to check if environment variables are set correctly
        System.out.println("Username from ENV: " + username);
        System.out.println("Password from ENV: " + password);

        // Get credentials from form input
        String formUsername = request.getParameter("username");
        String formPassword = request.getParameter("password");

        // Check if form values match environment variables
        if (username != null && password != null && username.equals(formUsername) && password.equals(formPassword)) {
            HttpSession session = request.getSession();
            session.setAttribute("username", formUsername);
            
            // Redirect to home page after successful login
            response.sendRedirect("home.jsp");
        } else {
            // If credentials don't match, show error message
            response.getWriter().println("Invalid credentials");
        }
    }
}
