package com.scaler.splitwise.dtos;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ResponseDTO<T> {
    private HttpStatus statusCode;
    private T data;
    
    public static <T> ResponseDTO<T> notFound(){
        ResponseDTO<T> response = new ResponseDTO<>();
        response.setStatusCode(HttpStatus.NOT_FOUND);
        return response;
    }


    public static <T> ResponseDTO<T> success(T data){
        ResponseDTO<T> response = new ResponseDTO<>();
        response.setStatusCode(HttpStatus.OK);
        response.setData(data);
        return response;
    }
}
