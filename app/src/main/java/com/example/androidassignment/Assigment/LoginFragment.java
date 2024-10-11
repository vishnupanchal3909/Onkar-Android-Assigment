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

public class LoginFragment extends Fragment {

    private EditText emailEditText, passwordEditText;
    private Button loginButton, registerButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the login fragment layout
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        // Initialize UI elements
        emailEditText = view.findViewById(R.id.emailEditText);
        passwordEditText = view.findViewById(R.id.passwordEditText);
        loginButton = view.findViewById(R.id.loginButton);
        registerButton = view.findViewById(R.id.registerButton);

        // Handle login button click
        loginButton.setOnClickListener(v -> loginUser());

        // Handle register button click to switch to registration fragment
        registerButton.setOnClickListener(v -> {
            ((QuestionThirdActivity) getActivity()).switchFragment(new RegistrationFragment());
        });

        return view;
    }

    // Dummy login method
    private void loginUser() {
        String email = emailEditText.getText().toString();
        String password = passwordEditText.getText().toString();

        if (email.isEmpty() || password.isEmpty()) {
            Toast.makeText(getActivity(), "Please enter all fields", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getActivity(), "Login Successful", Toast.LENGTH_SHORT).show();
            // Add your login logic here
        }
    }
}
