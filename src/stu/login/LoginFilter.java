/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stu.login;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LoginFilter implements Filter {

    private String name;
    private String url;
    private String ext;//例外

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        long start = System.currentTimeMillis();
        HttpServletRequest req = (HttpServletRequest) request;
        HttpSession session = req.getSession();
        String uri = req.getRequestURI();
        String ctx = req.getContextPath();
        ctx+="/";
        //如果是首页的请求，没有加index.jsp
        boolean flag = true;
        if(uri.equals(ctx)){
            flag=false;
        }
        else{
            //请求的是例外的页面
            for(String e:parseExt(ext)){
                if(uri.indexOf(e)!=-1){
                    flag = false;
                    break;
                }
            }
        }
        if(session.getAttribute(name)==null){
        	System.out.println("flag:"+flag);
            //不是请求的页面
            if(flag){
                req.getRequestDispatcher(url).forward(request, response);
            }else{
                chain.doFilter(request, response);
            }
        }else{
        	System.out.println("flag:-------------------");
            chain.doFilter(request, response);
        }
        long end = System.currentTimeMillis();
        System.out.println("实际判断花费时间："+(end-start)+"ms");
    }

    public void init(FilterConfig filterConfig) throws ServletException {
        //这里用于从web.xml文件里面获取参数
        name = filterConfig.getInitParameter("name");
        url = filterConfig.getInitParameter("url");
        ext = filterConfig.getInitParameter("ext");
    }
    //根据","分割多个例外的请求
    public String [] parseExt(String ext){
        return ext.split(",");
    }

    public void destroy() {
        System.out.println("LoginFiter销毁");
    }
}
