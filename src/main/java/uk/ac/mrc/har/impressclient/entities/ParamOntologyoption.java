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

public class ParamOntologyoption implements Serializable {
    private Integer ontologyTermId;

    private Integer paramOntologyoptionId;
    private boolean isDefault;
    private boolean isActive;
    private boolean isCollapsed;
    private int weight;
    private boolean isDeleted;
    private Integer ontologyGroupId;

    public ParamOntologyoption() {
    }

    public ParamOntologyoption(Integer paramOntologyoptionId) {
        this.paramOntologyoptionId = paramOntologyoptionId;
    }

    public ParamOntologyoption(Integer paramOntologyoptionId, boolean isDefault, boolean isActive, boolean isCollapsed, int weight, boolean deleted) {
        this.paramOntologyoptionId = paramOntologyoptionId;
        this.isDefault = isDefault;
        this.isActive = isActive;
        this.isCollapsed = isCollapsed;
        this.weight = weight;
        this.isDeleted = deleted;
    }

    public Integer getParamOntologyoptionId() {
        return paramOntologyoptionId;
    }

    public void setParamOntologyoptionId(Integer paramOntologyoptionId) {
        this.paramOntologyoptionId = paramOntologyoptionId;
    }

    public boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean getIsCollapsed() {
        return isCollapsed;
    }

    public void setIsCollapsed(boolean isCollapsed) {
        this.isCollapsed = isCollapsed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
   
    public boolean isIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getOntologyGroupId() {
        return ontologyGroupId;
    }

    public void setOntologyGroupId(Integer ontologyGroupId) {
        this.ontologyGroupId = ontologyGroupId;
    }

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paramOntologyoptionId != null ? paramOntologyoptionId.hashCode() : 0);
        return hash;
    }
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ParamOntologyoption)) {
            return false;
        }
        ParamOntologyoption other = (ParamOntologyoption) object;
        return !((this.paramOntologyoptionId == null && other.paramOntologyoptionId != null) || (this.paramOntologyoptionId != null && !this.paramOntologyoptionId.equals(other.paramOntologyoptionId)));
    }

    public Integer getOntologyTermId() {
        return ontologyTermId;
    }

    public void setOntologyTermId(Integer ontologyTermId) {
        this.ontologyTermId = ontologyTermId;
    }

}
