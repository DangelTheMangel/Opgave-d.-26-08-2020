import processing.core.PApplet;
import processing.data.Table;

public class main extends PApplet {
    
    Table land;
    public static void main(String[] args) {
        PApplet.main("main");
    }

    @Override
    public void setup() {
        land = loadTable("deathsnaturaldisasters.csv");

        for(int i = 1; i < land.getRowCount(); ++i){
            println("fuck");
            println("Land: " + land.getString(i, 1));

            for(int j = 2; j <= land.getColumnCount() -1; ++j){

                println("Årstal: " + land.getString(0, j) + " Antal døde: " + land.getString(i, j) );

            }
            println("                    ");
        }
    }
}
