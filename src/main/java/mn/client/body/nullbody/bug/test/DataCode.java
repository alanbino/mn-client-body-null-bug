package mn.client.body.nullbody.bug.test;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataCode {

    // mongo document fields
    private Date dateCreated;
    private Date lastUpdated;

    private String id;
    private String dataKey;
    private String code;
    private String dataType;
    private String locationId;
    private String tenantId;

    private Integer sortOrder;
    private Boolean defaultSelection;

    private DataStatus status;

    private List<DataLabel> labels;
    private List<DataConfig> configs;

    private String parentId;

    // fields added for JSON production only
    private String label;
    private List<DataCode> children;

    public DataCode() {

    }

    @JsonCreator
    public DataCode(String id,
                    String code,
                    @JsonProperty(DataFields.DATAKEY) String dataKey,
                    @JsonProperty(DataFields.DATATYPE) String dataType,
                    @JsonProperty(DataFields.TENANTID) String tenantId,
                    @JsonProperty(DataFields.LOCATIONID) String locationId,
                    @JsonProperty(DataFields.SORTORDER) Integer sortOrder,
                    @JsonProperty(DataFields.DEFAULTSELECTION) Boolean defaultSelection,
                    @JsonProperty(DataFields.STATUS) DataStatus status,
                    @JsonProperty(DataFields.LABELS) List<DataLabel> labels,
                    @JsonProperty(DataFields.CONFIGS) List<DataConfig> configs,
                    @JsonProperty(DataFields.DATECREATED) Date dateCreated,
                    @JsonProperty(DataFields.LASTUPDATED) Date lastUpdated,
                    @JsonProperty(DataFields.PARENTID) String parentId) {
        this.id = id;
        this.code = code;
        this.dataKey = dataKey;
        this.dataType = dataType;
        this.tenantId = tenantId;
        this.locationId = locationId;
        this.sortOrder = sortOrder;
        this.defaultSelection = defaultSelection;
        this.status = status;
        this.labels = labels;
        this.configs = configs;
        this.parentId = parentId;
        this.dateCreated = dateCreated;
        this.lastUpdated = lastUpdated;
    }

    // getters

    @NotBlank @NotNull
    public String getId() {
        return id;
    }

    @NotBlank @NotNull
    public String getDataKey() {
        return dataKey;
    }

    @NotBlank @NotNull
    public String getCode() {
        return code;
    }

    @NotBlank @NotNull
    public String getDataType() {
        return dataType;
    }

    @NotNull
    public DataStatus getStatus() {
        return status;
    }

    @NotEmpty @NotNull
    public List<DataLabel> getLabels() {
        return labels;
    }

    public List<DataConfig> getConfigs() {
        return configs;
    }

    public String getLocationId() {
        return locationId;
    }

    public String getTenantId() {
        return tenantId;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public Boolean getDefaultSelection() {
        return defaultSelection;
    }

    public String getLabel() {
        return label;
    }

    public String getParentId() {
        return parentId;
    }

    public List<DataCode> getChildren() {
        return children;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    // setters

    public void setId(String id) {
        this.id = id;
    }

    public void setDataKey(String dataKey) {
        this.dataKey = dataKey;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public void setDefaultSelection(Boolean defaultSelection) {
        this.defaultSelection = defaultSelection;
    }

    public void setStatus(DataStatus status) {
        this.status = status;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setLabels(List<DataLabel> labels) {
        this.labels = labels;
    }

    public void setConfigs(List<DataConfig> configs) {
        this.configs = configs;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setChildren(List<DataCode> children) {
        this.children = children;
    }

    // helpers

    public void addChild(DataCode child) {
        if (children == null) {
            children = new ArrayList<>();
        }
        children.add(child);
    }
}
