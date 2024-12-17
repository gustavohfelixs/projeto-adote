package br.com.adote.domain;

public class ResponseTeste {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResponseTeste(String message) {
        this.message = message;
    }
}
