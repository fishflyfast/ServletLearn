package name.zkm.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
        super();
    }

	/** ע���п�:response.setContentType������getWriter֮ǰ����,����������.
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		//������ʾ��Servletȫ�ֲ����Ļ�ȡ����
		ServletContext context = super.getServletContext();
		String company = context.getInitParameter("globalcompany");
		String address = context.getInitParameter("globaladdress");
		
		context.log("�����������begin.");
		PrintWriter out = response.getWriter();
		out.println("��˾����" + company);
		out.println("��˾��ַ" + address);
		context.log("�����������end.");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
