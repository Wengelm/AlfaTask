package org.alfatask.model;

public class Meta {

    private int status;
    private String message;

    public Meta() {
    }

    public Meta(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Meta{" +
                "status=" + status +
                ", message='" + message + '\'' +
                '}';
    }
}
