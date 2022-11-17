package com.fj.spring5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * Copyright (C), 2017-2022
 * <author>          <time>              <version>
 * 冯俊        2022/8/7 20:55    since 1.0.0
 */
public class JDKProxy {
    public static void main(String[] args) {
        //创建接口类实现类代理对象
        Class[] interfaces ={UserDAO.class};
//        Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                return null;
//            }
//        });
        UserDaoImpl userDao=new UserDaoImpl();
        UserDAO dao =(UserDAO) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        int add = dao.add(1, 2);
        System.out.println("add = " + add);
        

    }
}
//创建代理对象代码
class UserDaoProxy implements InvocationHandler{
    //创建被代理类的对象
    //有参构造传递
    private Object obj;
    public UserDaoProxy(Object obj){
        this.obj=obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //方法之前
        System.out.println("方法之前执行..."+method.getName()+"传递的参数..."+ Arrays.toString(args));
        //被增强方法执行
        Object res = method.invoke(obj, args);
        //方法之后
        System.out.println("方法之后执行..."+obj);
        return res;
    }
}