package services;

import model.Tarea;

import java.util.ArrayList;

public class DataTareas {
    public static ArrayList<Tarea> ListaTareas() {
        ArrayList<Tarea> Tareas = new ArrayList<>();

        Tareas.add(new Tarea("sociales", "Mapa Conceptual Latinoamerica","4/10/2024","En Progresp"));
        Tareas.add(new Tarea("comunicacion", "Investigacion de los 5 sentidos","8/10/2024","En Progreso"));
        Tareas.add(new Tarea("Musica", "proyecto manual una flauta con plasticina","12/10/2024","pendiente"));
        Tareas.add(new Tarea("Matematicas", "operaciones algebraicas","18/10/2024","completado"));
        Tareas.add(new Tarea("Literatura", "resumen arte contemporaneo","22/10/2024","En Progreso"));

        return Tareas;
    }
}
