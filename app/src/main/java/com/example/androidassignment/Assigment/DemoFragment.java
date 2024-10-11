package com.example.androidassignment.Assigment;


import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.androidassignment.R;

import org.jetbrains.annotations.Nullable;

public class DemoFragment extends Fragment {

    // Called when the fragment is attached to its host activity.
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        // Initialize any dependencies or components here
        Toast.makeText(context, "Fragment attached to activity.", Toast.LENGTH_SHORT).show();
        System.out.println("Fragment attached to activity.");
    }

    // Called when the fragment is created.
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Perform any setup that should only happen once (e.g., initializing variables)
        Toast.makeText(getActivity().getApplicationContext(), "Fragment created.", Toast.LENGTH_SHORT).show();
        System.out.println("Fragment created.");
    }

    // Called to create the fragment's UI layout.
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the fragment layout
        System.out.println("Fragment view created.");
        Toast.makeText(getActivity().getApplicationContext(), "Fragment view created.", Toast.LENGTH_SHORT).show();
        return inflater.inflate(R.layout.fragment_layout, container, false);
    }

    // Called after onCreateView() when the fragment’s view has been created.
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // Perform view initialization (e.g., setting up buttons, text views)
        Toast.makeText(getActivity().getApplicationContext(), "Fragment view initialized.", Toast.LENGTH_SHORT).show();
        System.out.println("Fragment view initialized.");
    }

    // Called when the fragment becomes visible to the user.
    @Override
    public void onStart() {
        super.onStart();
        Toast.makeText(getActivity().getApplicationContext(), "Fragment started.", Toast.LENGTH_SHORT).show();
        System.out.println("Fragment started.");
    }

    // Called when the fragment becomes interactive (after onStart).
    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText(getActivity().getApplicationContext(), "Fragment resumed.", Toast.LENGTH_SHORT).show();
        System.out.println("Fragment resumed.");
    }

    // Called when the fragment is no longer interactive.
    @Override
    public void onPause() {
        super.onPause();
        Toast.makeText(getActivity().getApplicationContext(), "Fragment paused.", Toast.LENGTH_SHORT).show();
        System.out.println("Fragment paused.");
    }

    // Called when the fragment is no longer visible to the user.
    @Override
    public void onStop() {
        super.onStop();
        Toast.makeText(getActivity().getApplicationContext(), "Fragment stopped.", Toast.LENGTH_SHORT).show();
        System.out.println("Fragment stopped.");
    }

    // Called when the fragment's view is being destroyed.
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Toast.makeText(getActivity().getApplicationContext(), "Fragment view destroyed.", Toast.LENGTH_SHORT).show();
        System.out.println("Fragment view destroyed.");
    }

    // Called when the fragment itself is being destroyed.
    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(getActivity().getApplicationContext(), "Fragment destroyed.", Toast.LENGTH_SHORT).show();
        System.out.println("Fragment destroyed.");
    }

    // Called when the fragment is detached from its host activity.
    @Override
    public void onDetach() {
        super.onDetach();
        Toast.makeText(getActivity().getApplicationContext(), "Fragment detached from activity.", Toast.LENGTH_SHORT).show();
        System.out.println("Fragment detached from activity.");
    }
}