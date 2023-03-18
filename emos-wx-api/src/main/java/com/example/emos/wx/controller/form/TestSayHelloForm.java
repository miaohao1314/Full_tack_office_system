package com.example.emos.wx.controller.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@ApiModel
@Data
public class TestSayHelloForm {
    //  @Data  集成lombok生成get和set方法
    //  @NotBlank表示既不能为空，也不能为空字符串
    // ^[\u4e00-\u9fa5]{2,15}$  : 两个汉字到十五个汉字之间的数据
    //  @ApiModelProperty("姓名")  : 对name变量进行一个描述

    @NotBlank
    @Pattern(regexp = "^[\\u4e00-\\u9fa5]{2,15}$",message = "不符合正则表达式")
    @ApiModelProperty("姓名")
    private String name;
}
