package uk.ac.mrc.har.impressclient.entities;

import java.io.Serializable;

public class ParameterGroup implements Serializable {

    private Integer parameterGroupId;
    private String name;
    private String description;

    public ParameterGroup() {
    }

    public ParameterGroup(Integer parameterGroupId) {
        this.parameterGroupId = parameterGroupId;
    }

    public ParameterGroup(Integer parameterGroupId, String name) {
        this.parameterGroupId = parameterGroupId;
        this.name = name;
    }

    public Integer getParameterGroupId() {
        return parameterGroupId;
    }

    public void setParameterGroupId(Integer parameterGroupId) {
        this.parameterGroupId = parameterGroupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (parameterGroupId != null ? parameterGroupId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ParameterGroup)) {
            return false;
        }
        ParameterGroup other = (ParameterGroup) object;
        if ((this.parameterGroupId == null && other.parameterGroupId != null) || (this.parameterGroupId != null && !this.parameterGroupId.equals(other.parameterGroupId))) {
            return false;
        }
        return true;
    }

}
