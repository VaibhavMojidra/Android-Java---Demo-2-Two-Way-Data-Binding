package com.vaibhavmojidra.androidjavademo2twowaydatabinding;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {

    public MutableLiveData<Boolean> checkValue=new MutableLiveData<>();

    public MyViewModel() {
        checkValue.setValue(true);
    }


}
