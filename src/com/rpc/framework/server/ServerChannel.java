
package com.rpc.framework.server;

import com.rpc.framework.channel.IChannel;
import com.rpc.framework.wrap.RequestWrap;

// 负责与client端的通信
public class ServerChannel implements IChannel {
    private IServerHandler mServerHandler = null;

    public ServerChannel(IServerHandler handler) {
        mServerHandler = handler;
    }

    @Override
    public void read(byte[] data) {

    }

    @Override
    public void write(byte[] data) {

    }

}
