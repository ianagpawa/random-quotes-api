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
            log.info("Preloading " + repository.save(new Quote("They call`em fingers, but I`ve never seen them fing.....oh there they go!", "Otto the bus driver", "The Simpsons")));
            log.info("Preloading " + repository.save(new Quote("Of all the things in me to admire, she picked my apathy. That`s disheartening.", "Shane", "Apathy and Other Small Victories")));
            log.info("Preloading " + repository.save(new Quote("It`s on the island I wind my endless ways.  The island, that`s all the earth I know.", "Samuel Beckett", "The Unnamable")));
            log.info("Preloading " + repository.save(new Quote("I use Instagram to compensate for my low self esteem is a bunch of words my therapist said.", "Dom Mazzetti", "Youtube")));
            log.info("Preloading " + repository.save(new Quote("Hummingbirds are a legal tender.", "Charlie Kelly", "It`s Always Sunny in Philadelphia")));
            log.info("Preloading " + repository.save(new Quote("Hell is other people.", "Jean-Paul Sartre", "No Exit")));
            log.info("Preloading " + repository.save(new Quote("It depends on what the meaning of the word `is` is.", "Bill Clinton", "Impeachment Trial")));
            log.info("Preloading " + repository.save(new Quote("All that we see or seem is, but a dream within a dream.", "Edgar Allan Poe", "A Dream Within A Dream")));
            log.info("Preloading " + repository.save(new Quote("I told my dad about a dream I had and asked what it meant, he said `it means you were sleeping`.", "Steven Wright", "Standup")));
            log.info("Preloading " + repository.save(new Quote("There he goes. One of God`s own prototypes. A high-powered mutant of some kind never even considered for mass production. Too weird to live, and too rare to die.", "Raoul Duke", "Fear and Loathing in Las Vegas")));
            log.info("Preloading " + repository.save(new Quote("The fact that we live at the bottom of a deep gravity well, on the surface of a gas covered planet going around a nuclear fireball 90 million miles away and think this to be normal is obviously some indication of how skewed our perspective tends to be.", "Douglas Adams", "Hitchhiker`s Guide To The Galaxy")));
            log.info("Preloading " + repository.save(new Quote("Mrs. Krabappel and Principal Skinner were in the closet making babies, and I saw one of the babies, and then the baby looked at me.", "Ralph Wiggum", "The Simpsons")));
            log.info("Preloading " + repository.save(new Quote("Looking up into the night sky is looking into infinity—distance is incomprehensible and therefore meaningless.", "Douglas Adams", "The Hitchhiker`s Guide to the Galaxy")));
            log.info("Preloading " + repository.save(new Quote("Midway on our life`s journey, I found myself in dark woods, the right road lost.", "Dante Aligheri", "Inferno")));
            log.info("Preloading " + repository.save(new Quote("I got a problem, can you relate?  I got a woman callin` love hate.", "Eric Clapton", "Promises")));
            log.info("Preloading " + repository.save(new Quote("SERENITY NOW!", "Frank Costanza", "Seinfeld")));
            log.info("Preloading " + repository.save(new Quote("OMAHA!", "Peyton Manning", "NFL")));
            log.info("Preloading " + repository.save(new Quote("Why was I born handsome instead of rich?", "Ralph Cifaretto", "The Sopranos")));
            log.info("Preloading " + repository.save(new Quote("It`s not easy to juggle a pregnant wife and a troubled child, but somehow I managed to fit in eight hours of TV a day.", "Homer Simpson", "The Simpsons")));
            log.info("Preloading " + repository.save(new Quote("Jerry, just remember:  It`s not a lie if you believe it.", "George Costanza", "Seinfeld")));
            log.info("Preloading " + repository.save(new Quote("Curiosity killed the cat, but for awhile, I was a suspect.", "Steven Wright", "Standup")));
            log.info("Preloading " + repository.save(new Quote( "Bumble Bee Tuna.", "Ace Ventura", "Ace Ventura: Pet Detective")));
        };
    }
}
