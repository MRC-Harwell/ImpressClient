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

public class Option implements Serializable {

    
    private Integer optionId;
    private int phoWeight;
    private Integer parentId;
    private String name;
    private boolean isDefault;
    private boolean isActive = true;
    private int poWeight;
    private String description;
    private boolean isDeleted;
    private Integer parameterId;
    
    

    public Option() {
    }

    public Option(Integer id) {
        this.optionId = id;
    }

    public Option(Integer id, int phoWeight, boolean isDefault, boolean isActive, int poWeight, boolean deleted) {
        this.optionId = id;
        this.phoWeight = phoWeight;
        this.isDefault = isDefault;
        this.isActive = isActive;
        this.poWeight = poWeight;
        this.isDeleted = deleted;
    }

    public Integer getOptionId() {
        return optionId;
    }

    public void setOptionId(Integer id) {
        this.optionId = id;
    }

    public int getPHOweight() {
        return phoWeight;
    }

    public void setPHOweight(int phoWeight) {
        this.phoWeight = phoWeight;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getPOweight() {
        return poWeight;
    }

    public void setPOweight(int poWeight) {
        this.poWeight = poWeight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
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
        hash += (optionId != null ? optionId.hashCode() : 0);
        return hash;
    }
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Option)) {
            return false;
        }
        Option other = (Option) object;
        return !((this.optionId == null && other.optionId != null) || (this.optionId != null && !this.optionId.equals(other.optionId)));
    }
}
