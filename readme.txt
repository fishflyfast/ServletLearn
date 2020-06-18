bilibili地址:https://www.bilibili.com/video/BV184411V7H8

2020.3.15初次开发,6.18整理

这个Demo演示Servlet的生命周期.

访问方法:在浏览器中输入地址:http://localhost:yourTomcatPort/ServletLearn/life


第一次访问/Demo2/life请求,后台输出三个内容

(1).构造方法被调用,这是实例化阶段,将Servlet对应的类实例化
(2)init()方法被调用,这是初始化阶段
(3)service()方法被调用,这是处理请求阶段.

后面再次访问.Demo2/life时,只输出service()方法被调用,因为实例化和初始化工作已经做了
当关闭Tomcat容器时,调用destroy方法,销毁Servlet