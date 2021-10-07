package com.example.ikpmd_flashcard.ui.addCard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AddCardViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AddCardViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is addCard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}