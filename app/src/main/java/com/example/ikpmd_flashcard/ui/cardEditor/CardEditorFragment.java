package com.example.ikpmd_flashcard.ui.cardEditor;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.ikpmd_flashcard.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CardEditorFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CardEditorFragment extends Fragment {

//    private ViewGroup root;
    private CardEditorViewModel viewModelKEK;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private EditText questionTextView;
    private EditText answerTextView;

    public CardEditorFragment() {
        super(R.layout.fragment_card_editor);
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CardEditorFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CardEditorFragment newInstance(String param1, String param2) {
        CardEditorFragment fragment = new CardEditorFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    public void onViewCreated(View view, Bundle savedInstanceState){
        this.viewModelKEK = new ViewModelProvider(requireActivity()).get(CardEditorViewModel.class);

        Button saveButton = (Button) view.findViewById(R.id.buttonSave);
        this.questionTextView = (EditText) getView().findViewById(R.id.editTextQuestion);
        this.answerTextView = (EditText) getView().findViewById(R.id.editTextAnswer);

        this.questionTextView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}

            @Override
            public void afterTextChanged(Editable s) {
                viewModelKEK.setQuestion(s.toString());
            }
        });

        this.answerTextView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}

            @Override
            public void afterTextChanged(Editable s) {
                viewModelKEK.setAnswer(s.toString());
            }
        });

        this.viewModelKEK.getCard().observe(getViewLifecycleOwner(), card -> {
            Log.d("TextWatcher question change + card update test", "msg: "+card.question+" "+card.answer);
        });

        // init OnClickListener for
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveCard(v);
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_card_editor, container, false);
    }

    public void saveCard(View saveButton){
        Log.d("FunctionalityTest","CardFragment - Save START! ");
        String question = this.questionTextView.getText().toString();
        String answer = this.answerTextView.getText().toString();

        Log.d("FunctionalityTest","CardFragment - Save! "+question+" "+answer);
    }
}