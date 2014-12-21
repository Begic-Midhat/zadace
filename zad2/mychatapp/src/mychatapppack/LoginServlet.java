package mychatapppack;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		LoginService loginService = new LoginService();
		boolean result = loginService.authenticate(userName);

		if (result) {
			HttpSession session = request.getSession();
			session.setAttribute("userName", userName);
			response.sendRedirect("chatroom.jsp");
			return;
		} else {
			response.sendRedirect("login.jsp");
			return;
		}

	}

}
