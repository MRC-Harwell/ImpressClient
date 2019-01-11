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

public class OntologyGroup implements Serializable {

    private Integer ontologyGroupId;
    private String name;
    private boolean isActive;
    private boolean deleted;
    private Collection<Integer> paramOntologyoptionCollection;

    public OntologyGroup() {
    }

    public OntologyGroup(Integer ontologyGroupId) {
        this.ontologyGroupId = ontologyGroupId;
    }

    public OntologyGroup(Integer ontologyGroupId, String name, boolean isActive, boolean deleted) {
        this.ontologyGroupId = ontologyGroupId;
        this.name = name;
        this.isActive = isActive;
        this.deleted = deleted;
    }

    public Integer getOntologyGroupId() {
        return ontologyGroupId;
    }

    public void setOntologyGroupId(Integer ontologyGroupId) {
        this.ontologyGroupId = ontologyGroupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public Collection<Integer> getParamOntologyoptionCollection() {
        return paramOntologyoptionCollection;
    }

    public void setParamOntologyoptionCollection(Collection<Integer> paramOntologyoptionCollection) {
        this.paramOntologyoptionCollection = paramOntologyoptionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ontologyGroupId != null ? ontologyGroupId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OntologyGroup)) {
            return false;
        }
        OntologyGroup other = (OntologyGroup) object;
        return !((this.ontologyGroupId == null && other.ontologyGroupId != null) || (this.ontologyGroupId != null && !this.ontologyGroupId.equals(other.ontologyGroupId)));
    }

}
