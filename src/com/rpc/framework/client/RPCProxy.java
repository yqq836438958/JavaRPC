
package com.rpc.framework.client;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class RPCProxy {
    @SuppressWarnings("unchecked")
    public static <T> T newInstance(Class<?> interfaceClass) {
        InvocationHandler invocationHandler = new RPCInvokeHandler();
        return (T) Proxy.newProxyInstance(
                interfaceClass.getClassLoader(),
                new Class<?>[] {
                        interfaceClass
                },
                invocationHandler);
    }
}
