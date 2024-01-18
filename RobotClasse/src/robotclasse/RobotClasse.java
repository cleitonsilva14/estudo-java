package robotclasse;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;


public class RobotClasse {

    public static void main(String[] args) throws AWTException {

        try{
            Robot jarvis = new Robot();
            jarvis.delay(1000);
            
            /*jarvis.mouseMove(0, 800); // x e y. Vai para o menu iniciar
            
            jarvis.mousePress(InputEvent.BUTTON1_MASK); // clica
            jarvis.mousePress(InputEvent.BUTTON1_MASK); // clica
            jarvis.mouseRelease(InputEvent.BUTTON1_MASK); // solta o clique
            jarvis.delay(2000);
            jarvis.keyPress(KeyEvent.VK_N);
            jarvis.keyRelease(KeyEvent.VK_N);
            jarvis.delay(2000);
            jarvis.keyPress(KeyEvent.VK_WINDOWS);
            jarvis.delay(2000);
            jarvis.keyRelease(KeyEvent.VK_WINDOWS);
            jarvis.delay(2000);
            */
            
            // Abrir o cmd
            jarvis.keyPress(KeyEvent.VK_WINDOWS);
            jarvis.keyPress(KeyEvent.VK_R);
            jarvis.delay(2000);
            jarvis.keyRelease(KeyEvent.VK_WINDOWS);
            jarvis.keyRelease(KeyEvent.VK_R);
            jarvis.delay(2000);
            jarvis.keyPress(KeyEvent.VK_ENTER);
            jarvis.keyRelease(KeyEvent.VK_ENTER);
            
            //digitar python
            jarvis.delay(500);
            jarvis.keyPress(KeyEvent.VK_P);
            jarvis.keyRelease(KeyEvent.VK_P);
            jarvis.delay(500);
            jarvis.keyPress(KeyEvent.VK_Y);
            jarvis.keyRelease(KeyEvent.VK_Y);
            jarvis.delay(500);
            jarvis.keyPress(KeyEvent.VK_T);
            jarvis.keyRelease(KeyEvent.VK_T);
            jarvis.delay(500);
            jarvis.keyPress(KeyEvent.VK_H);
            jarvis.keyRelease(KeyEvent.VK_H);
            jarvis.delay(500);
            jarvis.keyPress(KeyEvent.VK_O);
            jarvis.keyRelease(KeyEvent.VK_O);
            jarvis.delay(500);
            jarvis.keyPress(KeyEvent.VK_N);
            jarvis.keyRelease(KeyEvent.VK_N);
            jarvis.delay(500);
            jarvis.keyPress(KeyEvent.VK_ENTER);
            jarvis.keyRelease(KeyEvent.VK_ENTER);
            jarvis.keyPress(KeyEvent.VK_1);
            jarvis.keyRelease(KeyEvent.VK_1);
            jarvis.delay(500);
            jarvis.keyPress(KeyEvent.VK_ADD);
            jarvis.keyRelease(KeyEvent.VK_ADD);
            jarvis.delay(500);
            jarvis.keyPress(KeyEvent.VK_2);
            jarvis.keyRelease(KeyEvent.VK_2);
            jarvis.delay(500);
            jarvis.keyPress(KeyEvent.VK_ENTER);
            jarvis.keyRelease(KeyEvent.VK_ENTER);
            jarvis.delay(500);
            jarvis.keyPress(KeyEvent.VK_CONTROL);
            jarvis.keyPress(KeyEvent.VK_Z);
            jarvis.keyRelease(KeyEvent.VK_CONTROL);
            jarvis.keyRelease(KeyEvent.VK_Z);
            jarvis.keyPress(KeyEvent.VK_ENTER);
            jarvis.keyRelease(KeyEvent.VK_ENTER);
        }catch(AWTException ex){
            System.err.println("Erro: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
