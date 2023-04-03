package com.example.domain;

import lombok.Data;

@Data
public class R {
    private boolean flag;
    private Object data;
    private Object dataOne;

    public R() {
    }

    public R(boolean flag, Object body) {
        this.flag = flag;
        this.data = body;
    }

    public R(boolean flag) {
        this.flag = flag;
        this.data = data;
    }

    public R(boolean flag, Object data, Object dataOne) {
        this.flag = flag;
        this.data = data;
        this.dataOne = dataOne;
    }
}
