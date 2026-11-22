package com.polyglotmesh.backend.model;

public class ExecutionResponse {

    private String output;
    private String error;
    private boolean success;

    public ExecutionResponse() {
    }

    public ExecutionResponse(String output, String error, boolean success) {
        this.output = output;
        this.error = error;
        this.success = success;
    }

    public String getOutput() {
        return output;
    }

    public String getError() {
        return error;
    }

    public boolean isSuccess() {
        return success;
    }
}
