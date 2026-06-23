/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package autobots.factory;

import autobots.model.Autobot;

/**
 *
 * @author japa
 */
public interface AutobotFactory {
    public Autobot summonAutobot(String robot);
    public abstract Autobot createAutobot(String robot);
}
