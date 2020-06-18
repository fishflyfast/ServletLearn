package name.zkm.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeServlet extends HttpServlet{

	private int count = 0;
	public LifeServlet() {
		System.out.println("构造方法被调用,Servlet实例化了");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("init()被调用,初始化阶段");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service()方法被调用,处理请求,提供服务");
		System.out.println(count++);
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy方法被调用,销毁......");
	}
}
