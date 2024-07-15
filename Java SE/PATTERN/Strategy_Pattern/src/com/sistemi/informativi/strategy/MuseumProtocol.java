package com.sistemi.informativi.strategy;

public class MuseumProtocol implements Strategy{

    @Override
    public String getProtocol() {

        return "museum" + Math.random();
    }
}
