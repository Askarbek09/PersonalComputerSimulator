public class PersonalComputer extends product {
    private ComputerCase computerCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public ComputerCase getComputerCase() {
        return computerCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public PersonalComputer(String model, String manufacturer, ComputerCase computerCase,
                            Monitor monitor, Motherboard motherboard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
    public void drawLogo(){
        monitor.drawPixelAt(1200,50,"black");
    }
    public void powerUp(){
        computerCase.pressPowerButton();
        drawLogo();
    }
}
