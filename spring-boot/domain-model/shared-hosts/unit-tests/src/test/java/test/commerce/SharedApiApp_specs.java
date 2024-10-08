package test.commerce;

import commerce.SharedApiApp;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(
    classes = SharedApiApp.class,
    properties = {
        "spring.datasource.url=jdbc:h2:mem:testdb",
        "spring.jpa.hibernate.ddl-auto=create-drop"
    }
)
public class SharedApiApp_specs {
    
    @Test
    void 컨텍스트가_초기화된다() {
    }
}
