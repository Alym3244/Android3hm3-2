package com.example.android3hm3_2;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CounterViewModel extends ViewModel {
    MutableLiveData<Integer> counter = new MutableLiveData<>();

    int count = 0;

    void increment() {
        counter.postValue(++count);
    }

    void decrement() {
        counter.postValue(--count);
    }
}
