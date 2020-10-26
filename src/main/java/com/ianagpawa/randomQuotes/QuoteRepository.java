package com.ianagpawa.randomQuotes;

import org.springframework.data.jpa.repository.JpaRepository;

interface QuoteRepository extends JpaRepository<Quote, Long> { }
