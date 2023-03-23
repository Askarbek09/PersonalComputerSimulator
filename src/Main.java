import java.sql.SQLOutput;

public class Main {

   public static void main(String[]args){
      ComputerCase theCase = new ComputerCase("2208","Dell", "240");
      Monitor theMonitor = new Monitor("27inch", "Acer,", 27, "2549" );
      Motherboard theMotherBoard = new Motherboard("bega", "yrys", 5, 24,"Shama");
      PersonalComputer thePC = new PersonalComputer("2208","Dell",theCase, theMonitor, theMotherBoard );
      thePC.getMotherboard().loadProgram("MAcOs");
      thePC.getMonitor().drawPixelAt(15,25, "yellow");

   }
}
