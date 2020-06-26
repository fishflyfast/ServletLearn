package name.zkm.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CartServlet
 */
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String goods = request.getParameter("goods");
		String num = request.getParameter("num");
		
		HttpSession session = request.getSession();
		Map<String, Integer> cart = (Map<String, Integer>)session.getAttribute("cart");
		if(cart == null) {
			cart = new HashMap<String, Integer>();
		}
		
		cart.put(goods, Integer.parseInt(num));
		session.setAttribute("cart", cart);
		response.sendRedirect("cart.jsp");
		System.out.println(cart);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
