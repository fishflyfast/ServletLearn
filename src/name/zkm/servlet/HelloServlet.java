package name.zkm.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	
	/**
	 * request:客户端请求的数据
	 * response:服务器向客户端响应的内容
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		//设置字符集
		response.setContentType("text/html;charset=utf-8");
		//向前台输出的流对象
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>hello servlet</title></head>");
		out.println("<body><h1>这是我们的第一个Servlet!!!</h1></body>");
		out.println("</html>");
		out.close();
	}
}
