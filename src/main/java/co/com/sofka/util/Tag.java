package co.com.sofka.util;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

public class Tag {
    private Integer tagId;
    private String name;
    private String nicename;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("tag_id")
    public Integer getTagId() {
        return tagId;
    }

    @JsonProperty("tag_id")
    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNicename() {
        return nicename;
    }
    public void setNicename(String nicename) {
        this.nicename = nicename;
    }
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
