package com.services.impl;

import com.clients.BadGuyFeignClient;
import com.services.BadGuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuqian
 * @date 2019/10/14 21:58.
 */
@Component
public class BadServiceImpl implements BadGuyService {

    @Autowired
    private BadGuyFeignClient badGuyFeignClient;

    @Override
    public List<String> getQuotations(Integer count) {
        if (count == null || count <= 0) {
            String singleQuotation = badGuyFeignClient.getSweetNothings();
            return new ArrayList<String>() {{
                add(singleQuotation);
            }};
        }
        return badGuyFeignClient.getSweetNothingsJsonByCount(count).getReturnObj();
    }
}
