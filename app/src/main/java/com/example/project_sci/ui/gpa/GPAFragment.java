package com.example.project_sci.ui.gpa;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;
import com.example.project_sci.R;
import com.example.project_sci.ui.gallery.GalleryViewModel;

public class GPAFragment extends Fragment {

    private GPAViewModel gpaViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        gpaViewModel =
                new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(GPAViewModel.class);
        View root = inflater.inflate(R.layout.fragment_g_p_a, container, false);
        final TextView textView = root.findViewById(R.id.text_gpa);
        gpaViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

}