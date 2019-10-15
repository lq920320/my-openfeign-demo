package com.clients;

import com.clients.results.QuotationResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author liuqian
 * @date 2019/10/14 20:40.
 */
@FeignClient(name = "badGuy", url = "${bab.guy.url}")
public interface BadGuyFeignClient {

    /**
     * 随机获取一句甜言蜜语
     *
     * @return
     */
    @GetMapping("api/SweetNothings")
    String getSweetNothings();

    /**
     * 获取 count 条甜言蜜语
     *
     * @param count 获取甜言蜜语条数
     * @return Json 格式的结果
     */
    @GetMapping("api/SweetNothings/{count}/Serialization/Json")
    QuotationResult<String> getSweetNothingsJsonByCount(@PathVariable("count") Integer count);
}
