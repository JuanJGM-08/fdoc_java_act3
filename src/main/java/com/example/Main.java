package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
        ejercicio7();
        ejercicio8();
        ejercicio9();
        ejercicio10();
    }
    
    // Ejercicio 1: Creación y Operaciones Básicas con ArrayList
    public static void ejercicio1() {
        System.out.println("EJERCICIO 1: OPERACIONES BÁSICAS");
        
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");
        frutas.add("Pera");
        
        frutas.add(2, "Uva");
        String primeraFruta = frutas.get(0);
        System.out.println("Primera fruta: " + primeraFruta);
        frutas.set(3, "Kiwi");
        System.out.println("Tamaño de la lista: " + frutas.size());
        System.out.println("Lista completa: " + frutas);
        System.out.println();
    }
    
    // Ejercicio 2: Eliminación de Elementos
    public static void ejercicio2() {
        System.out.println("=== EJERCICIO 2: ELIMINACIÓN DE ELEMENTOS ===");
        
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 20));

        numeros.remove(2);
        numeros.remove(Integer.valueOf(20));
        boolean contiene40 = numeros.contains(40);
        System.out.println("¿Contiene 40? " + contiene40);
        System.out.println("Tamaño final: " + numeros.size());
        System.out.println("Lista resultante: " + numeros);
        System.out.println();
    }
    
    // Ejercicio 3: Recorrido con For Tradicional
    public static void ejercicio3() {
        System.out.println("=== EJERCICIO 3: RECORRIDO CON FOR TRADICIONAL ===");
        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Ana", "Luis", "María", "Carlos", "Elena"));
        
        int contador = 0;
        for (int i = 0; i < nombres.size(); i++) {
            String nombre = nombres.get(i);
            System.out.println("Posición " + i + ": " + nombre);
            if (nombre.length() > 4) {
                contador++;
            }
        }
        System.out.println("Nombres con más de 4 caracteres: " + contador);
        System.out.println();
    }
    
    // Ejercicio 4: Recorrido con For-Each
    public static void ejercicio4() {
        System.out.println("=== EJERCICIO 4: RECORRIDO CON FOR-EACH ===");
        ArrayList<Double> valores = new ArrayList<>(Arrays.asList(15.5, 23.8, 9.2, 31.7, 12.4));
        double suma = 0;
        double maximo = Double.MIN_VALUE;
        double minimo = Double.MAX_VALUE;
        
        for (double valor : valores) {
            suma += valor;
            if (valor > maximo) maximo = valor;
            if (valor < minimo) minimo = valor;
        }
        double promedio = suma / valores.size();

        System.out.println("Suma: " + suma);
        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
        System.out.println("Promedio: " + promedio);
        System.out.println();
    }
    
    // Ejercicio 5: Uso de Iterator para Eliminación Segura
    public static void ejercicio5() {
        System.out.println("=== EJERCICIO 5: ITERATOR PARA ELIMINACIÓN SEGURA ===");
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }
        System.out.println("Lista antes: " + numeros);
    
        Iterator<Integer> it = numeros.iterator();
        int eliminados = 0;
        while (it.hasNext()) {
            int numero = it.next();
            if (numero % 2 == 0) {
                it.remove();
                eliminados++;
            }
        }
        System.out.println("Lista después: " + numeros);
        System.out.println("Elementos eliminados: " + eliminados);
        System.out.println();
    }
    
    // Ejercicio 6: Métodos de Búsqueda
    public static void ejercicio6() {
        System.out.println("=== EJERCICIO 6: MÉTODOS DE BÚSQUEDA ===");
        ArrayList<String> lenguajes = new ArrayList<>(Arrays.asList("Java", "Python", "C++", "JavaScript", "Python", "Go"));
        int primerPython = lenguajes.indexOf("Python");
        int ultimoPython = lenguajes.lastIndexOf("Python");
        boolean contieneRuby = lenguajes.contains("Ruby");

        List<String> sublista = lenguajes.subList(1, 4);
        
        System.out.println("Primer Python en índice: " + primerPython);
        System.out.println("Último Python en índice: " + ultimoPython);
        System.out.println("¿Contiene Ruby? " + contieneRuby);
        System.out.println("Sublista (1-4): " + sublista);
        System.out.println();
    }
    
    // Ejercicio 7: Ordenamiento de ArrayList
    public static void ejercicio7() {
        System.out.println("=== EJERCICIO 7: ORDENAMIENTO ===");
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(45, 12, 78, 23, 67, 34, 89, 56));
        Collections.sort(numeros);
        System.out.println("Ascendente: " + numeros);
        
        Collections.sort(numeros, Collections.reverseOrder());
        System.out.println("Descendente: " + numeros);

        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Carlos", "Ana", "Elena", "Luis", "María"));
        Collections.sort(nombres);
        System.out.println("Nombres alfabético: " + nombres);
        
        nombres.sort((a, b) -> Integer.compare(a.length(), b.length()));
        System.out.println("Nombres por longitud: " + nombres);
        System.out.println();
    }

    // Ejercicio 8: Operaciones con removeIf
    public static void ejercicio8() {
        System.out.println("=== EJERCICIO 8: REMOVEIF ===");
        
        ArrayList<String> palabras = new ArrayList<>(Arrays.asList("casa", "auto", "bicicleta", "avión", "barco", "tren"));
        
        palabras.removeIf(palabra -> palabra.length() < 5);
        System.out.println("Palabras >= 5 caracteres: " + palabras);
        
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            numeros.add(i);
        }
        
        numeros.removeIf(num -> num % 3 == 0);
        System.out.println("Números no divisibles por 3: " + numeros);
        System.out.println();
    }
    
    // Ejercicio 9: Conversión a Arreglo
    public static void ejercicio9() {
        System.out.println("=== EJERCICIO 9: CONVERSIÓN A ARREGLO ===");
        ArrayList<String> dias = new ArrayList<>(Arrays.asList("Lunes", "Martes", "Miércoles", "Jueves", "Viernes"));
        Object[] arregloObject = dias.toArray();
        String[] arregloString = dias.toArray(new String[0]);
        
        System.out.println("Longitud arreglo Object: " + arregloObject.length);
        System.out.println("Longitud arreglo String: " + arregloString.length);
        
        System.out.print("Arreglo Object: ");
        for (Object obj : arregloObject) {
            System.out.print(obj + " ");
        }
        System.out.println();
        System.out.print("Arreglo String: ");
        for (String str : arregloString) {
            System.out.print(str + " ");
        }
        System.out.println();
        String[] semana = {"Sábado", "Domingo"};
        ArrayList<String> finDeSemana = new ArrayList<>(Arrays.asList(semana));
        System.out.println("ArrayList desde arreglo: " + finDeSemana);
        System.out.println();
    }
    
    // Ejercicio 10: Mini-Proyecto - Sistema de Gestión de Estudiantes
    public static void ejercicio10() {
        System.out.println("=== EJERCICIO 10: SISTEMA DE GESTIÓN DE ESTUDIANTES ===");
        
        ArrayList<String> nombresEstudiantes = new ArrayList<>();
        ArrayList<Double> calificacionesEstudiantes = new ArrayList<>();
        
        agregarEstudiante(nombresEstudiantes, calificacionesEstudiantes, "Ana", 4.5);
        agregarEstudiante(nombresEstudiantes, calificacionesEstudiantes, "Luis", 2.8);
        agregarEstudiante(nombresEstudiantes, calificacionesEstudiantes, "María", 3.7);
        agregarEstudiante(nombresEstudiantes, calificacionesEstudiantes, "Carlos", 4.2);
        agregarEstudiante(nombresEstudiantes, calificacionesEstudiantes, "Elena", 2.5);
        
        System.out.println("=== LISTA DE ESTUDIANTES ===");
        listarEstudiantes(nombresEstudiantes, calificacionesEstudiantes);
        
        double promedio = calcularPromedio(calificacionesEstudiantes);
        System.out.println("Promedio general: " + promedio);
        System.out.println("=== ESTUDIANTES APROBADOS ===");
        
        estudiantesAprobados(nombresEstudiantes, calificacionesEstudiantes);
        eliminarEstudiante(nombresEstudiantes, calificacionesEstudiantes, 1);
        
        int posicionMaria = buscarEstudiante(nombresEstudiantes, "María");
        System.out.println("María se encuentra en posición: " + posicionMaria);
        System.out.println("=== LISTA FINAL DE ESTUDIANTES ===");
        listarEstudiantes(nombresEstudiantes, calificacionesEstudiantes);
    }
    
    // Métodos auxiliares para el Ejercicio 10
    public static void agregarEstudiante(ArrayList<String> nombres, ArrayList<Double> calificaciones, 
                                       String nombre, Double calificacion) {
        nombres.add(nombre);
        calificaciones.add(calificacion);
    }
    
    public static void eliminarEstudiante(ArrayList<String> nombres, ArrayList<Double> calificaciones, int indice) {
        if (indice >= 0 && indice < nombres.size()) {
            nombres.remove(indice);
            calificaciones.remove(indice);
            System.out.println("Estudiante en posición " + indice + " eliminado");
        }
    }
    
    public static int buscarEstudiante(ArrayList<String> nombres, String nombre) {
        return nombres.indexOf(nombre);
    }
    
    public static double calcularPromedio(ArrayList<Double> calificaciones) {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.size();
    }
    
    public static void listarEstudiantes(ArrayList<String> nombres, ArrayList<Double> calificaciones) {
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println((i + 1) + ". " + nombres.get(i) + " - Calificación: " + calificaciones.get(i));
        }
    }

    public static void estudiantesAprobados(ArrayList<String> nombres, ArrayList<Double> calificaciones) {
        for (int i = 0; i < nombres.size(); i++) {
            if (calificaciones.get(i) >= 3.0) {
                System.out.println(nombres.get(i) + " - Calificación: " + calificaciones.get(i));
            }
        }
    }
}