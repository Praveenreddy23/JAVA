package Logical.Program;

import javax.sound.sampled.*;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AudioPlayer {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

       /*
           Scanner scanner = new Scanner(System.in);

        File file = new File("Mastaru_Mastaru.wav");

        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);

        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        clip.start();

        String res = scanner.nextLine();

        */

        System.out.println("-----------OR------------");

        Scanner scan = new Scanner(System.in);

        File f = new File("Mastaru_Mastaru.wav");

        AudioInputStream audioStream = null;

        {
            try {
                audioStream = AudioSystem.getAudioInputStream(f);
            } catch (UnsupportedAudioFileException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            Clip c = AudioSystem.getClip();
            try {
                c.open(audioStream);
                c.start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (LineUnavailableException e) {
            e.printStackTrace();

        }
        String response = scan.nextLine();

    }
}
