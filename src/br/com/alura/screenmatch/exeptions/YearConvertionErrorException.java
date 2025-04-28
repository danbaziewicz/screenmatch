package br.com.alura.screenmatch.exeptions;

public class YearConvertionErrorException extends RuntimeException {
    private String message;

    public YearConvertionErrorException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
