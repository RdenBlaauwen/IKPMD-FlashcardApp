package com.example.ikpmd_flashcard.models;

import java.time.ZonedDateTime;
import java.util.UUID;

public class Card {
    public static final int RESULTS_SAMPLE_SIZE = 7;
    public final UUID id;
    public String question;
    public String answer;
    public ZonedDateTime lastCorrectAt;
    public ZonedDateTime updatedAt;
    public boolean cloudSynced;
    boolean[] results;

    public Card(UUID id){
        this.id = id;
        this.results = new boolean[RESULTS_SAMPLE_SIZE];
    }
}
