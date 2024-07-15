package com.sistemi.informativi.strategy;

public class Context {


    private Strategy strategy;

    /**
     *
     * @param strategy
     * parametro passato in input
     * dall'Applicazione invocante
     * sotto forma di strategia concreta
     * (MuseumProtocol o CinemeProtocol)
     * assumerà la forma del figlio corretto
     * che rappresenterà l'implementazione
     * concreta della specifica strategia da
     * attuare sulla base della richiesta fatta
     * dall'Applicazione invocante stessa
     */
    public Context(Strategy strategy){

        this.strategy = strategy;

    }

    /**
     *
     * @return
     * numero di protocollo restituito
     * da una delle due Classi che rappresentano
     * le concrete stratefie di implementazione,
     * entrambe figlie dell'Interfaccia Strategy
     */
    public String performStrategy(){
        /*
        strategy assumerà la forma del figlio
        Strategia richiesto nello specifico
        dall'Appliczione invocante
         */
        return strategy.getProtocol();
    }



}
