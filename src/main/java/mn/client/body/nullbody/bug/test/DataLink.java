package mn.client.body.nullbody.bug.test;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class DataLink {

    private String id;
    private String refDataCodeId;
    private String linkedCodeId;
    private String linkType;

    private Date dateCreated;
    private Date lastUpdated;


    public DataLink() {

    }

    @JsonCreator
    public DataLink(@JsonProperty(DataFields.ID) String id,
                    @JsonProperty(DataFields.REFDATACODEID) String refDataCodeId,
                    @JsonProperty(DataFields.LINKEDCODEID) String linkedCodeId,
                    @JsonProperty(DataFields.LINKTYPE) String linkType,
                    @JsonProperty(DataFields.DATECREATED) Date dateCreated,
                    @JsonProperty(DataFields.LASTUPDATED) Date lastUpdated) {
        this.id = id;
        this.refDataCodeId = refDataCodeId;
        this.linkedCodeId = linkedCodeId;
        this.linkType = linkType;
        this.dateCreated = dateCreated;
        this.lastUpdated = lastUpdated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRefDataCodeId() {
        return refDataCodeId;
    }

    public void setRefDataCodeId(String refDataCodeId) {
        this.refDataCodeId = refDataCodeId;
    }

    public String getLinkedCodeId() {
        return linkedCodeId;
    }

    public void setLinkedCodeId(String linkedCodeId) {
        this.linkedCodeId = linkedCodeId;
    }

    public String getLinkType() {
        return linkType;
    }

    public void setLinkType(String linkType) {
        this.linkType = linkType;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
