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

package com.microsoft.alm.distributedtask.webapi.connectedservice;

import java.util.UUID;
import com.microsoft.alm.common.ProjectState;

/** 
 * Represents a shallow reference to a TeamProject.
 * 
 */
public class TeamProjectReference {

    /**
    * Project abbreviation.
    */
    private String abbreviation;
    /**
    * The project&#039;s description (if any).
    */
    private String description;
    /**
    * Project identifier.
    */
    private UUID id;
    /**
    * Project name.
    */
    private String name;
    /**
    * Project state.
    */
    private ProjectState state;
    /**
    * Url to the full version of the object.
    */
    private String url;

    /**
    * Project abbreviation.
    */
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
    * Project abbreviation.
    */
    public void setAbbreviation(final String abbreviation) {
        this.abbreviation = abbreviation;
    }

    /**
    * The project&amp;#039;s description (if any).
    */
    public String getDescription() {
        return description;
    }

    /**
    * The project&amp;#039;s description (if any).
    */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
    * Project identifier.
    */
    public UUID getId() {
        return id;
    }

    /**
    * Project identifier.
    */
    public void setId(final UUID id) {
        this.id = id;
    }

    /**
    * Project name.
    */
    public String getName() {
        return name;
    }

    /**
    * Project name.
    */
    public void setName(final String name) {
        this.name = name;
    }

    /**
    * Project state.
    */
    public ProjectState getState() {
        return state;
    }

    /**
    * Project state.
    */
    public void setState(final ProjectState state) {
        this.state = state;
    }

    /**
    * Url to the full version of the object.
    */
    public String getUrl() {
        return url;
    }

    /**
    * Url to the full version of the object.
    */
    public void setUrl(final String url) {
        this.url = url;
    }
}
