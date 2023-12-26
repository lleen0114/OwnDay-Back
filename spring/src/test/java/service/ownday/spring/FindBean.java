package service.ownday.spring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class FindBean {
    @Autowired
    ApplicationContext context;

    @Test
    public void contextCheck() throws Exception {

        if(context != null) {
            String[] beans = context.getBeanDefinitionNames();

            for (String bean: beans) {
                System.out.println("bean: " + bean);
            }
        }

    }
}
