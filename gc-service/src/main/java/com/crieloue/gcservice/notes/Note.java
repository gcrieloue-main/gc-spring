package com.crieloue.gcservice.notes;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Note {
    @JsonProperty
    private String titre;
    @JsonProperty
    private String content;

    public Note(String titre, String content) {
        this.titre = titre;
        this.content = content;
    }
}
