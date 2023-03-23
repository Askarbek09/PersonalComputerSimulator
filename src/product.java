public class product {
    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int depth;
    public product (String model, String manufacturer){
        this.model = model;
        this.manufacturer = manufacturer;

    }
}
class Monitor extends product{
    private int size;
    private String resolution;

    public Monitor(String model, String manufacturer, int size, String resolution) {
        super(model, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }

    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.println(String.format("Draw pixel at%d, %d in color %s", + x, y, color));

    }
}
class Motherboard extends product{
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public Motherboard(String model, String manufacturer) {
        super(model, manufacturer);
    }
    public void loadProgram(String programName){
        System.out.println("Program" + programName);
    }
}
class ComputerCase extends product{
    private String powerSupply;
    public ComputerCase(String model,  String manufacturer) {
        super(model, manufacturer);
    }
    public ComputerCase(String powerSupply, String model, String manufacturer){
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }
    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }
}