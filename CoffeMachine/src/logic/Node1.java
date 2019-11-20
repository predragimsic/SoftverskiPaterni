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
public class Node1 extends Node{

    @Override
    public void getCurrency(Currency currency, Map<String, Integer> map) throws BankNotesNotFound {
        if (currency.getAmount() >= 1) {
            if (currency.getAmount() <= ammountOfBanknotes) {
                map.put("1", currency.getAmount());
                ammountOfBanknotes -= currency.getAmount();
            } else {
                System.err.println(currency.getAmount() + "   " + ammountOfBanknotes);
                map.put("1", ammountOfBanknotes);
                ammountOfBanknotes = 0;
                throw new BankNotesNotFound("The machine does not have enough banknotes! " + (currency.getAmount() - map.get("1")) + " cents short!");
            }
        } else {
            map.put("1", 0);
        }
    }

    @Override
    public String toString() {
        return "Node1 : "+ammountOfBanknotes;
    }
    
    
}
