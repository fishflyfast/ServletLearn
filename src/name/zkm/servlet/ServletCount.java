package name.zkm.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletCount
 */
public class ServletCount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/** Session使用案例：统计每个用户访问服务器的次数
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(true);
		Object counter = session.getAttribute("COUNTER");
		int count = 0;
		if(counter == null) {
			count = 1;
		} else {
			count = ((Integer)counter).intValue();
			count++;
		}
		session.setAttribute("COUNTER", new Integer(count));
		System.out.println(count);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
