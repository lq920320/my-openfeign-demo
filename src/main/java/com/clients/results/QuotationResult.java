package com.clients.results;

import lombok.Data;

import java.util.List;

/**
 * @author liuqian
 * @date 2019/10/14 20:47.
 */
@Data
public class QuotationResult<T> {
    /**
     * 错误码
     */
    private Integer code;
    /**
     * 结果信息
     */
    private String message;
    /**
     * 返回结果
     */
    private List<T> returnObj;

}
