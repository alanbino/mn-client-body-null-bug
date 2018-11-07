package mn.client.body.nullbody.bug.test;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class DataLabel {

    private String id;
    private String locale;
    private String label;

    private Date dateCreated;
    private Date lastUpdated;

    public DataLabel() {

    }

    @JsonCreator
    public DataLabel(@JsonProperty(DataFields.ID) String id,
                     @JsonProperty(DataFields.LOCALE) String locale,
                     @JsonProperty(DataFields.LABEL) String label,
                     @JsonProperty(DataFields.DATECREATED) Date dateCreated,
                     @JsonProperty(DataFields.LASTUPDATED) Date lastUpdated) {
        this.id = id;
        this.locale = locale;
        this.label = label;
        this.dateCreated = dateCreated;
        this.lastUpdated = lastUpdated;
    }

    // getters

    @NotNull @NotBlank
    public String getId() {
        return id;
    }

    @NotNull @NotBlank
    public String getLabel() {
        return label;
    }

    public String getLocale() {
        return locale;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    //setters

    public void setId(String id) {
        this.id = id;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public String toString() {
        return label;
    }

}
