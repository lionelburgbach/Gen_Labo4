package heig_vd.labo4;

public class Color {

    private int color;

    public Color(int color){
        this.color = color;
    }

    public String getColor(){
        switch (color) {
            case 1:
                return "blue";
            case 2:
                return "red";
            case 3:
                return "yellow";
            default:
                return "no color";
        }
    }
}
