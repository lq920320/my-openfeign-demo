package com.commons.results;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liuqian
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultWrapper<T> {
    private String code;
    private String message;
    private T data;

    @SuppressWarnings("unchecked")
    public ResultWrapper(T data) {
        this.code = "1000000";
        this.message = "OK";
        this.data = data;
    }
}