package M_MethodOverriding;
class Phone{
	void call() {
		System.out.println("Normal Call");
	}
}
class SmartPhone extends Phone{
	@Override
	protected void call() {
		System.out.println(" HD - Call");
	}
	void voiceNote() {
		System.out.println("Voice Message");
	}
	public void videocall() {
		System.out.println("Normal Video call");
	}
}
class Smart5g_Phone extends SmartPhone{
	@Override
	public void call() {
		System.out.println("Volte -HD -Voice Call");
	}
	@Override
	public void videocall() {
		System.out.println("Hd - Video call");
	}
}
public class AccessModifierOverMEthodOverriding {
public static void main(String[] args) {
	Smart5g_Phone s1 = new Smart5g_Phone();
	s1.call();
	s1.voiceNote();
	s1.videocall();
	System.out.println(" ============ ");
	SmartPhone s2 = new SmartPhone();
	s2.call();
	s2.voiceNote();
	s2.videocall();
}
}
