package main;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import servlet.FrontEnd;

import javax.servlet.http.HttpServlet;

/**
 * Created by Glasha on 12.01.2017.
 */
public class Main {

    public static void main(String[] src) throws Exception {
        HttpServlet frontEnd = new FrontEnd();

        ServletContextHandler contextHandler = new ServletContextHandler();
        contextHandler.addServlet(new ServletHolder(frontEnd), "/*");

        Server server = new Server(8080);
        server.setHandler(contextHandler);

        server.join();
        server.start();
        System.out.println("Server started");




    }
}
