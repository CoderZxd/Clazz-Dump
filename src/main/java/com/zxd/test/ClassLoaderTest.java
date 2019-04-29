package com.zxd.test;

import sun.misc.Launcher;

import java.net.URL;

/**
 * @author CoderZZ
 * @Title: ${FILE_NAME}
 * @Project: Clazz-Dump
 * @Package com.zxd.test
 * @description: TODO:一句话描述信息
 * @Version 1.0
 * @create 2019-04-29 22:33
 **/
public class ClassLoaderTest {
    public static void main(String[] args){
        URL[] urls = Launcher.getBootstrapClassPath().getURLs();
        for(URL url:urls){
            System.out.println(url.toExternalForm());
        }
        System.out.println("=====================================");
        System.out.println(System.getProperty("sun.boot.class.path"));

        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        while(classLoader != null){
            System.out.println(classLoader);
            classLoader = classLoader.getParent();
        }
        System.out.println(classLoader);
    }
}
