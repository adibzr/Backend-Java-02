package dto;

public class UserDTO {
    private String nombreApellido;
    private String mail;
    private String departmentName;

    public UserDTO(String nombreApellido, String mail) {
        this.nombreApellido = nombreApellido;
        this.mail = mail;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "nombreApellido='" + nombreApellido + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
