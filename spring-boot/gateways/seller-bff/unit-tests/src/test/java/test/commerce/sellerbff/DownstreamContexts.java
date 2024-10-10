package test.commerce.sellerbff;

import commerce.identity.IdentityApiApp;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

public class DownstreamContexts {

    public static final ConfigurableApplicationContext IDENTITY = runIdentityApi();

    private static ConfigurableApplicationContext runIdentityApi() {
        return new SpringApplicationBuilder(IdentityApiApp.class)
            .properties(
                "spring.config.name=nonexistent",
                "spring.main.web-application-type=servlet",
                "spring.autoconfigure.exclude=" +
                    "org.springframework.cloud.gateway.config.GatewayAutoConfiguration," +
                    "org.springframework.cloud.gateway.config.GatewayClassPathWarningAutoConfiguration"
            )
            .properties("server.port=31000")
            .run();
    }
}
