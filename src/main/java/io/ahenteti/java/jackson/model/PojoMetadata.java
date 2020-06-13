package io.ahenteti.java.jackson.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.Instant;

public class PojoMetadata {
    private String backend;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssZ", timezone = "UTC")
    private Instant collectTime;

    /**
     * empty constructor used by jackson
     */
    public PojoMetadata() {
    }

    public PojoMetadata(String backend, Instant collectTime) {
        this.backend = backend;
        this.collectTime = collectTime;
    }

    public String getBackend() {
        return backend;
    }

    public void setBackend(String backend) {
        this.backend = backend;
    }

    public Instant getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Instant collectTime) {
        this.collectTime = collectTime;
    }
}
