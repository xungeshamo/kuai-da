package com.xun.kuaida.controller;

import com.xun.kuaida.common.BaseResponse;
import com.xun.kuaida.common.ResultUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {

    @PostMapping("/healthCheck")
    public BaseResponse<String> healthCheck() {
        return ResultUtils.success("success");
    }
}
