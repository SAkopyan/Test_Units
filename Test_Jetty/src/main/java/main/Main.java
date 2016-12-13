package main;

/**
 * Created by SAkopyan on 13.12.16.
 */
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import servlets.TestRequestServlet;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 */

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws Exception {
        TestRequestServlet allRequestsServlet = new TestRequestServlet();

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.addServlet(new ServletHolder(allRequestsServlet), "/*");

        Server server = new Server(8080);
        server.setHandler(context);

        server.start();
        LOGGER.info("\"Server started\"");
        server.join();
    }
}
