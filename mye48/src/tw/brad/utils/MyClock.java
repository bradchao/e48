package tw.brad.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;

public class MyClock extends JLabel {
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private Timer timer;
	
	public MyClock() {
		timer = new Timer();
		timer.schedule(new ClockTask(), 0, 1000);
	}
	
	private class ClockTask extends TimerTask {
		@Override
		public void run() {
			setText(sdf.format(new Date()));
		}
	}

}
