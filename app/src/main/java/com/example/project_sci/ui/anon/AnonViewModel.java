package com.example.project_sci.ui.anon;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class AnonViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public AnonViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Alert page");
    }

    public LiveData<String> getText() {
        return mText;
    }

}