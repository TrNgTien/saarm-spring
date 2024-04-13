package com.trngtien.saarm_be.models.reponses;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.List;
import java.util.stream.Collector;

@Data
public class ResponseObject {
    private HttpStatus status;
    private String message;
    private Object data;


    public ResponseObject() {
    }

    public ResponseObject(HttpStatus status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public Object collect(Collector<Object, ?, List<Object>> list) {
        return null;
    }
}
