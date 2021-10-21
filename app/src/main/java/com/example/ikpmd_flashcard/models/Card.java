package com.example.ikpmd_flashcard.models;

import java.time.ZonedDateTime;
import java.util.UUID;

public class Card {
    static int NUMBER_OF_CORRECT_ANSWERS_NEEDED = 7;
    UUID id;
    String question;
    String answer;
    ZonedDateTime lastCorrectAt;
    boolean[] results;

    public Card(){
        this.results = new boolean[NUMBER_OF_CORRECT_ANSWERS_NEEDED];
    }
}
