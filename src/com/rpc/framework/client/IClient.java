
package com.rpc.framework.client;

import com.rpc.framework.wrap.RequestWrap;
import com.rpc.framework.wrap.ResponseWrap;

public interface IClient {
    public ResponseWrap send(RequestWrap request);
}
