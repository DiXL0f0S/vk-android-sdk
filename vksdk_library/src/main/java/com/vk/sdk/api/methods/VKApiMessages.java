//
//  Copyright (c) 2014 VK.com
//
//  Permission is hereby granted, free of charge, to any person obtaining a copy of
//  this software and associated documentation files (the "Software"), to deal in
//  the Software without restriction, including without limitation the rights to
//  use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
//  the Software, and to permit persons to whom the Software is furnished to do so,
//  subject to the following conditions:
//
//  The above copyright notice and this permission notice shall be included in all
//  copies or substantial portions of the Software.
//
//  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
//  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
//  FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
//  COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
//  IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
//  CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
//

package com.vk.sdk.api.methods;

import com.vk.sdk.api.VKApiConst;
import com.vk.sdk.api.VKParameters;
import com.vk.sdk.api.VKParser;
import com.vk.sdk.api.VKRequest;
import com.vk.sdk.api.model.VKApiChat;
import com.vk.sdk.api.model.VKApiGetDialogResponse;
import com.vk.sdk.api.model.VKApiGetMessagesResponse;
import com.vk.sdk.api.model.VKApiLongPollServer;

import org.json.JSONObject;

/**
 * Builds requests for API.messages part
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public class VKApiMessages extends VKApiBase {
    /**
     * https://vk.com/dev/messages.delete
     *
     * @param params use parameters from description with VKApiConst class
     * @return Request for load
     */
    public VKRequest delete(VKParameters params) {
        return prepareRequest("delete", params);
    }

    /**
     * https://vk.com/dev/messages.edit
     *
     * @param params use parameters from description with VKApiConst class
     * @return Request for load
     */
    public VKRequest edit(VKParameters params) {
        return prepareRequest("edit", params);
    }

    /**
     * Returns messages current user
     *
     * @return Request for load
     */
    public VKRequest get() {
        return get(VKParameters.from(VKApiConst.COUNT, "10"));
    }

    /**
     * https://vk.com/dev/messages.get
     *
     * @param params use parameters from description with VKApiConst class
     * @return Request for load
     */
    public VKRequest get(VKParameters params) {
        return prepareRequest("get", params, new VKParser() {
            @Override
            public Object createModel(JSONObject object) {
                return new VKApiGetMessagesResponse(object);
            }
        });
    }

    /**
     * Returns dialogs current user
     *
     * @return Request for load
     */
    public VKRequest getDialogs() {
        return getDialogs(VKParameters.from(VKApiConst.COUNT, "5"));
    }

    /**
     * https://vk.com/dev/messages.getDialogs
     *
     * @param params use parameters from description with VKApiConst class
     * @return Request for load
     */
    public VKRequest getDialogs(VKParameters params) {
        return prepareRequest("getDialogs", params, new VKParser() {
            @Override
            public Object createModel(JSONObject object) {
                return new VKApiGetDialogResponse(object);
            }
        });
    }

    /**
     * https://vk.com/dev/messages.getChat
     *
     * @param params use parameters from description with VKApiConst class
     * @return Request for load
     */
    public VKRequest getChat(VKParameters params) {
        return prepareRequest("getChat", params, new VKParser() {
            @Override
            public Object createModel(JSONObject object) {
                return new VKApiChat(object);
            }
        });
    }

    /**
     * https://vk.com/dev/messages.getHistory
     *
     * @param params use parameters from description with VKApiConst class
     * @return Request for load
     */
    public VKRequest getHistory(VKParameters params) {
        return prepareRequest("getHistory", params);
    }

    /**
     * https://vk.com/dev/messages.getLongPollServer
     *
     * @param params use parameters from description with VKApiConst class
     * @return Long Poll server information
     */
    public VKRequest getLongPollServer(VKParameters params) {
        return prepareRequest("getLongPollServer", params, new VKParser() {
            @Override
            public Object createModel(JSONObject object) {
                return new VKApiLongPollServer(object);
            }
        });
    }

    /**
     * https://vk.com/dev/messages.getLongPollHistory
     */
    public VKRequest getLongPollHistory(VKParameters params) {
        return prepareRequest("getLongPollHistory", params);
    }

    /**
    * https://vk.com/dev/messages.markAsRead
    *
    * @param params use parameters from description with VKApiConst class
    * @return 1 for success
    */
    public VKRequest markAsRead(VKParameters params) {
        return prepareRequest("markAsRead", params);
    }

    /**
     * https://vk.com/dev/messages.search
     */
    public VKRequest search(VKParameters params) {
        return prepareRequest("search", params);
    }

    /**
     * https://vk.com/dev/messages.searchDialogs
     */
    public VKRequest searchDialogs() {
        return prepareRequest("searchDialogs", null);
    }
    public VKRequest searchDialogs(VKParameters params) {
        return prepareRequest("searchDialogs", params);
    }

    /**
     * https://vk.com/dev/messages.send
     */
    public VKRequest send(VKParameters params) {
        return prepareRequest("send", params);
    }

    @Override
    protected String getMethodsGroup() {
        return "messages";
    }
}