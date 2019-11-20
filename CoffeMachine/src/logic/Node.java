/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import domain.Currency;
import exception.BankNotesNotFound;
import java.util.Map;

/**
 *
 * @author predr
 */
public abstract class Node {

    protected int ammountOfBanknotes;
    protected Node next;

    public abstract void getCurrency(Currency currency, Map<String, Integer> map) throws BankNotesNotFound;

    public void setNext(Node cvor) {
        next = cvor;
    }

    public Node getNext() {
        return next;
    }

    public int getAmmountOfBanknotes() {
        return ammountOfBanknotes;
    }

    public void addBanknotes(int ammountOfBanknotes) {
        this.ammountOfBanknotes = this.ammountOfBanknotes + ammountOfBanknotes;
    }

  
}
