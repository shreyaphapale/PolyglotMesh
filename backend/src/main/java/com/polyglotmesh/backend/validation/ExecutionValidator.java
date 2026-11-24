package com.polyglotmesh.backend.validation;

import com.polyglotmesh.backend.model.ExecutionRequest;

public class ExecutionValidator {

    public static String validate(ExecutionRequest request) {

        if (request == null) {
            return "Execution request cannot be null";
        }

        if (request.getLanguage() == null ||
            request.getLanguage().isBlank()) {
            return "Programming language is required";
        }

        if (request.getCode() == null ||
            request.getCode().isBlank()) {
            return "Source code cannot be empty";
        }

        return null;
    }
}
