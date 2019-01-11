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

public class ParamMpterm implements Serializable {

    
    private Integer paramMptermId;
    private Integer ontologyTermId;
    private int weight;
    private boolean isDeleted;
    private String optionText;
    private Integer incrementId;
    private Integer parameterId;
    private String sex;
    private String selectionOutcome;

    public ParamMpterm() {
    }

    public ParamMpterm(Integer paramMptermId) {
        this.paramMptermId = paramMptermId;
    }

    public ParamMpterm(Integer paramMptermId, int weight, boolean deleted) {
        this.paramMptermId = paramMptermId;
        this.weight = weight;
        this.isDeleted = deleted;
    }

    public Integer getParamMptermId() {
        return paramMptermId;
    }

    public void setParamMptermId(Integer paramMptermId) {
        this.paramMptermId = paramMptermId;
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

    public String getOptionText() {
        return optionText;
    }

    public void setOptionText(String optionText) {
        this.optionText = optionText;
    }

    public Integer getIncrementId() {
        return incrementId;
    }

    public void setIncrementId(Integer incrementId) {
        this.incrementId = incrementId;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSelectionOutcome() {
        return selectionOutcome;
    }

    public void setSelectionOutcome(String selectionOutcome) {
        this.selectionOutcome = selectionOutcome;
    }

    public Integer getOntologyTermId() {
        return ontologyTermId;
    }

    public void setOntologyTermId(Integer ontologyTermId) {
        this.ontologyTermId = ontologyTermId;
    }

    public Integer getParameterId() {
        return parameterId;
    }

    public void setParameterId(Integer parameterId) {
        this.parameterId = parameterId;
    }

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paramMptermId != null ? paramMptermId.hashCode() : 0);
        return hash;
    }
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ParamMpterm)) {
            return false;
        }
        ParamMpterm other = (ParamMpterm) object;
        return !((this.paramMptermId == null && other.paramMptermId != null) || (this.paramMptermId != null && !this.paramMptermId.equals(other.paramMptermId)));
    }
   

}
