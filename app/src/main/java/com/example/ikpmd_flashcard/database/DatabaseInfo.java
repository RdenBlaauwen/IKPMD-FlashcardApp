package com.example.ikpmd_flashcard.database;

public class DatabaseInfo {
    public class Card {
        public static final String DB_NAME = "card";
        class Columns {
            public static final String QUESTION = "question";
            public static final String ANSWER = "answer";
            public static final String LAST_CORRECT_AT = "last_correct_at";
            public static final String UPDATED_AT = "updated_at";
            public static final String RESULTS = "results";
            public static final String CLOUD_SYNCED = "cloud_synced";
        };
    }
}
