package ajedrez;

public abstract class Pieza {
    private String location;
    private String color;
    private String name;
    private Boolean captured;

    public void doMovement(String location){
        if (checkNewLocation()){
            this.location = location;
            if (checkCapture()){
                System.out.println("capturada");
                // doCapture();
            }

        }
    }

    private boolean checkNewLocation(){
        // check location
        return true;
    }
    

    private boolean checkCapture(){
        // check caputre
        return true;
    }

}

