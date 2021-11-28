package Respuestas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author Gonzalo
 */
public class RespuestaPasswdAdvicce extends Player implements Runnable {

    /**
     * Cosntructor audio de Respuesta a necesitas una contraseña
     *
     * @throws JavaLayerException
     * @throws FileNotFoundException
     */
    public RespuestaPasswdAdvicce() throws JavaLayerException, FileNotFoundException {
        super(new FileInputStream("mp3/passwdAdvice.mp3"));
    }

    @Override
    public void run() {
        try {
            play();
        } catch (JavaLayerException ex) {

        }
    }
}
