package com.example.juegomemoria.utlidades;

public class Utilidades {
    //VARIABLES TABLA USUARIO
    public static final String USUARIO="USUARIO";
    public static final String USERNAME="USERNAME";
    public static final String NOMBRE="NOMBRE";
    public static final String APELLIDO="APELLIDO";
    public static final String PASSWORD="PASSWORD";

    //VARIABLES TABLA IMAGEN
    public static final String IMAGEN="IMAGEN";
    public static final String ID_IMAGEN="ID_IMAGEN";
    public static final String NOMBRE_IMAGEN="NOMBRE_IMAGEN";
    public static final String RELACION="RELACION";

    //VARIABLES TABLA RANKING
    public static final String RANKING="RANKING";
    public static final String ID_RANKING="ID_RANKING";
    public static final String USERNAME_RANKING="USERNAME";
    public static final Integer PUNTAJE=0;

    public static final String TABLA_USUARIO="CREATE TABLE "+USUARIO+"("+USERNAME+" TEXT PRIMARY KEY,"+NOMBRE+" TEXT,"+APELLIDO+" TEXT,"+PASSWORD+" TEXT)";
    //public static final String TABLA_IMAGEN="CREATE TABLE "+IMAGEN+"("+ID_IMAGEN+" INTEGER PRIMARY KEY,"+NOMBRE_IMAGEN+"TEXT,"+RELACION+"INTEGER)";
    //public static final String TABLA_RANKING="CREATE TABLE "+RANKING+"("+ID_RANKING+" TEXT PRIMARY KEY,"+USERNAME_RANKING+"TEXT,"+PUNTAJE+"INTEGER)";
}
