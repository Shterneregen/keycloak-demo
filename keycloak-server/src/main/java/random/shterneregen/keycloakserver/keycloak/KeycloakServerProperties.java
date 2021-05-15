package random.shterneregen.keycloakserver.keycloak;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "keycloak.server")
public class KeycloakServerProperties {

    private String contextPath = "/auth";
    private String realmImportFile = "baeldung-realm.json";
    private AdminUser adminUser = new AdminUser();

    @Data
    public static class AdminUser {
        private String username = "admin";
        private String password = "admin";
    }
}
