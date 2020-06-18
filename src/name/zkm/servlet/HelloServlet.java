package name.zkm.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	
	/**
	 * request:�ͻ������������
	 * response:��������ͻ�����Ӧ������
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		//�����ַ���
		response.setContentType("text/html;charset=utf-8");
		//��ǰ̨�����������
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>hello servlet</title></head>");
		out.println("<body><h1>�������ǵĵ�һ��Servlet!!!</h1></body>");
		out.println("</html>");
		out.close();
	}
}
