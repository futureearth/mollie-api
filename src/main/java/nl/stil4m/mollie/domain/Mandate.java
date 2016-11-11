package nl.stil4m.mollie.domain;

import java.util.Date;
import java.util.Map;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Mandate {
    private final String resource;
    private final String id;
    private final String status;
    private final String method;
    private final String customerId;
    private final Map<String,Object> details;
    private final Optional<String> mandateReference;
    private final Date createdDatetime;

    public Mandate(@JsonProperty("resource") String resource,
                    @JsonProperty("id") String id,
                    @JsonProperty("status") String status,
                    @JsonProperty("method") String method,
                    @JsonProperty("customerId") String customerId,
                    @JsonProperty("details") Map<String, Object> details,
                    @JsonProperty("mandateReference") Optional<String> mandateReference,
                    @JsonProperty("createdDatetime") Date createdDatetime) {
        this.resource = resource;
        this.id = id;
        this.status = status;
        this.method= method;
        this.customerId = customerId;
        this.details = details;
        this.mandateReference = mandateReference;
        this.createdDatetime = createdDatetime;
    }

    public String getResource() {
        return resource;
    }

    public String getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public String getMethod() {
        return method;
    }

    public String getCustomerId() {
        return customerId;
    }

    public Map<String, Object> getDetails() {
        return details;
    }

    public Optional<String> getMandateReference() {
        return mandateReference;
    }

    public Date getCreatedDatetime() {
        return createdDatetime;
    }
}