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
public class Node50 extends Node {

    @Override
    public void getCurrency(Currency currency, Map<String, Integer> map) throws BankNotesNotFound {
        if (currency.getAmount() >= 50) {
            int a = currency.getAmount() / 50;
            int b = currency.getAmount() % 50;
            if (a < ammountOfBanknotes) {
                map.put("50", a);
                ammountOfBanknotes -= a;
            } else {
                map.put("50", ammountOfBanknotes);
                b += (a - ammountOfBanknotes) * 50;
                ammountOfBanknotes = 0;
            }
            if (b != 0 && next != null) {
                next.getCurrency(new Currency(b), map);
            }
        } else {
            map.put("50", 0);
            if (next != null) {
                next.getCurrency(currency, map);
            }
        }
    }
    @Override
    public String toString() {
        return "Node50 : "+ammountOfBanknotes;
    }

}
