package com.springbootprojects.springdi.services.i18n;

import com.springbootprojects.springdi.services.GreetingService;
import org.springframework.stereotype.Service;


@Service("i18nService")
public class SpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola desde ESPAÑOL Servicio de Saludo";
    }
}
