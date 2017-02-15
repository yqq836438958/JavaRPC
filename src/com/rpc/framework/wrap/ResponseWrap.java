
package com.rpc.framework.wrap;

public class ResponseWrap {
    private int iReqId = 0;
    private int iRet = 0;
    private Object mResp = null;

    public ResponseWrap(int _id) {
        iReqId = _id;
    }

    public int getId() {
        return iReqId;
    }

    public Object getResponse() {
        return mResp;
    }

    public void setResponse(Object _result) {
        mResp = _result;
    }

    public void setRet(int _ret) {
        iRet = _ret;
    }

    public int getRet() {
        return iRet;
    }
}
