package com.sistemi.informativi.main;

import com.sistemi.informativi.strategy.CinemaProtocol;
import com.sistemi.informativi.strategy.Context;
import com.sistemi.informativi.strategy.MuseumProtocol;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     Context context = new Context(new CinemaProtocol());
     System.out.println(context.performStrategy());

    }
}