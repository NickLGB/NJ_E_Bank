package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class CharSetFilter
 */
@WebFilter("/CharSetFilter")
public class CharSetFilter implements Filter{
	
	String charset = null;
	
	public void init(FilterConfig config)throws ServletException{
		charset = config.getInitParameter("encode");//�������ļ��ж�ȡ����
	}
	
	public void doFilter(ServletRequest request,ServletResponse response,FilterChain chain)throws IOException,ServletException{
		HttpServletRequest req = (HttpServletRequest)request;//��������
		req.setCharacterEncoding(charset);//���ñ����ʽ
		chain.doFilter(request, response);//����������Ӧ
	}
	
	public void destroy(){
		
	}
}
