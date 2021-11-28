package Respuestas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author Gonzalo
 */
public class RespuestaFuncionNodisponible extends Player implements Runnable {

    /**
     *Cosntructor audio de Respuesta a Funcion no disponible
     * @throws JavaLayerException
     * @throws FileNotFoundException
     */
    public RespuestaFuncionNodisponible() throws JavaLayerException, FileNotFoundException {
        super(new FileInputStream("mp3\\funcNodisponible.mp3"));
    }

    @Override
    public void run() {
        try {
            play();
        } catch (JavaLayerException ex) {

        }
    }

}
