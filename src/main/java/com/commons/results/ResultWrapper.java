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
    private Integer code;
    private String message;
    private T data;

    @SuppressWarnings("unchecked")
    public ResultWrapper(T data) {
        this.code = 200;
        this.message = "";
        this.data = data;
    }
}