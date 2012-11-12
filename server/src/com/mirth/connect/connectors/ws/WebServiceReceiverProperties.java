/*
 * Copyright (c) Mirth Corporation. All rights reserved.
 * http://www.mirthcorp.com
 * 
 * The software in this package is published under the terms of the MPL
 * license a copy of which has been included with this distribution in
 * the LICENSE.txt file.
 */

package com.mirth.connect.connectors.ws;

import java.util.ArrayList;
import java.util.List;

import com.mirth.connect.donkey.model.channel.ConnectorProperties;
import com.mirth.connect.donkey.model.channel.ListenerConnectorProperties;
import com.mirth.connect.donkey.model.channel.ListenerConnectorPropertiesInterface;
import com.mirth.connect.donkey.model.channel.ResponseConnectorProperties;
import com.mirth.connect.donkey.model.channel.ResponseConnectorPropertiesInterface;

public class WebServiceReceiverProperties extends ConnectorProperties implements ListenerConnectorPropertiesInterface, ResponseConnectorPropertiesInterface {
    private ListenerConnectorProperties listenerConnectorProperties;
    private ResponseConnectorProperties responseConnectorProperties;

    private String className;
    private String serviceName;
    private String responseValue;
    private List<String> usernames;
    private List<String> passwords;

    public WebServiceReceiverProperties() {
        listenerConnectorProperties = new ListenerConnectorProperties("8081");
        responseConnectorProperties = new ResponseConnectorProperties("None", new String[] { "None" });

        this.className = "com.mirth.connect.connectors.ws.DefaultAcceptMessage";
        this.serviceName = "Mirth";
        this.responseValue = "None";
        this.usernames = new ArrayList<String>();
        this.passwords = new ArrayList<String>();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getResponseValue() {
        return responseValue;
    }

    public void setResponseValue(String responseValue) {
        this.responseValue = responseValue;
    }

    public List<String> getUsernames() {
        return usernames;
    }

    public void setUsernames(List<String> usernames) {
        this.usernames = usernames;
    }

    public List<String> getPasswords() {
        return passwords;
    }

    public void setPasswords(List<String> passwords) {
        this.passwords = passwords;
    }

    @Override
    public String getProtocol() {
        return "WS";
    }

    @Override
    public String getName() {
        return "Web Service Listener";
    }

    @Override
    public String toFormattedString() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ListenerConnectorProperties getListenerConnectorProperties() {
        return listenerConnectorProperties;
    }

    @Override
    public ResponseConnectorProperties getResponseConnectorProperties() {
        return responseConnectorProperties;
    }
}