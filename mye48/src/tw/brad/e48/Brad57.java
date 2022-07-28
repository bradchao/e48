package tw.brad.e48;

import java.util.Timer;
import java.util.TimerTask;

public class Brad57 {

	public static void main(String[] args) {
		Timer timer = new Timer();
		MyTask m1 = new MyTask();
		StopTask s1 = new StopTask(timer);
		timer.schedule(m1, 0, 1*1000);
		timer.schedule(s1, 10*1000);
		System.out.println("Brad");
	}
	

}

class MyTask extends TimerTask {
	int i;
	@Override
	public void run() {
		System.out.println(i++);
	}
}
class StopTask extends TimerTask {
	private Timer timer;
	StopTask(Timer timer){this.timer = timer;}
	@Override
	public void run() {
		timer.cancel();
	}
}

