package com.android.tabbedactivityimpelementation.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.android.tabbedactivityimpelementation.R;

import org.w3c.dom.Text;

/**
 * A placeholder fragment containing a simple view.
 */
public class Fragment1 extends Fragment {
    TextView textView;


    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        textView = view.findViewById(R.id.section_label);

        return view;
    }
}