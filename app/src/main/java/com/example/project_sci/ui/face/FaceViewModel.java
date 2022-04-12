package com.example.project_sci.ui.face;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class FaceViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public FaceViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Face page");
    }

    public LiveData<String> getText() {
        return mText;
    }
}