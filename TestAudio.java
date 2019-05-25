package OutSide;

import LamViecNhom.GameMain;
import LamViecNhom.SoundButton.EnableSoundMain;
import LamViecNhom.SoundButton.MuteSound;
import LamViecNhom.SoundButton.WorkWithSound;

public class TestAudio {

	public static void main(String[] args) {
		GameMain g=GameMain.getInstance();
		WorkWithSound w=EnableSoundMain.getInstance();
		w.action(g); // Khi goi ham nay, am thanh se duoc bat len
		
		
		w=MuteSound.getInstance();
		w.action(g); // Khi goi ham nay, am thanh se tat
		

	}

}
