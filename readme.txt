bilibili地址:https://www.bilibili.com/video/BV184411V7H8

2020.6.26

这个Demo演示的内容:
1.会话：当前浏览器与服务器之间的多次相关联的请求响应关系，称为一次会话
会话跟踪的几种方式：Session Cookie 表单隐藏域 URL重写
2.Session原理
	2.1 服务器为每个会话创建唯一的HttpSession对象
	2.2 每个会话都有唯一的一个SessionId
	2.3 把用户的数据保存在相应的HttpSession对象中
3.request.getSession();参数为空或true：无则创建，有则返回；参数为false:无则返回null.
4.Session的使用：getAttribute,setAttribute
5.Session的删除：超时删除，关闭浏览器或 invalidate()方法。
	5.1 在Web.xml中进行超时配置。
	默认的配置在Tomcat的web.xml配置文件中

6.案例1：统计用户访问系统的次数
7.案例2：购物车

