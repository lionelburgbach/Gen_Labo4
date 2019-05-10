package heig_vd.labo4;

public class Size {

    private int size;

    public Size(int size){
        this.size = size;
    }

    public String getSize(){
        switch (size) {
            case 1:
                return "XS";
            case 2:
                return "S";
            case 3:
                return "M";
            case 4:
                return "L";
            case 5:
                return "XL";
            case 6:
                return "XXL";
            default:
                return "Invalid Size";
        }
    }
}
