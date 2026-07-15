package com.dev.core;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Sobe o ApplicationContext completo usando src/test/resources/application.properties (H2 em
 * memória + configuração fake de e-mail + segredo JWT fixo para teste), que substitui o
 * application.properties de produção durante os testes. Isso evita a dependência de um Postgres e
 * um servidor SMTP reais só para validar que o contexto Spring sobe corretamente.
 */
@SpringBootTest
class CoreApplicationTests {

    @Test
    void contextLoads() {}
}
