package classetimer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class ClasseTimer {

    public static void main(String[] args) {
        Timer timer = new Timer();
        final long SECONDS = (1000*5); // a cada 5 segundos
        
        TimerTask tarefa = new TimerTask() {
            @Override
            public void run() {
                // repetir de tempos em tempos
                System.out.println(new Date());
            }
        };
        timer.scheduleAtFixedRate(tarefa, 0, 1000);
        
    }
}
