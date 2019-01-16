package com.example;

import com.amazonaws.services.lambda.runtime.Context;

public class Greeter {

    private final String FORMAT = "Hello %s.";

    public String sayHello(Object input, Context context) {
        if (context != null) {
            // do something with context
            // context will not be null only when deployed in AWS Lambda
        }
        return String.format(FORMAT, input);
    }
}
