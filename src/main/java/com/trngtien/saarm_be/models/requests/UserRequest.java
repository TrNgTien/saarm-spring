package com.trngtien.saarm_be.models.requests;

public class UserRequest {
    private int offset;
    private int limit;

    public UserRequest() {
    }

    public UserRequest(int offset, int limit) {
        this.offset = offset;
        this.limit = limit;
    }
}
