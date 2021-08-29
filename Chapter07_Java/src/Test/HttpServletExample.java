package Test;
abstract class HttpServlet {
	public abstract void service();
	public void method1() {}
	public void method2() {}
	public void method3() {}
}

public class HttpServletExample {
	public static void main(String[] args) {
		method(new LoginServlet());
		method(new FileDownloadServlet());
	}
	
	public static void method(HttpServlet servlet) {
		servlet.service();
	}
}

