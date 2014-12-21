package mychatapppack;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/MessageServlet")
public class MessageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void init(ServletConfig config) throws ServletException {
	    ServletContext context = config.getServletContext();
	    if (context.getAttribute("posts") == null) {
	        context.setAttribute("posts", new ArrayList<Post>());
	    }
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String message = request.getParameter("message");
		if(message != null){
			HttpSession session = request.getSession();
			String userName = (String)session.getAttribute("userName");
			Post post = new Post(userName, message);
			ServletContext context = request.getServletContext();
			ArrayList<Post> posts = (ArrayList<Post>)context.getAttribute("posts");
			posts.add(post);
			context.setAttribute("posts", posts);
		}
		response.sendRedirect("chatroom.jsp");
	}

}
