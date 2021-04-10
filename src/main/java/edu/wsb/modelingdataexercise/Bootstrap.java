package edu.wsb.modelingdataexercise;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Bootstrap implements InitializingBean {

    @Value("${wsb.test.var}")
    private String myVar;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("aplikacja jest uruchomiona");
        System.out.println(">>>>>>>>>>>>>aplikacja działa " + myVar);
    }

}
