package io.ahenteti.java.jackson.model;

public class Pojo {
    private PojoMetadata metadata;
    private PojoData data;

    /**
     * empty constructor used by jackson
     */
    public Pojo() {
    }

    public Pojo(PojoMetadata metadata, PojoData data) {
        this.metadata = metadata;
        this.data = data;
    }

    public PojoMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(PojoMetadata metadata) {
        this.metadata = metadata;
    }

    public PojoData getData() {
        return data;
    }

    public void setData(PojoData data) {
        this.data = data;
    }
}
