package com.ianagpawa.randomQuotes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(QuoteRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Quote(1,"Hodor", "Bran Stark", "Game of Thrones")));
            log.info("Preloading " + repository.save(new Quote(2, "Bumble Bee Tuna.", "Ace Ventura", "Ace Ventura: Pet Detective")));
        };
    }
}
