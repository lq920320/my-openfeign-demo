package com.services;

import java.util.List;

/**
 * @author liuqian
 * @date 2019/10/14 21:57.
 */
public interface BadGuyService {

    /**
     * 获取数量为 count 的渣男语录
     *
     * @param count
     * @return
     */
    List<String> getQuotations(Integer count);
}
