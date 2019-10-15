package com.controllers;

import com.commons.results.ResultWrapper;
import com.services.BadGuyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author liuqian
 * @date 2019/10/14 21:52.
 */
@RestController
@RequestMapping("api/badGuy")
@Slf4j
public class BadGuyController {

    @Autowired
    private BadGuyService badGuyService;

    @GetMapping("hello")
    public String hello() {
        return "Hello, I'm a bad guy.";
    }

    @GetMapping({"quotations", "quotations/{count}"})
    public ResultWrapper<List<String>> getBadGuyQuotations(
      @PathVariable(value = "count", required = false) Integer count
    ) {
        try {
            List<String> resultStrings = badGuyService.getQuotations(count);
            return new ResultWrapper<>(resultStrings);
        } catch (Exception e) {
            log.error("Failed to get bad guy quotations.", e);
            return new ResultWrapper<List<String>>() {{
                setCode("1000002");
                setMessage("error");
                setData(null);
            }};
        }
    }
}
