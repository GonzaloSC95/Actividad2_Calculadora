package Respuestas;

import Vista.Calculadora_Main;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author Gonzalo
 */
public class RespuestaBienvenidaUser extends Player implements Runnable {

    /**
     * Cosntructor audio de Respuesta a Bievenida Usuario
     *
     * @throws JavaLayerException
     * @throws FileNotFoundException
     */
    public RespuestaBienvenidaUser() throws JavaLayerException, FileNotFoundException {
        super(new FileInputStream("mp3\\" + Calculadora_Main.userName.toLowerCase() + ".mp3"));

    }

    @Override
    public void run() {
        try {
            play();
        } catch (JavaLayerException ex) {

        }
    }

}
