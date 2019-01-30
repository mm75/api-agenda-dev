package com.api.agenda.dev.apiagendadev.domain.Util;

public class CustomErrorType {

    private String erorMessage;

    public CustomErrorType(String errorMessage) {
        this.erorMessage = errorMessage;
    }

    public String getErorMessage() {
        return erorMessage;
    }

    public void setErorMessage(String erorMessage) {
        this.erorMessage = erorMessage;
    }
}
