/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kapitel.Kapitel1_StrategyMuster.Code_EntenKapselnUnterschiedlichenVerhaltens;

/**
 *
 * @author silas
 */
public class FliegtRaketenGetrieben implements FlugVerhalten {
    
    public void fliegen() {
        System.out.println("Ich fliege mit Duesenantrieb!");
    }
}
