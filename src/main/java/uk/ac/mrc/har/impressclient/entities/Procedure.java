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

public class Procedure implements Serializable {

    private Integer procedureId;
    private String procedureKey;
    private Short minFemales = 0;
    private Short minMales = 0;
    private Short minAnimals = 0;
    private boolean isVisible;
    private boolean isMandatory;
    private boolean isInternal;
    private String name;
    private int type;
    private String level;
    private int majorVersion = 1;
    private int minorVersion = 0;
    private String description;
    private String oldProcedureKey;
    private Collection<Integer> parameterCollection;
    private Integer scheduleId;

    public Procedure() {
    }

    public Procedure(Integer procedureId) {
        this.procedureId = procedureId;
    }

    public Procedure(Integer procedureId, String procedureKey, int type, String level, int majorVersion, int minorVersion) {
        this.procedureId = procedureId;
        this.procedureKey = procedureKey;
        this.type = type;
        this.level = level;
        this.majorVersion = majorVersion;
        this.minorVersion = minorVersion;
    }

    public Integer getProcedureId() {
        return procedureId;
    }

    public void setProcedureId(Integer procedureId) {
        this.procedureId = procedureId;
    }

    public String getProcedureKey() {
        return procedureKey;
    }

    public void setProcedureKey(String procedureKey) {
        this.procedureKey = procedureKey;
    }

    public boolean getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(boolean isVisible) {
        this.isVisible = isVisible;
    }

    public boolean getIsMandatory() {
        return isMandatory;
    }

    public void setIsMandatory(boolean isMandatory) {
        this.isMandatory = isMandatory;
    }

    public boolean getIsInternal() {
        return isInternal;
    }

    public void setIsInternal(boolean isInternal) {
        this.isInternal = isInternal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
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

    public Short getMinFemales() {
        return minFemales;
    }

    public void setMinFemales(Short minFemales) {
        this.minFemales = minFemales;
    }

    public Short getMinMales() {
        return minMales;
    }

    public void setMinMales(Short minMales) {
        this.minMales = minMales;
    }

    public Short getMinAnimals() {
        return minAnimals;
    }

    public void setMinAnimals(Short minAnimals) {
        this.minAnimals = minAnimals;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOldProcedureKey() {
        return oldProcedureKey;
    }

    public void setOldProcedureKey(String oldProcedureKey) {
        this.oldProcedureKey = oldProcedureKey;
    }

    public Collection<Integer> getParameterCollection() {
        return parameterCollection;
    }

    public void setParameterCollection(Collection<Integer> parameterCollection) {
        this.parameterCollection = parameterCollection;
    }

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (procedureId != null ? procedureId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Procedure)) {
            return false;
        }
        Procedure other = (Procedure) object;
        return !((this.procedureId == null && other.procedureId != null) || (this.procedureId != null && !this.procedureId.equals(other.procedureId)));
    }

}
