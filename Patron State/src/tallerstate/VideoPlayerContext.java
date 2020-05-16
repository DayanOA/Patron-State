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
public class VideoPlayerContext {

    private State miState;

    public void setState(State s) {

        this.miState = s;
    }

    public void pressPlay() {

        miState.pressPlay();

    }

}
