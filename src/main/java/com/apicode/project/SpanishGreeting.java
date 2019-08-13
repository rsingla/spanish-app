package com.apicode.project;


public class SpanishGreeting {
 
    private String message;
 
    // Required for JSON deserialization
    SpanishGreeting() {
    }
 
    public SpanishGreeting(String message) {
        this.message = message;
    }
 
    public String getMessage() {
        return message;
    }
}
