/*
 * Copyright Medical Research Council (c) 2018.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package uk.ac.mrc.har.impressclient.entities;

import java.io.Serializable;
import java.util.Collection;

public class Pipeline implements Serializable {

    private Integer pipelineId;
    private String pipelineKey;
    private String pipelineType;
    private String name;
    private Integer weight;
    private boolean isVisible;
    private boolean isActive = true;
    private boolean isDeprecated;
    private int majorVersion = 1;
    private int minorVersion = 0;
    private String description;
    private boolean isInternal;
    private boolean isDeleted;
    private Integer centreId;
    private Short impc;
    private Collection<Integer> scheduleCollection;

    public Pipeline() {
    }

    public Pipeline(Integer pipelineId) {
        this.pipelineId = pipelineId;
    }

    public Pipeline(Integer pipelineId, String pipelineKey, boolean isVisible, boolean isActive, boolean isDeprecated, int majorVersion, int minorVersion, boolean isInternal, boolean isDeleted, String pipelineType) {
        this.pipelineId = pipelineId;
        this.pipelineKey = pipelineKey;
        this.isVisible = isVisible;
        this.isActive = isActive;
        this.isDeprecated = isDeprecated;
        this.majorVersion = majorVersion;
        this.minorVersion = minorVersion;
        this.isInternal = isInternal;
        this.isDeleted = isDeleted;
        this.pipelineType = pipelineType;
    }

    public Integer getPipelineId() {
        return pipelineId;
    }

    public void setPipelineId(Integer pipelineId) {
        this.pipelineId = pipelineId;
    }

    public String getPipelineKey() {
        return pipelineKey;
    }

    public void setPipelineKey(String pipelineKey) {
        this.pipelineKey = pipelineKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public boolean getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(boolean isVisible) {
        this.isVisible = isVisible;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean getIsDeprecated() {
        return isDeprecated;
    }

    public void setIsDeprecated(boolean isDeprecated) {
        this.isDeprecated = isDeprecated;
    }

    public int getMajorVersion() {
        return majorVersion;
    }

    public void setMajorVersion(int majorVersion) {
        this.majorVersion = majorVersion;
    }

    public int getMinorVersion() {
        return minorVersion;
    }

    public void setMinorVersion(int minorVersion) {
        this.minorVersion = minorVersion;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getIsInternal() {
        return isInternal;
    }

    public void setIsInternal(boolean isInternal) {
        this.isInternal = isInternal;
    }

    public boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getCentreId() {
        return centreId;
    }

    public void setCentreId(Integer centreId) {
        this.centreId = centreId;
    }

    public Short getImpc() {
        return impc;
    }

    public void setImpc(Short impc) {
        this.impc = impc;
    }

    public String getPipelineType() {
        return pipelineType;
    }

    public void setPipelineType(String pipelineType) {
        this.pipelineType = pipelineType;
    }

    public Collection<Integer> getScheduleCollection() {
        return scheduleCollection;
    }

    public void setScheduleCollection(Collection<Integer> scheduleCollection) {
        this.scheduleCollection = scheduleCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pipelineId != null ? pipelineId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pipeline)) {
            return false;
        }
        Pipeline other = (Pipeline) object;
        return !((this.pipelineId == null && other.pipelineId != null) || (this.pipelineId != null && !this.pipelineId.equals(other.pipelineId)));
    }

}
