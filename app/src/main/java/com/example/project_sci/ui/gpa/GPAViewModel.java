package com.example.project_sci.ui.gpa;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class GPAViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public GPAViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is GPA page");
    }

    public LiveData<String> getText() {
        return mText;
    }
}