package academy.devdojo.javacore.Ycolecoes.domain;

public class Aula2 implements Comparable<Aula2> {
   private String titulo;
   private int tempo;

   
public Aula2(String titulo, int tempo) {
    this.titulo = titulo;
    this.tempo = tempo;
}


@Override
public String toString() {
    return "Aula2 [titulo=" + titulo + ", tempo=" + tempo + "]";
}


public String getTitulo() {
    return titulo;
}
public int getTempo() {
    return tempo;
}


@Override
public int compareTo(Aula2 outraAulas) {
    // TODO Auto-generated method stub

    if(this.titulo != null);

    return this.titulo.compareTo(outraAulas.titulo);
}

   
}
