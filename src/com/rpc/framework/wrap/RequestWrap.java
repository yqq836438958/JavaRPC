
package com.rpc.framework.wrap;

public class RequestWrap {
    private int iReqId = 0;
    private String sClassName;
    private String sMethodName;
    private Class<?>[] parameterTypes;
    private Object[] parameters;

    public void setId(int id) {
        iReqId = id;
    }

    public int getId() {
        return iReqId;
    }

    public void setClassName(String className) {
        sClassName = className;
    }

    public String getClassName() {
        return sClassName;
    }

    public void setMethodName(String methodName) {
        sMethodName = methodName;
    }

    public String getMethodName() {
        return sMethodName;
    }

    public void setParamTypes(Class<?>[] types) {
        parameterTypes = types;
    }

    public Class<?>[] getParamTypes() {
        return parameterTypes;
    }

    public void setParams(Object[] params) {
        this.parameters = params;
    }

    public Object[] getParams() {
        return parameters;
    }
}
