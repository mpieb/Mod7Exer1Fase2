package Mod7Exer1Fase2;

public class NewMain {

    public static void main(String[] args) {
        Car nouCotxe = new Car("2345", "GMT", "Alfa Mateu", "Blanc");
    try{
    nouCotxe.setNombre("2345");
    }catch(Exception e){
        System.out.println("S´han de possar cuatre nombres enters!");
    }
    
    try{
    nouCotxe.setLletres("GMT");   
    }catch(Exception e){
        System.out.println("S´han de possar dos o tres lletres majúscules");
    }
    
    System.out.println("El cotxe té matrícula: " + nouCotxe.getMatriculaNombre()+
            " " + nouCotxe.getMatriculaChar()+ ", de marca: " +
             nouCotxe.getMarca()+ ", i color: " + nouCotxe.getColor());
    
    Wheel rodesTraseres = new Wheel("Parelli", 1.2);
    try{
        rodesTraseres.setDiametre(1.2);
    }catch(Exception e){
        System.out.println("El diàmetre de les rodes traseres ha de ser major de 0,4 i menor de 4");
    }
    System.out.println("Les dues rodes traseres són de marca: " +
            rodesTraseres.getMarca()+ ", i tenen: " +
            rodesTraseres.getDiametre() + " de diàmetre.");
    
    Wheel rodesDavanteres = new Wheel("Machelin", 1.4);
    try{
        rodesDavanteres.setDiametre(1.4);
    }catch(Exception e){
        System.out.println("El diàmetre de les rodes davanteres ha de ser major de 0,4 i menor de 4");
    }
    System.out.println("Les dues rodes davanteres són de marca: " +
            rodesDavanteres.getMarca()+ ", i tenen: " +
            rodesDavanteres.getDiametre() + " de diàmetre.");
    }
}


