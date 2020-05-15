package metodos;

public class Persona {
    /**************************************************************************************/
                                     //Atributos
    //Atributos de la Clase Persona
    private String nombre = "";
    private int edad ;
    private String DNI;//Será automático , ya que será dado por un método
    private char sexo;//Será un char porque queremos saber si es H (hombre) o M (mujer)
    private double peso;
    private double altura;
    /*************************************************************************************/
                                    //Contructores
    //Constructor por Defecto.
    public Persona(){
        generaDNI();
        comprobarSexo(getSexo());
    }
    
    //Constructor con los valores nombre, edad, sexo
    public Persona( String nombre,int edad, char sexo ){
        this.nombre = nombre;
        this.edad = edad;
        comprobarSexo(sexo);
        generaDNI();
    }
    
    //Constructor con todos los valores (DNI se genera de forma aleatoria en el método).
    public Persona( String nombre,int edad, char sexo, double peso, double altura ){
        this.nombre = nombre;
        this.edad = edad;
        comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
        generaDNI();
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
        
 
        
        int test = -1;
        
        if( formula>=20 && formula<=25 ){
            test = 0;
        }else if( formula>25 ){
            test = 1;
        }
        
        return test;
    }
    //Método personal referente a (calcularIMC)
    
    //Descripción:
    
    public void indicarFormaFisica(){
        if(calcularIMC() == 1){
            System.out.println("Está sobre su peso ideal.");
        }else if(calcularIMC() == 0){
            System.out.println("Está en su peso ideal.");
        }else if(calcularIMC() == -1){
            System.out.println("Está por debajo de su peso ideal.");
        }else{
            System.out.println("Error");
        }
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

        textoADevolver = "Atributos de la persona:" +
                         "\n Nombre → " + getNombre() +
                         "\n Edad → " + getEdad() +
                         "\n Sexo → " + getSexo() +
                         "\n DNI → " + getDNI() +
                         "\n Peso → " + getPeso() +
                         "\n Altura → " + getAltura();

        return textoADevolver;
    }
    
    

   private void generaDNI(){
        
        int arrayCaracteres[];
        arrayCaracteres = new int[8];
        String numero = "";
       
        for(int i = 0;i<arrayCaracteres.length;i++){
            int aleatorio = (int) (Math.random()*10);
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
        this.DNI = numero + letraDNI;
    }
   
   /*********************************************************************************************/
   /*                               Método personal:
   *Descripción:
                Método creado por nosotros, para imprimir la mayoría de edad ,
                que recibimos mediante un boolean de otro Método(esMayorDeEdad)
   */
   public void imprimirMayoriaEdad(){
       if(esMayorDeEdad() == true){
           System.out.println("Es mayor de edad");
       }else{
           System.out.println("Es menor de edad");

       }
       
   }
   
   
   
   
   
}
