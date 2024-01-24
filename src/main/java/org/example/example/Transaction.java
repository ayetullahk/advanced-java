package org.example.example;

import java.time.LocalDateTime;

public class Transaction extends BaseClass {
    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    private LocalDateTime time;
}
