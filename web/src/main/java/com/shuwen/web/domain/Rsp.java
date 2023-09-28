package com.shuwen.web.domain;

import lombok.Data;

import javax.xml.bind.annotation.*;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rsp")
@XmlSeeAlso({Rsp.class})
public class Rsp {

    private int code;

    private String message;

    private Object data;
}
