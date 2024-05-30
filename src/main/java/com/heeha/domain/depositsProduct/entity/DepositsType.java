package com.heeha.domain.depositsProduct.entity;

import lombok.Getter;

public enum DepositsType {
    DEPOSIT("적금"),
    SAVING("예금");

    @Getter
    private String title;

    DepositsType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}