package org.cdx.ww.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionLifeCycleEventExample implements ServletContextListener, HttpSessionListener, HttpSessionAttributeListener, ServletContextAttributeListener {

	public void sessionCreated(HttpSessionEvent hse) {
		System.out.println("Session sessionCreated() " + hse);
	}

	public void sessionDestroyed(HttpSessionEvent hse) {
		System.out.println("Session sessionDestroyed() " + hse);
	}

	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("Context contextDestroyed() " + sce);
	}

	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Context contextInitialized() " + sce);
	}

	public void attributeAdded(HttpSessionBindingEvent hsbe) {
		System.out.println("Session attributeAdded() " + hsbe);
	}

	public void attributeRemoved(HttpSessionBindingEvent hsbe) {
		System.out.println("Session attributeRemoved() " + hsbe);
	}

	public void attributeReplaced(HttpSessionBindingEvent hsbe) {
		System.out.println("Session attributeReplaced() " + hsbe);
	}

	public void attributeAdded(ServletContextAttributeEvent scae) {
		System.out.println("Context attributeAdded() " + scae);
	}

	public void attributeRemoved(ServletContextAttributeEvent scae) {
		System.out.println("Context attributeRemoved() " + scae);
	}

	public void attributeReplaced(ServletContextAttributeEvent scae) {
		System.out.println("Context attributeReplaced() " + scae);
	}

}
