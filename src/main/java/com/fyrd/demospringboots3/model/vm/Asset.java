package com.fyrd.demospringboots3.model.vm;

import lombok.*;

@Data
@AllArgsConstructor
public class Asset {
    private byte[] content;
    private String contentType;
}
