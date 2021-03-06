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

package com.microsoft.alm.distributedtask.webapi;

import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.alm.client.AlmHttpClientBase;
import com.microsoft.alm.client.model.ApiResourceVersion;
import com.microsoft.alm.client.model.NameValueCollection;
import com.microsoft.alm.distributedtask.webapi.model.ServiceEndpoint;
import com.microsoft.alm.distributedtask.webapi.model.TaskAgent;
import com.microsoft.alm.distributedtask.webapi.model.TaskAgentJobRequest;
import com.microsoft.alm.distributedtask.webapi.model.TaskAgentMessage;
import com.microsoft.alm.distributedtask.webapi.model.TaskAgentPool;
import com.microsoft.alm.distributedtask.webapi.model.TaskAgentQueue;
import com.microsoft.alm.distributedtask.webapi.model.TaskAgentQueueActionFilter;
import com.microsoft.alm.distributedtask.webapi.model.TaskAgentSession;
import com.microsoft.alm.distributedtask.webapi.model.TaskDefinition;
import com.microsoft.alm.distributedtask.webapi.model.TaskDefinitionEndpoint;
import com.microsoft.alm.distributedtask.webapi.model.TaskPackageMetadata;
import com.microsoft.visualstudio.services.webapi.model.IdentityRef;

public abstract class TaskAgentHttpClientBase
    extends AlmHttpClientBase {

    private final static Map<String, Class<? extends Exception>> TRANSLATED_EXCEPTIONS;

    static {
        TRANSLATED_EXCEPTIONS = new HashMap<String, Class<? extends Exception>>();
    }

    /**
    * Create a new instance of TaskAgentHttpClientBase
    *
    * @param jaxrsClient
    *            an initialized instance of a JAX-RS Client implementation
    * @param baseUrl
    *            a TFS project collection URL
    */
    protected TaskAgentHttpClientBase(final Object jaxrsClient, final URI baseUrl) {
        super(jaxrsClient, baseUrl);
    }

    /**
    * Create a new instance of TaskAgentHttpClientBase
    *
    * @param tfsConnection
    *            an initialized instance of a TfsTeamProjectCollection
    */
    protected TaskAgentHttpClientBase(final Object tfsConnection) {
        super(tfsConnection);
    }

    @Override
    protected Map<String, Class<? extends Exception>> getTranslatedExceptions() {
        return TRANSLATED_EXCEPTIONS;
    }

    /** 
     * @param agent 
     *            
     * @param poolId 
     *            
     * @return TaskAgent
     */
    public TaskAgent addAgent(
        final TaskAgent agent, 
        final int poolId) {

        final UUID locationId = UUID.fromString("e298ef32-5878-4cab-993c-043836571f42"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       agent,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskAgent.class);
    }

    /** 
     * @param poolId 
     *            
     * @param agentId 
     *            
     */
    public void deleteAgent(
        final int poolId, 
        final int agentId) {

        final UUID locationId = UUID.fromString("e298ef32-5878-4cab-993c-043836571f42"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$
        routeValues.put("agentId", agentId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.DELETE,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * @param poolId 
     *            
     * @param agentId 
     *            
     * @param includeCapabilities 
     *            
     * @param propertyFilters 
     *            
     * @return TaskAgent
     */
    public TaskAgent getAgent(
        final int poolId, 
        final int agentId, 
        final Boolean includeCapabilities, 
        final List<String> propertyFilters) {

        final UUID locationId = UUID.fromString("e298ef32-5878-4cab-993c-043836571f42"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$
        routeValues.put("agentId", agentId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeCapabilities", includeCapabilities); //$NON-NLS-1$
        queryParameters.addIfNotNull("propertyFilters", propertyFilters); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskAgent.class);
    }

    /** 
     * @param poolId 
     *            
     * @param agentName 
     *            
     * @param includeCapabilities 
     *            
     * @param propertyFilters 
     *            
     * @param demands 
     *            
     * @return List&lt;TaskAgent&gt;
     */
    public List<TaskAgent> getAgents(
        final int poolId, 
        final String agentName, 
        final Boolean includeCapabilities, 
        final List<String> propertyFilters, 
        final List<String> demands) {

        final UUID locationId = UUID.fromString("e298ef32-5878-4cab-993c-043836571f42"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("agentName", agentName); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeCapabilities", includeCapabilities); //$NON-NLS-1$
        queryParameters.addIfNotNull("propertyFilters", propertyFilters); //$NON-NLS-1$
        queryParameters.addIfNotNull("demands", demands); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TaskAgent>>() {});
    }

    /** 
     * @param agent 
     *            
     * @param poolId 
     *            
     * @param agentId 
     *            
     * @return TaskAgent
     */
    public TaskAgent replaceAgent(
        final TaskAgent agent, 
        final int poolId, 
        final int agentId) {

        final UUID locationId = UUID.fromString("e298ef32-5878-4cab-993c-043836571f42"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$
        routeValues.put("agentId", agentId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PUT,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       agent,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskAgent.class);
    }

    /** 
     * @param agent 
     *            
     * @param poolId 
     *            
     * @param agentId 
     *            
     * @return TaskAgent
     */
    public TaskAgent updateAgent(
        final TaskAgent agent, 
        final int poolId, 
        final int agentId) {

        final UUID locationId = UUID.fromString("e298ef32-5878-4cab-993c-043836571f42"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$
        routeValues.put("agentId", agentId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       agent,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskAgent.class);
    }

    /** 
     * Proxy for a GET request defined by an &#039;endpoint&#039;. The request is authorized using a service connection. The response is filtered using an XPath/Json based selector.
     * 
     * @param endpoint 
     *            Describes the URL to fetch.
     * @return List&lt;String&gt;
     */
    public List<String> queryEndpoint(
        final TaskDefinitionEndpoint endpoint) {

        final UUID locationId = UUID.fromString("f223b809-8c33-4b7d-b53f-07232569b5d6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       apiVersion,
                                                       endpoint,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<String>>() {});
    }

    /** 
     * @param taskId 
     *            
     * @param versionString 
     *            
     * @return InputStream
     */
    public InputStream getTaskIcon(
        final UUID taskId, 
        final String versionString) {

        final UUID locationId = UUID.fromString("63463108-174d-49d4-b8cb-235eea42a5e1"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("taskId", taskId); //$NON-NLS-1$
        routeValues.put("versionString", versionString); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * @param poolId 
     *            
     * @param requestId 
     *            
     * @param lockToken 
     *            
     */
    public void deleteAgentRequest(
        final int poolId, 
        final long requestId, 
        final UUID lockToken) {

        final UUID locationId = UUID.fromString("fc825784-c92a-4299-9221-998a02d1b54f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$
        routeValues.put("requestId", requestId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("lockToken", lockToken); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.DELETE,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * @param poolId 
     *            
     * @param requestId 
     *            
     * @return TaskAgentJobRequest
     */
    public TaskAgentJobRequest getAgentRequest(
        final int poolId, 
        final long requestId) {

        final UUID locationId = UUID.fromString("fc825784-c92a-4299-9221-998a02d1b54f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$
        routeValues.put("requestId", requestId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskAgentJobRequest.class);
    }

    /** 
     * @param request 
     *            
     * @param poolId 
     *            
     * @return TaskAgentJobRequest
     */
    public TaskAgentJobRequest queueAgentRequest(
        final TaskAgentJobRequest request, 
        final int poolId) {

        final UUID locationId = UUID.fromString("fc825784-c92a-4299-9221-998a02d1b54f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       request,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskAgentJobRequest.class);
    }

    /** 
     * @param request 
     *            
     * @param poolId 
     *            
     * @param requestId 
     *            
     * @param lockToken 
     *            
     * @return TaskAgentJobRequest
     */
    public TaskAgentJobRequest updateAgentRequest(
        final TaskAgentJobRequest request, 
        final int poolId, 
        final long requestId, 
        final UUID lockToken) {

        final UUID locationId = UUID.fromString("fc825784-c92a-4299-9221-998a02d1b54f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$
        routeValues.put("requestId", requestId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("lockToken", lockToken); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       request,
                                                       APPLICATION_JSON_TYPE,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskAgentJobRequest.class);
    }

    /** 
     * @param poolId 
     *            
     * @param messageId 
     *            
     * @param sessionId 
     *            
     */
    public void deleteMessage(
        final int poolId, 
        final long messageId, 
        final UUID sessionId) {

        final UUID locationId = UUID.fromString("c3a054f6-7a8a-49c0-944e-3a8e5d7adfd7"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$
        routeValues.put("messageId", messageId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("sessionId", sessionId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.DELETE,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * @param poolId 
     *            
     * @param sessionId 
     *            
     * @param lastMessageId 
     *            
     * @return TaskAgentMessage
     */
    public TaskAgentMessage getMessage(
        final int poolId, 
        final UUID sessionId, 
        final Integer lastMessageId) {

        final UUID locationId = UUID.fromString("c3a054f6-7a8a-49c0-944e-3a8e5d7adfd7"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("sessionId", sessionId); //$NON-NLS-1$
        queryParameters.addIfNotNull("lastMessageId", lastMessageId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskAgentMessage.class);
    }

    /** 
     * @param poolId 
     *            
     * @param agentId 
     *            
     */
    public void refreshAgent(
        final int poolId, 
        final int agentId) {

        final UUID locationId = UUID.fromString("c3a054f6-7a8a-49c0-944e-3a8e5d7adfd7"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.put("agentId", String.valueOf(agentId)); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * @param poolId 
     *            
     */
    public void refreshAgents(
        final int poolId) {

        final UUID locationId = UUID.fromString("c3a054f6-7a8a-49c0-944e-3a8e5d7adfd7"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * @param message 
     *            
     * @param poolId 
     *            
     * @param requestId 
     *            
     */
    public void sendMessage(
        final TaskAgentMessage message, 
        final int poolId, 
        final long requestId) {

        final UUID locationId = UUID.fromString("c3a054f6-7a8a-49c0-944e-3a8e5d7adfd7"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.put("requestId", String.valueOf(requestId)); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       message,
                                                       APPLICATION_JSON_TYPE,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * This method can return packages/{packageType} -- package stream OR TaskPackageMetadata if requested for json
     * 
     * @param packageType 
     *            
     * @return TaskPackageMetadata
     */
    public TaskPackageMetadata getPackage(
        final String packageType) {

        final UUID locationId = UUID.fromString("8ffcd551-079c-493a-9c02-54346299d144"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("packageType", packageType); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskPackageMetadata.class);
    }

    /** 
     * @return List&lt;TaskPackageMetadata&gt;
     */
    public List<TaskPackageMetadata> getPackages() {

        final UUID locationId = UUID.fromString("8ffcd551-079c-493a-9c02-54346299d144"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TaskPackageMetadata>>() {});
    }

    /** 
     * This method can return packages/{packageType} -- package stream OR TaskPackageMetadata if requested for json
     * 
     * @param packageType 
     *            
     * @return InputStream
     */
    public InputStream getPackageZip(
        final String packageType) {

        final UUID locationId = UUID.fromString("8ffcd551-079c-493a-9c02-54346299d144"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("packageType", packageType); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 2.1-preview.1]
     * 
     * @param poolId 
     *            
     * @return List&lt;IdentityRef&gt;
     */
    public List<IdentityRef> getAgentPoolRoles(
        final Integer poolId) {

        final UUID locationId = UUID.fromString("381dd2bb-35cf-4103-ae8c-3c815b25763c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<IdentityRef>>() {});
    }

    /** 
     * @param pool 
     *            
     * @return TaskAgentPool
     */
    public TaskAgentPool addAgentPool(
        final TaskAgentPool pool) {

        final UUID locationId = UUID.fromString("a8c47e17-4d56-4a56-92bb-de7ea7dc65be"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       apiVersion,
                                                       pool,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskAgentPool.class);
    }

    /** 
     * @param poolId 
     *            
     */
    public void deleteAgentPool(
        final int poolId) {

        final UUID locationId = UUID.fromString("a8c47e17-4d56-4a56-92bb-de7ea7dc65be"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.DELETE,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * @param poolId 
     *            
     * @param properties 
     *            
     * @return TaskAgentPool
     */
    public TaskAgentPool getAgentPool(
        final int poolId, 
        final List<String> properties) {

        final UUID locationId = UUID.fromString("a8c47e17-4d56-4a56-92bb-de7ea7dc65be"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("properties", properties); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskAgentPool.class);
    }

    /** 
     * @param poolName 
     *            
     * @param properties 
     *            
     * @return List&lt;TaskAgentPool&gt;
     */
    public List<TaskAgentPool> getAgentPools(
        final String poolName, 
        final List<String> properties) {

        final UUID locationId = UUID.fromString("a8c47e17-4d56-4a56-92bb-de7ea7dc65be"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("poolName", poolName); //$NON-NLS-1$
        queryParameters.addIfNotNull("properties", properties); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TaskAgentPool>>() {});
    }

    /** 
     * @param pool 
     *            
     * @param poolId 
     *            
     * @return TaskAgentPool
     */
    public TaskAgentPool updateAgentPool(
        final TaskAgentPool pool, 
        final int poolId) {

        final UUID locationId = UUID.fromString("a8c47e17-4d56-4a56-92bb-de7ea7dc65be"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       pool,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskAgentPool.class);
    }

    /** 
     * [Preview API 2.1-preview.1]
     * 
     * @param queueId 
     *            
     * @return List&lt;IdentityRef&gt;
     */
    public List<IdentityRef> getAgentQueueRoles(
        final Integer queueId) {

        final UUID locationId = UUID.fromString("b0c6d64d-c9fa-4946-b8de-77de623ee585"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("queueId", queueId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<IdentityRef>>() {});
    }

    /** 
     * [Preview API 2.1-preview.1]
     * 
     * @param queue 
     *            
     * @return TaskAgentQueue
     */
    public TaskAgentQueue addAgentQueue(
        final TaskAgentQueue queue) {

        final UUID locationId = UUID.fromString("900fa995-c559-4923-aae7-f8424fe4fbea"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1-preview.1"); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       apiVersion,
                                                       queue,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskAgentQueue.class);
    }

    /** 
     * [Preview API 2.1-preview.1]
     * 
     * @param queueId 
     *            
     */
    public void deleteAgentQueue(
        final int queueId) {

        final UUID locationId = UUID.fromString("900fa995-c559-4923-aae7-f8424fe4fbea"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("queueId", queueId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.DELETE,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 2.1-preview.1]
     * 
     * @param queueId 
     *            
     * @param actionFilter 
     *            
     * @return TaskAgentQueue
     */
    public TaskAgentQueue getAgentQueue(
        final int queueId, 
        final TaskAgentQueueActionFilter actionFilter) {

        final UUID locationId = UUID.fromString("900fa995-c559-4923-aae7-f8424fe4fbea"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("queueId", queueId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("actionFilter", actionFilter); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskAgentQueue.class);
    }

    /** 
     * [Preview API 2.1-preview.1]
     * 
     * @param queueName 
     *            
     * @param actionFilter 
     *            
     * @return List&lt;TaskAgentQueue&gt;
     */
    public List<TaskAgentQueue> getAgentQueues(
        final String queueName, 
        final TaskAgentQueueActionFilter actionFilter) {

        final UUID locationId = UUID.fromString("900fa995-c559-4923-aae7-f8424fe4fbea"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1-preview.1"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("queueName", queueName); //$NON-NLS-1$
        queryParameters.addIfNotNull("actionFilter", actionFilter); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TaskAgentQueue>>() {});
    }

    /** 
     * [Preview API 2.1-preview.1]
     * 
     * @param endpoint 
     *            
     * @param scopeIdentifier 
     *            The project GUID to scope the request
     * @param endpointId 
     *            
     * @return ServiceEndpoint
     */
    public ServiceEndpoint createServiceEndpoint(
        final ServiceEndpoint endpoint, 
        final UUID scopeIdentifier, 
        final UUID endpointId) {

        final UUID locationId = UUID.fromString("ca373c13-fec3-4b30-9525-35a117731384"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("scopeIdentifier", scopeIdentifier); //$NON-NLS-1$
        routeValues.put("endpointId", endpointId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PUT,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       endpoint,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ServiceEndpoint.class);
    }

    /** 
     * [Preview API 2.1-preview.1]
     * 
     * @param scopeIdentifier 
     *            The project GUID to scope the request
     * @param endpointId 
     *            
     */
    public void deleteServiceEndpoint(
        final UUID scopeIdentifier, 
        final UUID endpointId) {

        final UUID locationId = UUID.fromString("ca373c13-fec3-4b30-9525-35a117731384"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("scopeIdentifier", scopeIdentifier); //$NON-NLS-1$
        routeValues.put("endpointId", endpointId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.DELETE,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 2.1-preview.1]
     * 
     * @param scopeIdentifier 
     *            The project GUID to scope the request
     * @param endpointId 
     *            
     * @return ServiceEndpoint
     */
    public ServiceEndpoint getServiceEndpointDetails(
        final UUID scopeIdentifier, 
        final UUID endpointId) {

        final UUID locationId = UUID.fromString("ca373c13-fec3-4b30-9525-35a117731384"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("scopeIdentifier", scopeIdentifier); //$NON-NLS-1$
        routeValues.put("endpointId", endpointId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ServiceEndpoint.class);
    }

    /** 
     * [Preview API 2.1-preview.1]
     * 
     * @param scopeIdentifier 
     *            The project GUID to scope the request
     * @param type 
     *            
     * @param authSchemes 
     *            
     * @return List&lt;ServiceEndpoint&gt;
     */
    public List<ServiceEndpoint> getServiceEndpoints(
        final UUID scopeIdentifier, 
        final String type, 
        final List<String> authSchemes) {

        final UUID locationId = UUID.fromString("ca373c13-fec3-4b30-9525-35a117731384"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("scopeIdentifier", scopeIdentifier); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("type", type); //$NON-NLS-1$
        queryParameters.addIfNotNull("authSchemes", authSchemes); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<ServiceEndpoint>>() {});
    }

    /** 
     * @param session 
     *            
     * @param poolId 
     *            
     * @return TaskAgentSession
     */
    public TaskAgentSession createAgentSession(
        final TaskAgentSession session, 
        final int poolId) {

        final UUID locationId = UUID.fromString("134e239e-2df3-4794-a6f6-24f1f19ec8dc"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       session,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskAgentSession.class);
    }

    /** 
     * @param poolId 
     *            
     * @param sessionId 
     *            
     */
    public void deleteAgentSession(
        final int poolId, 
        final UUID sessionId) {

        final UUID locationId = UUID.fromString("134e239e-2df3-4794-a6f6-24f1f19ec8dc"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$
        routeValues.put("sessionId", sessionId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.DELETE,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * @param taskId 
     *            
     */
    public void deleteTaskDefinition(
        final UUID taskId) {

        final UUID locationId = UUID.fromString("60aac929-f0cd-4bc8-9ce4-6b30e8f1b1bd"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("taskId", taskId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.DELETE,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * @param taskId 
     *            
     * @param versionString 
     *            
     * @param visibility 
     *            
     * @param scopeLocal 
     *            
     * @return InputStream
     */
    public InputStream getTaskContentZip(
        final UUID taskId, 
        final String versionString, 
        final List<String> visibility, 
        final Boolean scopeLocal) {

        final UUID locationId = UUID.fromString("60aac929-f0cd-4bc8-9ce4-6b30e8f1b1bd"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("taskId", taskId); //$NON-NLS-1$
        routeValues.put("versionString", versionString); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("visibility", visibility); //$NON-NLS-1$
        queryParameters.addIfNotNull("scopeLocal", scopeLocal); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * @param taskId 
     *            
     * @param versionString 
     *            
     * @param visibility 
     *            
     * @param scopeLocal 
     *            
     * @return TaskDefinition
     */
    public TaskDefinition getTaskDefinition(
        final UUID taskId, 
        final String versionString, 
        final List<String> visibility, 
        final Boolean scopeLocal) {

        final UUID locationId = UUID.fromString("60aac929-f0cd-4bc8-9ce4-6b30e8f1b1bd"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("taskId", taskId); //$NON-NLS-1$
        routeValues.put("versionString", versionString); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("visibility", visibility); //$NON-NLS-1$
        queryParameters.addIfNotNull("scopeLocal", scopeLocal); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskDefinition.class);
    }

    /** 
     * @param taskId 
     *            
     * @param visibility 
     *            
     * @param scopeLocal 
     *            
     * @return List&lt;TaskDefinition&gt;
     */
    public List<TaskDefinition> getTaskDefinitions(
        final UUID taskId, 
        final List<String> visibility, 
        final Boolean scopeLocal) {

        final UUID locationId = UUID.fromString("60aac929-f0cd-4bc8-9ce4-6b30e8f1b1bd"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("taskId", taskId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("visibility", visibility); //$NON-NLS-1$
        queryParameters.addIfNotNull("scopeLocal", scopeLocal); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TaskDefinition>>() {});
    }

    /** 
     * @param userCapabilities 
     *            
     * @param poolId 
     *            
     * @param agentId 
     *            
     * @return TaskAgent
     */
    public TaskAgent updateAgentUserCapabilities(
        final HashMap<String,String> userCapabilities, 
        final int poolId, 
        final int agentId) {

        final UUID locationId = UUID.fromString("30ba3ada-fedf-4da8-bbb5-dacf2f82e176"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$
        routeValues.put("agentId", agentId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PUT,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       userCapabilities,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskAgent.class);
    }
}
