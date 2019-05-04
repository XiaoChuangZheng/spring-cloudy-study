package com.zxc.swaggerservice.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * <p>功能描述,该部分必须以中文句号结尾。</p>
 * <p>
 * 创建日期 2019年05月04日
 *
 * @author zhengxiaochuang(zhengxiaochuang @ eefung.com)
 */
@RestController
@Api(value = "测试rest接口类")
@RequestMapping(path = "/test")
public class TestRest {
    @ApiOperation(value = "测试rest接口")
    @RequestMapping(method = RequestMethod.GET)
    public String testRest() {
        String s = "this is test service";
        return s;
    }
}
