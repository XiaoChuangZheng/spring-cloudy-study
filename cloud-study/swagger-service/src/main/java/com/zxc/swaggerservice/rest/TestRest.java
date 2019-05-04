package com.zxc.swaggerservice.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * <p>功能描述,该部分必须以中文句号结尾。</p>
 * <p>
 * 创建日期 2019年05月04日
 *
 * @author zhengxiaochuang(zhengxiaochuang @ eefung.com)
 */
@RestController
@Api(value = "测试rest接口类")
@RequestMapping(path = "/test/{id}")
public class TestRest {
    @ApiOperation(value = "测试rest接口")
    @RequestMapping(method = RequestMethod.GET)
    @ApiImplicitParams(
        @ApiImplicitParam(name = "Authorization", value = "认证令牌", required = true, dataType = "String", paramType = "header")
    )
    public String testRest(@PathVariable(value = "id", required = true) @ApiParam(value = "测试id", required = true) String id,
                           @RequestParam(value = "测试名称", required = true) @ApiParam(value = "name", required = true) String name) {
        String s = id + "this is test service" + name;
        return s;
    }
}
