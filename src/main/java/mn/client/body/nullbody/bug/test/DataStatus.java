package mn.client.body.nullbody.bug.test;

public enum DataStatus {

    ACTIVE,
    INACTIVE;

    @Override
    public String toString() {
        return this.name();
    }

}
