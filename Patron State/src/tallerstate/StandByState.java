/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerstate;

/**
 *
 * @author Tonny
 */
public class StandByState implements State {

    @Override
    public void pressPlay() {
        System.out.println("pausando el video");
    }

}
