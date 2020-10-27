package com.ianagpawa.randomQuotes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
class QuoteController {
    private final QuoteRepository repository;

    QuoteController(QuoteRepository repository) { this.repository = repository; }

    @GetMapping("/quotes")
    List<Quote> all() { return repository.findAll(); }

    @PostMapping("/quotes")
    Quote newQuote(@RequestBody Quote newQuote) { return repository.save(newQuote); }

    @GetMapping("/quotes/{id}")
    Quote one(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new QuoteNotFoundException(id));
    }

    @PutMapping("/quotes/{id}")
    Quote replaceQuote(@RequestBody Quote newQuote, @PathVariable Long id) {
        return repository.findById(id)
                .map(quote -> {
                    quote.setName(newQuote.getName());
                    quote.setContent(newQuote.getContent());
                    quote.setSource(newQuote.getSource());
                    return repository.save(quote);
                })
                .orElseGet(() -> {
                    newQuote.setId(id);
                    return repository.save(newQuote);
                });
    }

    @DeleteMapping("/quotes/{id}")
    void deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
