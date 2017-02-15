
package com.rpc.framework.server;

import com.rpc.framework.wrap.RequestWrap;
import com.rpc.framework.wrap.ResponseWrap;

public interface IServiceHandler {
    public ResponseWrap handleRequest(RequestWrap request);
}
