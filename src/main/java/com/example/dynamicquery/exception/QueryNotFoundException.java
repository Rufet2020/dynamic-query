package com.example.dynamicquery.exception;

public class QueryNotFoundException extends RuntimeException {

    public static final String MESSAGE = "QUERY_NOT_FOUND";

    public QueryNotFoundException() {
        super(MESSAGE);
    }

}
