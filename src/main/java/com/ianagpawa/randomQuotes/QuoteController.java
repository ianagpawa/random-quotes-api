package com.ianagpawa.randomQuotes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class QuoteController {
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/quotes")
    public Quote quote(@RequestParam(value = "other", defaultValue = "ZZ") String other) {
        return new Quote(counter.incrementAndGet(),
                "something something",
                other,
                "from somewhere"
                );
    }
}
