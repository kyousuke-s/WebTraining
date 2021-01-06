package listener;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import model.Product;

/**
 * Application Lifecycle Listener implementation class initListener
 *
 */
@WebListener
public class initListener implements ServletContextListener {

    /**
     * Default constructor.
     */
    public initListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  {

    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  {
    	ServletContext application=sce.getServletContext();
    	List<Product> list=new ArrayList<>();
    	application.setAttribute("list", list);
    }

}
