/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

//Clase para la conexión con la base de datos

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;


public class Conexion {
    //Creo una base de datos
    DB baseDatos;
    //Creamos un objeto de tipo colección
    DBCollection coleccion;
    //Creo un documento
    BasicDBObject documento = new BasicDBObject();
    
    //Un constructor
    public Conexion(){
        MongoClient mongo = new MongoClient("localhost",27017);
        //Obtenemos la base de datos con getDB
        baseDatos = mongo.getDB("ServicioDomesticoUber");
        //Obtenemos la colección
        coleccion = baseDatos.getCollection("proveedores");
        //Mandamos un mensaje verificando la conexión a la base de datos.
        System.out.println("Conexión a Base de Datos exitoso");
    }   
}
