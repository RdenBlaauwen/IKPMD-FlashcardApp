package com.example.ikpmd_flashcard.ui.cardEditor;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.ikpmd_flashcard.models.Card;

public class CardEditorViewModel extends ViewModel {
    private MutableLiveData<Card> viewCard = new MutableLiveData<>();

    public LiveData<Card> getCard(){
        return this.viewCard;
    }

    public void setQuestion(String question){
        Card card = this.viewCard.getValue();
        card.question = question;
        this.viewCard.setValue(card);
    }
}
