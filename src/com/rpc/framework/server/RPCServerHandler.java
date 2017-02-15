
package com.rpc.framework.server;

import com.rpc.framework.wrap.RequestWrap;
import com.rpc.framework.wrap.ResponseWrap;

import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

public class RPCServerHandler implements IServiceHandler, IServiceRegisty {
    private static ConcurrentHashMap<String, Object> mInstanceMap = new ConcurrentHashMap<String, Object>();
    private static ConcurrentHashMap<String, Method> mMethodMap = new ConcurrentHashMap<String, Method>();

    // handleRequest 可能与 server运行在不同进程
    @Override
    public ResponseWrap handleRequest(RequestWrap request) {
        String targetInstanceName = "";// TODO
        Object target = mInstanceMap.get(targetInstanceName);
        ResponseWrap response = new ResponseWrap(request.getId());
        try {
            if (target == null) {
                throw new Exception("no " + targetInstanceName + " instance exist!");
            }
            Object[] requestObjects = null;
            Method method = null;
            // TODO
            Object invokeResult = method.invoke(target, requestObjects);
            response.setResponse(invokeResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }

    @Override
    public int regist(String instanceName, Object instanceObj) {
        mInstanceMap.put(instanceName, instanceObj);
        Class<?> instanceClass = instanceObj.getClass();
        Method[] methods = instanceClass.getMethods();
        for (Method method : methods) {
            Class<?>[] argTypes = method.getParameterTypes();
            StringBuilder methodKeyBuilder = new StringBuilder();
            methodKeyBuilder.append(instanceName).append("#").append(method.getName()).append("$");
            for (Class<?> argClass : argTypes) {
                methodKeyBuilder.append(argClass.getName()).append("_");
            }
            mMethodMap.put(methodKeyBuilder.toString(), method);
        }

        return 0;
    }

}
