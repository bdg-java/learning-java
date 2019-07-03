package com.BankAccount.exception;

public class FileStorageWriteException extends RuntimeException {
    private final String message;
    private final static String DEF_MESSAGE = "File cannot be written ....";

    public FileStorageWriteException() {
        this.message = DEF_MESSAGE;
    }
}
