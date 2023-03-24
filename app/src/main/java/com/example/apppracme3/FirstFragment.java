package com.example.apppracme3;


import android.content.Context;import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class FirstFragment extends Fragment {
    final public static String TAG = FirstFragment.class.getSimpleName();

    public FirstFragment(){

    }

    public static FirstFragment newInstance() {
        return new FirstFragment();
    }


    private EditText nickname;
    private EditText fname;
    private EditText sname;
    private EditText email;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_main_frament, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        nickname = (EditText) view.findViewById(R.id.nickname);
        fname = (EditText) view.findViewById(R.id.name);
        sname = (EditText) view.findViewById(R.id.surname);
        email = (EditText) view.findViewById(R.id.email);


        TextView loadTitle = (TextView) view.findViewById(R.id.regscrn);
        loadTitle.setText(R.string.title);
        ImageView loadPicture = (ImageView) view.findViewById(R.id.catgif);
        loadPicture.setImageResource(R.drawable.catgif);
        Button btnReg = (Button) view.findViewById(R.id.btnreg);

        btnReg.setOnClickListener(vie -> {
            Bundle userData = new Bundle();
            userData.putString("Nickname", nickname.getText().toString());
            userData.putString("FName", fname.getText().toString());
            userData.putString("SName", sname.getText().toString());
            userData.putString("Email", email.getText().toString());
            SecondFragment secondFragment = SecondFragment.newInstance();
            secondFragment.setArguments(userData);
            requireActivity().getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container_view, secondFragment)
                    .addToBackStack(TAG)
                    .commit();


            Log.i(TAG, "Data transferred");
        });

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onResume() {
        super.onResume();

    }

    @Override
    public void onStart() {
        super.onStart();

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }

    @Override
    public void onPause() {
        super.onPause();

    }

    @Override
    public void onStop() {
        super.onStop();

    }

    @Override
    public void onDestroy() {
        super.onDestroy();

    }

    @Override
    public void onDetach() {
        super.onDetach();

    }
}
