
package com.rpc.framework.channel;

public interface IChannel {
    public void read(byte[] data);

    public void write(byte[] data);
}
