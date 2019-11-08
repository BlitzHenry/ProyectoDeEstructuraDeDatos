public class NodoCola {
    
    
    
    // Atributos del paciente. 
    private String nombredelpaciente; 
    private int altura; 
    private int edad; 
    private String enfermedad; 
    
    
    private NodoCola returnar; 
    
    //Constructor, donde vamos de redifinir los atributos.
    public NodoCola(String nombre,int alt, int edad,String enfermedad) {
         
         this.nombredelpaciente = nombre; 
         this.altura = alt; 
         this.edad = edad; 
         this.enfermedad = enfermedad; 
      
    }

   // Utilizamos los metodos get = para mostrar. 
   // Utilzamos los metodos set = para modificar. 
   
   // Los modificadores de acceso seran public ya haremos mostrar y modificar fuera de la clase. 
    
    public String getNombredelpaciente() {
        return nombredelpaciente;
    }

    public void setNombredelpaciente(String nombredelpaciente) {
        this.nombredelpaciente = nombredelpaciente;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public NodoCola getReturnar() {
        return returnar;
    }

    public void setReturnar(NodoCola returnar) {
        this.returnar = returnar;
    }
    
    
// Nota: Metodo para returnar los valores de get y set 

}
