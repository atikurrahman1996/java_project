package day24_27_Servlet;
/*
What is a Servlet?

Servlet is a technology which is used to create a web application.
Servlet is an API that provides many interfaces and classes including Servlet, GenericServlet, HttpServlet, ServletRequest, ServletResponse, etc.
Servlet is a class that extends the capabilities of the servers and responds to the incoming requests. It can respond to any requests.
Servlet is a web component that is deployed on the server to create a dynamic web page.

The advantages of Servlet are as follows:

Better performance: because it creates a thread for each request, not process.
Portability: because it uses Java language.
Robust: JVM manages Servlets, so we don't need to worry about the memory leak, garbage collection, etc.
Secure: because it uses java language.

Interfaces in javax.servlet package: Servlet ServletRequest, ServletResponse, RequestDispatcher, ServletConfig, ServletContext, Filter etc.
Classes in javax.servlet package: GenericServlet, HttpServlet, Cookie etc.

Servlet interface needs to be implemented for creating any servlet (either directly or indirectly). 
It provides 3 life cycle methods that are used to initialize the servlet, to service the requests, and to destroy the servlet and 2 non-life cycle methods.

There are 5 methods in Servlet interface. The init, service and destroy are the life cycle methods of servlet.
1.public void init (ServletConfig config)	> initializes the servlet.
2.public void service(ServletRequest request,ServletResponse response) >provides response for the incoming request.
3.public void destroy()>indicates that servlet is being destroyed.
4.public ServletConfig getServletConfig()> returns the object of ServletConfig.
5.public String getServletInfo() >returns information about servlet such as writer, copyright, version etc.

GenericServlet class:
GenericServlet class implements Servlet, ServletConfig and Serializable interfaces.(Above five are also GenericServlet Method)

HttpServlet class:
The HttpServlet class extends the GenericServlet class and implements Serializable interface. It provides http specific methods such as doGet, doPost, doHead, doTrace etc.

There are many methods in HttpServlet class. They are as follows:

public void service(ServletRequest req,ServletResponse res) dispatches the request to the protected service method by converting the request and response object into http type.
protected void service(HttpServletRequest req, HttpServletResponse res)
protected void doGet(HttpServletRequest req, HttpServletResponse res) 
protected void doPost(HttpServletRequest req, HttpServletResponse res)
protected void doPut(HttpServletRequest req, HttpServletResponse res)
protected void doDelete(HttpServletRequest req, HttpServletResponse res)
protected void doHead(HttpServletRequest req, HttpServletResponse res)

Life Cycle of a Servlet (Servlet Life Cycle):

The web container maintains the life cycle of a servlet instance. Let's see the life cycle of the servlet:

1.Servlet class is loaded.
2.Servlet instance is created.
3.init method is invoked.
4.service method is invoked.
5.destroy method is invoked.




*/