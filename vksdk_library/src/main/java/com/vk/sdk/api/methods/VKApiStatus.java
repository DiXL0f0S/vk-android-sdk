package com.vk.sdk.api.methods;

import com.vk.sdk.api.VKParameters;
import com.vk.sdk.api.VKRequest;

@SuppressWarnings({"unused", "WeakerAccess"})
public class VKApiStatus extends VKApiBase {

    public VKRequest get() {
        return get(null);
    }

    public VKRequest get(VKParameters params) {
        return prepareRequest("get", params);
    }

    public VKRequest set() {
        return set(null);
    }

    public VKRequest set(VKParameters params) {
        return prepareRequest("set", params);
    }

    @Override
    protected String getMethodsGroup() {
        return "status";
    }
}