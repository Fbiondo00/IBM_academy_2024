package com.sistemi.informativi.main;

import com.sistemi.informativi.singleton.Product;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
        Il metodo getProduct restituisce una
        reference che referenzia già un Oggetto
        la cui logica di creazione è stata
        già implementata all'interno della
        Classe Product
        Invocando il metodo getProduct() viene
        ritornata una reference ad un Oggetto
        già creato
         */
       Product product1 = Product.getProduct();

       /*
       La seconda volta che viene invocato il
       metodo getProduct() non viene allocata
       un'altra area di memoria all'interno dell'HEAP
       ma esiste solo l'Oggetto creato precedentemente
        */
       Product product2 = Product.getProduct();

       System.out.println(product1.toString());

       System.out.println(product2.toString());

        }
    }
