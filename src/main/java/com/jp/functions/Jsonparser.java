package com.jp.functions;

import com.microsoft.azure.functions.annotation.*;
import com.microsoft.azure.functions.*;

/**
 * Azure Functions with Azure Blob trigger.
 */
public class Jsonparser {
    /**
     * This function will be invoked when a new or updated blob is detected at the specified path. The blob contents are provided as input to this function.
     */
    @FunctionName("Jsonparser")
    @StorageAccount("connectionString")
    public void run(
        @BlobTrigger(name = "content", path = "jpblob/{name}.json", dataType = "binary") byte[] content,
        @BindingName("name") String name,
        final ExecutionContext context
    ) {
        context.getLogger().info("---------------------executing function-------------------");
        String s = new String(content);
        context.getLogger().info("----------uploaded content is ---    "+s);
    }
}
