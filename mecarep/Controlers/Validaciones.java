/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mecarep.Controlers;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Usuario
 */
public class Validaciones {
    public static void validarNombre(String nombres) throws ErrorValidaciones{
        String regex = "^[A-Za-zÁÉÍÓÚáéíóúÑñ]+(\\s[A-Za-zÁÉÍÓÚáéíóúÑñ]+)*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(nombres);
        if (!matcher.matches()){
            throw new ErrorValidaciones("Los Nombres ingresados son Inválidos");
        }
    }
    public static void validarApellido(String apellidos) throws ErrorValidaciones{
        String regex = "^[A-Za-zÁÉÍÓÚáéíóúÑñ]+(\\s[A-Za-zÁÉÍÓÚáéíóúÑñ]+)*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(apellidos);
        if (!matcher.matches()){
            throw new ErrorValidaciones("Los Apellidos ingresados son Inválidos");
        }
    }
    public static void validarDatosNumericos(String email) throws ErrorValidaciones{
        String regex = "[0-9]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (!matcher.matches()){
            throw new ErrorValidaciones("Ingrese datos Númericos");
        }
    }

    public static void validarCedula(String cedula) throws ErrorValidaciones {  
     int total = 0;  
     int tamanoLongitudCedula = 10;  
     int[] coeficientes = {2, 1, 2, 1, 2, 1, 2, 1, 2};  
     int numeroProviancias = 24;  
     int tercerdigito = 6;  
     if (cedula.matches("[0-9]*") && cedula.length() == tamanoLongitudCedula) {  
       int provincia = Integer.parseInt(cedula.charAt(0) + "" + cedula.charAt(1));  
       int digitoTres = Integer.parseInt(cedula.charAt(2) + "");  
       if ((provincia > 0 && provincia <= numeroProviancias) && digitoTres < tercerdigito) {  
         int digitoVerificadorRecibido = Integer.parseInt(cedula.charAt(9) + "");  
         for (int i = 0; i < coeficientes.length; i++) {  
           int valor = Integer.parseInt(coeficientes[i] + "") * Integer.parseInt(cedula.charAt(i) + "");  
           total = valor >= 10 ? total + (valor - 9) : total + valor;  
         }  
         int digitoVerificadorObtenido = total >= 10 ? (total % 10) != 0 ? 10 - (total % 10) : (total % 10) : total;  
         if (digitoVerificadorObtenido == digitoVerificadorRecibido) {  
             return;
         }
         throw new ErrorValidaciones("Número de Cédula Inválido");
       }  
       throw new ErrorValidaciones("Número de Cédula Inválido");
     }  
     throw new ErrorValidaciones("Número de Cédula Inválido");
   } 
    
    
    public static void validarPassword(String username) throws ErrorValidaciones {
        if (username.length() < 6){
            throw new ErrorValidaciones("La contraseña debe tener 6 caracteres.");
        }
        // Contraseña debe tener letra mayuscula, maniscula, número, caracterEspecial.
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%^&*()_+\\-={}\\[\\]:;\"'<>,.?/\\\\]).+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(username);
        if (!matcher.matches()){
            throw new ErrorValidaciones("Contraseña Inválida");
        }
    }

    public static void validarFecha(Date fecha) {
        if (fecha.compareTo(new Date()) < 0){
            throw new ErrorValidaciones("La fecha escogida no es válida.");
        }
    }
    
    public static void validarDireccionDomiciliaria(String direccion){
        String patron = "^[A-Za-z0-9ÁÉÍÓÚáéíóúÑñ\\s.,#-]+$";

        // Compilar la expresión regular en un patrón
        Pattern pattern = Pattern.compile(patron);

        // Realizar la coincidencia de la dirección con el patrón
        Matcher matcher = pattern.matcher(direccion);    
        if (!matcher.matches()){
            throw new ErrorValidaciones("Dirección Domiciliaria Inválida");
        }          
    }


}

