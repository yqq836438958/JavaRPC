package com.rpc.framework.protocol;

public interface Encoder {
    public byte[] encode(Object object) throws Exception;
}
