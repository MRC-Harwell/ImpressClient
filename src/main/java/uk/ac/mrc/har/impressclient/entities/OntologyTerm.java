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

public class OntologyTerm implements Serializable {

    private Collection<Integer> paramOntologyoptionCollection;
    private Integer ontologyTermId;
    private String ontologyTerm;
    private String ontologyTermName;
    private Short nodeType;
    private Collection<Integer> nodeCollection;
    private Collection<Integer> leafCollection;
    private Collection<Integer> paramMptermCollection;

    public Collection<Integer> getParamMptermCollection() {
        return paramMptermCollection;
    }

    public void setParamMptermCollection(Collection<Integer> paramMptermCollection) {
        this.paramMptermCollection = paramMptermCollection;
    }

    public OntologyTerm() {
    }

    public OntologyTerm(Integer ontologyTermId) {
        this.ontologyTermId = ontologyTermId;
    }

    public Integer getOntologyTermId() {
        return ontologyTermId;
    }

    public void setOntologyTermId(Integer ontologyTermId) {
        this.ontologyTermId = ontologyTermId;
    }

    public String getOntologyTerm() {
        return ontologyTerm;
    }

    public void setOntologyTerm(String ontologyTerm) {
        this.ontologyTerm = ontologyTerm;
    }

    public String getOntologyTermName() {
        return ontologyTermName;
    }

    public void setOntologyTermName(String ontologyTermName) {
        this.ontologyTermName = ontologyTermName;
    }

    public Short getNodeType() {
        return nodeType;
    }

    public void setNodeType(Short nodeType) {
        this.nodeType = nodeType;
    }

    public Collection<Integer> getLeafCollection() {
        return leafCollection;
    }

    public void setLeafCollection(Collection<Integer> leafCollection) {
        this.leafCollection = leafCollection;
    }

    public Collection<Integer> getNodeCollection() {
        return nodeCollection;
    }

    public void setNodeCollection(Collection<Integer> nodeCollection) {
        this.nodeCollection = nodeCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ontologyTermId != null ? ontologyTermId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OntologyTerm)) {
            return false;
        }
        OntologyTerm other = (OntologyTerm) object;
        return !((this.ontologyTermId == null && other.ontologyTermId != null) || (this.ontologyTermId != null && !this.ontologyTermId.equals(other.ontologyTermId)));
    }

    public Collection<Integer> getParamOntologyoptionCollection() {
        return paramOntologyoptionCollection;
    }

    public void setParamOntologyoptionCollection(Collection<Integer> paramOntologyoptionCollection) {
        this.paramOntologyoptionCollection = paramOntologyoptionCollection;
    }

}
