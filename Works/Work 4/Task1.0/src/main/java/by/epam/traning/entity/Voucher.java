package by.epam.traning.entity;

import java.util.Objects;

public class Voucher {
    private char type;
    private char transport;
    private int eating;
    private int days;

    public Voucher(){}

    public Voucher(char type, char transport, int eating, int days){
        this.type = type;
        this.transport = transport;
        this.eating = eating;
        this.days = days;
    }

    public char getType() {
        return type;
    }

    public char getTransport() {
        return transport;
    }

    public int getEating() {
        return eating;
    }

    public int getDays() {
        return days;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voucher voucher = (Voucher) o;
        return type == voucher.type &&
                transport == voucher.transport &&
                eating == voucher.eating &&
                days == voucher.days;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, transport, eating, days);
    }

    @Override
    public String toString() {
        return "Voucher{" +
                "type=" + type +
                ", transport=" + transport +
                ", eating=" + eating +
                ", days=" + days +
                '}';
    }
}
