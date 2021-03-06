/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.alm.distributedtask.webapi.model;


/** 
 */
public class AgentQueueEvent {

    private String eventType;
    private TaskAgentQueue queue;

    public String getEventType() {
        return eventType;
    }

    public void setEventType(final String eventType) {
        this.eventType = eventType;
    }

    public TaskAgentQueue getQueue() {
        return queue;
    }

    public void setQueue(final TaskAgentQueue queue) {
        this.queue = queue;
    }
}
