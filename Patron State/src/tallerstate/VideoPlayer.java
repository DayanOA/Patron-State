/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerstate;

import java.util.Scanner;

/**
 *
 * @author Tonny
 */
public class VideoPlayer {

    /**
     * @param args the command line arguments
     */
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        VideoPlayerContext videoplay = new VideoPlayerContext();
        BeginningState iniciando = new BeginningState();
        StandByState pausando = new StandByState();
        PlayingState reproduciendo = new PlayingState();
        FinishState finalizando = new FinishState();
        int opcion;

        do {

            opcion = muestraMenu();
            switch (opcion) {
                case 1:
                    videoplay.setState(iniciando);
                    break;
                case 2:
                    videoplay.setState(pausando);
                    break;
                case 3:
                    videoplay.setState(reproduciendo);
                    break;
                case 4:
                    videoplay.setState(finalizando);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Opción invalida");
            }
            if (opcion >= 0 && opcion <= 4) {
                videoplay.pressPlay();
            }

        } while (opcion != 0);

    }

    private static int muestraMenu() {
        System.out.print(
                "\nSELECCIONE EL ESTADO DEL VIDEO REPRODUCTOR"
                + "\n1. INICIAR."
                + "\n2. PAUSAR."
                + "\n3. REPRODUCIR."
                + "\n4. FINALIZAR."
                + "\n0. SALIR."
                + "\nSeleccione opción:\n "
        );
        return Integer.parseInt(sc.nextLine());
    }

}
