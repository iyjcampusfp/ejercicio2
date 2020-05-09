package metodos;

public class Persona {
    /**************************************************************************************/
                                     //Atributos
    //Atributos de la Clase Persona
    private String nombre;
    private int edad;
    private String DNI;//Será automático , ya que será dado por un método
    private char sexo;//Será un char porque queremos saber si es H (hombre) o M (mujer)
    private double peso;
    private double altura;
    /*************************************************************************************/
                                    //Contructores
    //Constructor por Defecto.
    public Persona(){
        
    }
    
    //Constructor con los valores nombre, edad, sexo
    public Persona( String nombre,int edad, char sexo ){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    //Constructor con todos los valores (DNI se genera de forma aleatoria en el método).
    public Persona( String nombre,int edad, char sexo, double peso, double altura ){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }    
    
    /**************************************************************************************/
                                    //Getters y Setters
    //Getters 
    public String getNombre(){
        return this.nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    public String getDNI(){
        return this.DNI;
    }

    public char getSexo(){
        return this.sexo;
    }

    public double getPeso(){
        return this.peso;
    }

    public double getAltura(){
        return this.altura;
    }
    
    //Setters (No hay setDNI)
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
       
    
    /***************************************************************************************/
                                    //Métodos Personales
    
    @Override
    public String toString(){
        String textoADevolver;
        
        if( "".equals(getNombre()) ){
            textoADevolver = "Atributos de la persona:" +
                             "Sexo → " + getSexo() +
                             "DNI → " + getDNI();
        }else{
            textoADevolver = "Atributos de la persona:" +
                             "Nombre → " + getNombre() +
                             "Edad → " + getEdad() +
                             "Sexo → " + getSexo() +
                             "DNI → " + getDNI() +
                             "Peso → " + getPeso() +
                             "Altura → " + getAltura();
        }
        
        return textoADevolver;
    }
    
    
    
}
