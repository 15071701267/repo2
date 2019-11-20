package cn.itcast.web.request;



import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/RequestDemo7")
public class RequestDemo7 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext servletContext = request.getServletContext();
        System.out.println(servletContext);
//org.apache.catalina.core.ApplicationContextFacade@63bfc40

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doPost(request,response);
    }
}
