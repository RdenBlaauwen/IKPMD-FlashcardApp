package com.example.ikpmd_flashcard.ui.cardEditor;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

import com.example.ikpmd_flashcard.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CardEditorFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CardEditorFragment extends Fragment {

//    private ViewGroup root;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

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
        Button saveButton = (Button) view.findViewById(R.id.buttonSave);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helloWorld(v);
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_card_editor, container, false);
    }

    public void helloWorld(View saveButton){
        Log.d("FunctionalityTest","CardFragment - Save START! ");
        EditText questionView = (EditText) getView().findViewById(R.id.editTextQuestion);
        EditText answerView = (EditText) getView().findViewById(R.id.editTextAnswer);
        String question = questionView.getText().toString();
        String answer = answerView.getText().toString();

        Log.d("FunctionalityTest","CardFragment - Save! "+question+" "+answer);
    }
}