
package com.rpc.framework.client;

import com.rpc.framework.wrap.RequestWrap;
import com.rpc.framework.wrap.ResponseWrap;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class RPCInvokeHandler implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        IClient client = ClientFatory.getInstance().getDefaultClient();
        RequestWrap request = new RequestWrap();
        // TODO fill the param

        ResponseWrap response = client.send(request);
        return response.getObject();
    }

}
