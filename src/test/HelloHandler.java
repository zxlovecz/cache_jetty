package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

public class HelloHandler extends AbstractHandler {
	@Override
	 public void handle(String target, Request baseRequest,
	            HttpServletRequest request, HttpServletResponse response)
	            throws IOException, ServletException {
	 
	        response.setContentType("text/html;charset=UTF-8");
	        PrintWriter out = response.getWriter();
	        out.write("<h3>This is a HelloHandler and contextPath is '/hello'.</h3>");
	        out.flush();
	        out.close();
	    }
}
