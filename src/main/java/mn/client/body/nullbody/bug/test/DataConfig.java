package mn.client.body.nullbody.bug.test;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class DataConfig<V> {

    private String key;
    private V value;

    public DataConfig() {

    }

    @JsonCreator
    public DataConfig(@JsonProperty String key, @JsonProperty V value) {
        this.key = key;
        this.value = value;
    }

    // getters

    @NotNull @NotBlank
    public String getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    // setters

    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
