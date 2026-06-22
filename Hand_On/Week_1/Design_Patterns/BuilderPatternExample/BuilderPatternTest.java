public class BuilderPatternTest {
    public static void main(String[] args) {
        Computer gamingPc = new Computer.Builder()
                                .setCpu("Intel i9")
                                .setRam(32)
                                .setStorage(1024)
                                .setGpu("RTX 4090")
                                .setBluetooth(true)
                                .build();
        
        Computer officePC = new Computer.Builder()
                                .setCpu("Intel i5")
                                .setRam(8)
                                .setStorage(256)
                                .setBluetooth(false)
                                .build();
        gamingPc.display();
        officePC.display();
    }    
}
