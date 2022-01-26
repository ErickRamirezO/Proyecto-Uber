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
    DBCollection coleccion,coleccion2;
    //Creo un documento
    BasicDBObject documento = new BasicDBObject();
    
    //Un constructor
    public Conexion(){
        MongoClient mongo = new MongoClient("localhost",27017);
        //Obtenemos la base de datos con getDB
        baseDatos = mongo.getDB("ServicioDomesticoUber");
        //Creamos dos colecciones una para los cliente y otra para los empleados
        coleccion = baseDatos.getCollection("cliente");
        coleccion2 = baseDatos.getCollection("empleado");
        //Mandamos un mensaje verificando la conexión a la base de datos.
        System.out.println("Conexión a Base de Datos exitoso");
    }   
}
