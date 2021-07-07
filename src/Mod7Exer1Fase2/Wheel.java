package Mod7Exer1Fase2;

class Wheel {
    private String brand;
    private double diameter;

    public Wheel(String brand, double diameter) {
        this.brand = brand;
        this.diameter = diameter;
    }
    
    public void setMarca(String brand){
        this.brand = brand;
    }
    
    public String getMarca(){
        return brand;
    }
    
    public void setDiametre(double diameter) throws Exception{
        if(diameter < 0.4 || diameter > 4){
            throw new Exception();
        }else{
            this.diameter = diameter;
        }
    }

    public double getDiametre(){
        return diameter;
    }
}
