
package com.rpc.framework.client;

import com.rpc.framework.wrap.RequestWrap;
import com.rpc.framework.wrap.ResponseWrap;

public abstract class AbstractClient implements IClient {

    @Override
    public ResponseWrap send(RequestWrap request) {
        // TODO Auto-generated method stub
        return null;
    }

    protected abstract ResponseWrap onSendImpl(RequestWrap request,long timeout);
        
    }
}
