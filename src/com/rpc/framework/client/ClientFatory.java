
package com.rpc.framework.client;

public class ClientFatory {
    private static ClientFatory sInstance = null;
    private IClient mClient = null;

    public static ClientFatory getInstance() {
        if (sInstance == null) {
            synchronized (ClientFatory.class) {
                sInstance = new ClientFatory();
            }
        }
        return sInstance;
    }

    private ClientFatory() {
        // mClient = new AbstractClient();
    }

    public IClient getDefaultClient() {
        return mClient;
    }
}
