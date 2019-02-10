package com.kpn.demo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.microsoft.applicationinsights.TelemetryConfiguration;
import com.microsoft.applicationinsights.web.internal.WebRequestTrackingFilter;

public class Login extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		
		
		
		String username= request.getParameter("j_username");
		String password= request.getParameter("j_password");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("This is the Test Servlet for mendix +"+ username+ "password" + password );

		
		if(username.equals("liju2"))
			{
			out.print("<br/>Header Name: <em>" + "success");
			}
		else
		{
			out.print("<br/>Header Name: <em>" + "fail");
		}
		
			
		
	}
	
	    public class AppInsightsConfig {

	    //Initialize AI TelemetryConfiguration via Spring Beans
	      
	        public String telemetryConfig() {
	            String telemetryKey = System.getenv("APPLICATION_INSIGHTS_IKEY");
	            if (telemetryKey != null) {
	                TelemetryConfiguration.getActive().setInstrumentationKey(telemetryKey);
	            }
	            return telemetryKey;
	        }
	 }
	
}