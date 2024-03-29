package espengjostol.webflowtest.servlet;

import javax.servlet.ServletRegistration.Dynamic;

import espengjostol.webflowtest.spring.WebFlowConfig;
import espengjostol.webflowtest.spring.WebMvcConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * For bootstrapping the application.
 */
public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    public WebInitializer() {
        super();
    }

    // API
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { WebMvcConfig.class, WebFlowConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

    @Override
    protected void customizeRegistration(final Dynamic registration) {
        super.customizeRegistration(registration);
    }
}
