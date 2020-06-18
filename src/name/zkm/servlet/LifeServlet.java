package name.zkm.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeServlet extends HttpServlet{

	private int count = 0;
	public LifeServlet() {
		System.out.println("���췽��������,Servletʵ������");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("init()������,��ʼ���׶�");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service()����������,��������,�ṩ����");
		System.out.println(count++);
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy����������,����......");
	}
}
