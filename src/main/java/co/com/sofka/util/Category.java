package co.com.sofka.util;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

public class Category {
    private Integer categoryId;
    private String name;
    private String nicename;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    @JsonProperty("category_id")
    public Integer getCategoryId() {
        return categoryId;
    }
    @JsonProperty("category_id")

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
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

    public void setNicename() {
        this.nicename = nicename;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
