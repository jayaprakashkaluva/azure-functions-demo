package com.jp.functions;

import com.microsoft.azure.functions.annotation.*;
import com.microsoft.azure.functions.*;

/**
 * Azure Functions with Azure Storage Queue trigger.
 */
public class Alerts {
    /**
     * This function will be invoked when a new message is received at the specified path. The message contents are provided as input to this function.
     */
    @FunctionName("Alerts")
    public void run(
        @QueueTrigger(name = "message", queueName = "alerts", connection = "connectionString") String message,
        final ExecutionContext context
    ) {
        context.getLogger().info("Message is " + message);
    }
}
