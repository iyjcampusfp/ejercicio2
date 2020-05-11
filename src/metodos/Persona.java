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
    
    public int calcularIMC(){
        
        final double formula = getPeso()/(getAltura()*getAltura());
        
        System.out.println( formula );
        
        int test = -1;
        
        if( formula>=20 && formula<=25 ){
            test = 0;
        }else if( formula>25 ){
            test = 1;
        }
        
        return test;
    }
    
    public boolean esMayorDeEdad(){
        boolean mayoria = false;
        
        if(getEdad() >=18){
            mayoria = true;
        }
        
        return mayoria;
    }
    
    private void comprobarSexo(char sexo){
        //Constante para comprobar que el sexo por defecto sea Hombre
        //y en caso de que sea M, sería mujer. Por ejemplo, si se introduce S,
        //daría Hombre.
        
        final char prueba = 'H';
        
        if( sexo != 'M' ){
            setSexo( prueba );
        }else{
            setSexo( sexo );
        }
    }
    
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
    
    

 private void generaDNI(){
        String DNI;


        int arrayCaracteres[];
        arrayCaracteres = new int[8];
        String numero = "";
       
        for(int i = 0;i<arrayCaracteres.length;i++){
            int aleatorio = (int) (Math.random()*10);
            System.out.println("Aleatorio : " + aleatorio);
            arrayCaracteres[i] = aleatorio;
            numero  +=  arrayCaracteres[i];
           
        }
        int calculo =Integer.parseInt(numero);
        //Calcular letra:
        calculo = calculo % 23;
       
        //Letra
        String letraDNI = "";
             
        switch(calculo){
            case 0:
                letraDNI = "T";
                break;
            case 1:
                letraDNI = "R";
                break;
            case 2:
                letraDNI = "W";
                break;
            case 3:
                letraDNI = "A";
                break;
            case 4:
                letraDNI = "G";
                break;
            case 5:
                letraDNI = "M";
                break;
            case 6:
                letraDNI = "Y";
                break;
            case 7:
                letraDNI = "F";
                break;
            case 8:
                letraDNI = "P";
                break;
            case 9:
                letraDNI = "D";
                break;
            case 10:
                letraDNI = "X";
                break;
            case 11:
                letraDNI = "B";
                break;
            case 12:
                letraDNI = "N";
                break;
            case 13:
                letraDNI = "J";
                break;  
            case 14:
                letraDNI = "Z";
                break;
            case 15:
                letraDNI = "S";
                break;
            case 16:
                letraDNI = "Q";
                break;  
            case 17:
                letraDNI = "V";
                break;
            case 18:
                letraDNI = "H";
                break;
            case 19:
                letraDNI = "L";
                break;
            case 20:
                letraDNI = "C";
                break;
            case 21:
                letraDNI = "K";
                break;
            case 22:
                letraDNI = "E";
                break;    
        }
        //DNI Final
        DNI = numero + letraDNI;
        System.out.println("DNI : "+ DNI);
    }

}
