package EJEMPLO_EXAMEN;

public class Curso implements Comparable<Curso> {
        private String titulo;
        private int duracion; // Expresada en horas
        private int videos; // Cantidad de vídeos
        private int alumnos; // Cantidad de alumnos

        public Curso(String titulo, int duracion, int videos, int alumnos) {
            this.titulo = titulo;
            this.duracion = duracion;
            this.videos = videos;
            this.alumnos = alumnos;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public int getDuracion() {
            return duracion;
        }

        public void setDuracion(int duracion) {
            this.duracion = duracion;
        }

    public int getVideos() {
        return videos;
    }

    public void setVideos(int videos) {
        this.videos = videos;
    }

    public int getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(int alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Curso{" + "titulo=" + titulo + ", duracion=" + duracion + ", videos=" + videos + ", alumnos=" + alumnos + '}';
    }

    @Override
    public int compareTo(Curso c) {
        return this.titulo.compareTo(c.titulo);
    }


}

