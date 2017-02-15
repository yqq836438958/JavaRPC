
package com.rpc.framework.server;

import com.rpc.framework.channel.IChannel;
import com.rpc.framework.wrap.RequestWrap;
import com.rpc.framework.wrap.ResponseWrap;

public class ServiceProcessor implements IServiceProcessor {

    private static ServiceProcessor sInstance = null;
    private IChannel mChannel = null;
    private IServiceHandler mServiceHandler = null;

    public static ServiceProcessor get() {
        if (sInstance == null) {
            synchronized (ServiceProcessor.class) {
                sInstance = new ServiceProcessor();
            }
        }
        return sInstance;
    }

    private ServiceProcessor() {

    }

    @Override
    public int add(RequestWrap request) {
        // TODO Auto-generated method stub
        return 0;
    }

    private void sendRsp(ResponseWrap response) {
        if (mChannel != null) {
            mChannel.write(null);
        }
    }
}
