package com.example.androidassignment.Assigment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.androidassignment.R;

public class RegistrationFragment extends Fragment {

    private EditText nameEditText, emailEditText, passwordEditText;
    private Button registerButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the registration fragment layout
        View view = inflater.inflate(R.layout.fragment_registration, container, false);

        // Initialize UI elements
        nameEditText = view.findViewById(R.id.nameEditText);
        emailEditText = view.findViewById(R.id.emailEditText);
        passwordEditText = view.findViewById(R.id.passwordEditText);
        registerButton = view.findViewById(R.id.registerButton);

        // Handle register button click
        registerButton.setOnClickListener(v -> registerUser());

        return view;
    }

    // Dummy registration method
    private void registerUser() {
        String name = nameEditText.getText().toString();
        String email = emailEditText.getText().toString();
        String password = passwordEditText.getText().toString();

        if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
            Toast.makeText(getActivity(), "Please enter all fields", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getActivity(), "Registration Successful", Toast.LENGTH_SHORT).show();
            // Add your registration logic here
            ((QuestionThirdActivity) getActivity()).switchFragment(new LoginFragment()); // Go back to login
        }
    }
}
