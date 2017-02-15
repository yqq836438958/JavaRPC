
package com.rpc.framework.protocol;

public interface Decoder {
    public Object decode(String className, byte[] bytes) throws Exception;
}
