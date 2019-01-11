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

public class Increment implements Serializable {

    
    private Integer incrementId;
    private int weight;
    private boolean isActive = true;
    private String incrementString;
    private String incrementType;
    private String incrementUnit;
    private Integer incrementMin;
    private boolean isDeleted;
    private Integer originalId;    
    private Integer parameterId;
    

    public Increment() {
    }

    public Increment(Integer incrementId) {
        this.incrementId = incrementId;
    }

    public Increment(Integer incrementId, int weight, boolean isActive, boolean deleted) {
        this.incrementId = incrementId;
        this.weight = weight;
        this.isActive = isActive;
        this.isDeleted = deleted;
    }

    public Integer getIncrementId() {
        return incrementId;
    }

    public void setIncrementId(Integer incrementId) {
        this.incrementId = incrementId;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public String getIncrementString() {
        return incrementString;
    }

    public void setIncrementString(String incrementString) {
        this.incrementString = incrementString;
    }

    public String getIncrementType() {
        return incrementType;
    }

    public void setIncrementType(String incrementType) {
        this.incrementType = incrementType;
    }

    public String getIncrementUnit() {
        return incrementUnit;
    }

    public void setIncrementUnit(String incrementUnit) {
        this.incrementUnit = incrementUnit;
    }

    public Integer getIncrementMin() {
        return incrementMin;
    }

    public void setIncrementMin(Integer incrementMin) {
        this.incrementMin = incrementMin;
    }

    public boolean isIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getOriginalId() {
        return originalId;
    }

    public void setOriginalId(Integer originalId) {
        this.originalId = originalId;
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
        hash += (incrementId != null ? incrementId.hashCode() : 0);
        return hash;
    }
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Increment)) {
            return false;
        }
        Increment other = (Increment) object;
        return !((this.incrementId == null && other.incrementId != null) || (this.incrementId != null && !this.incrementId.equals(other.incrementId)));
    }
    
}
