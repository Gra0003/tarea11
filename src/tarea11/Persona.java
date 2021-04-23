/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea11;

/**
 *
 * @author gemar
 */
public class Persona {
    int edad;
    
    public Persona (){
        
    }
    
    public Persona (int edad){
        this.edad=edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        try{
            if (edad<0){
                throw new Exception ("La edad no puede ser inferior a 0.");
            }else{
                this.edad = edad;
                throw new Exception ("La edad es correcta");
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        
    }




}
