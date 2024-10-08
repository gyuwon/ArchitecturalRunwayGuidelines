package test.commerce.identity;

import commerce.identity.IdentityApiApp;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(
    classes = IdentityApiApp.class,
    properties = {
        "spring.datasource.url=jdbc:h2:mem:testdb",
        "spring.jpa.hibernate.ddl-auto=create-drop"
    }
)
public class IdentityApiApp_specs {
    
    @Test
    void 컨텍스트를_초기화한다() {
    }
}
