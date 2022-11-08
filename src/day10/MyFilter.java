package day10;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter("/serv1")
public class MyFilter implements Filter {

    public MyFilter() 
    {
    	
    }

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("uname");
		String pass=request.getParameter("upass");
		
    	if(name.equals("")||pass.equals(""))
		{
			out.print("please enter username and password");	
		}
		else
		{
			chain.doFilter(request, response);
			
			
		}
		
	}

		public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
