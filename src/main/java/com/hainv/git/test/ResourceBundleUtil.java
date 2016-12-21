package com.hainv.git.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Properties;

/**
 * Created by Hai NV on 11/30/2016.
 */
public class ResourceBundleUtil {
    private static ResourceBundleUtil instance;




    private String x = null;
    private String m = null;






    private Properties a;
    private String b = null;
    private final String BUNDLE_NAME = "bundle.properties";



    private Properties ml;

    private Properties k;

    private Properties pros;

    public ResourceBundleUtil() throws IOException {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(BUNDLE_NAME);
        Reader reader = new InputStreamReader(inputStream, "UTF-8");



        pros = new Properties();
        pros.load(reader);
    }

    private String c = null;
    public void test1(){




    }

    public static ResourceBundleUtil getInstance() {
        if (instance == null) {
            synchronized (ResourceBundleUtil.class) {
                if (instance == null)
                    try {
                        instance = new ResourceBundleUtil();
                    } catch (IOException e) {
                        //logger.error("Have problem: " + e);
                    }
            }
        }
        return instance;
    }

    public void test() {
    }
    public void hainv_test(){

    }

    public String loadResource(String resourceName) {
        return pros.getProperty(resourceName);
    }

    public void hainv(){

    }
}
