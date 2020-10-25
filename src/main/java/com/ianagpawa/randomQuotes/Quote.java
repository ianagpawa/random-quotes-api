package com.ianagpawa.randomQuotes;

public class Quote {
    private final long id;
    private final String content;
    private final String name;
    private final String source;

    public Quote(long id, String content, String name, String source) {
        this.id = id;
        this.content = content;
        this.name = name;
        this.source = source;
    }

    public long getId() { return id; }

    public String getContent() { return content; }

    public String getName() { return name; }

    public String getSource() { return source; }
}
