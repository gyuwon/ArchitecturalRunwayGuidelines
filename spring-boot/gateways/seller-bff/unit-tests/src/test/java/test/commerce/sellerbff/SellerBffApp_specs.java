package test.commerce.sellerbff;

import commerce.sellerbff.SellerBffApp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(
    classes = SellerBffApp.class,
    properties = "spring.main.web-application-type=reactive",
    webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT
)
public class SellerBffApp_specs {

    @Test
    void 컨텍스트가_초기화된다(@Autowired TestRestTemplate client) {
        assertThat(DownstreamContexts.IDENTITY.isActive()).isTrue();
    }
}
