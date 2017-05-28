package com.summertaker.keyakizaka46blog.common;

public class BaseParser {

    public String TAG;

    public BaseParser() {
        TAG = "== " + this.getClass().getSimpleName();
    }
}