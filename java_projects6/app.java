package java_projects6;

import java.io.Console;
import java.util.ArrayList;

public class app {
  public static void main(String[] args) {
    Infrastructure infrastructure = new Infrastructure();
    Console console = System.console();
    String text = console.readLine("Введи начало: ");
    System.out.println(infrastructure.getName(text));

  }

}

class Infrastructure {
  public Infrastructure() {
    init();
  }

  Db db;

  public Db getDb() {
    return db;
  }

  public String getName(String text) {
    String text2 = "";
    for (int i = 0; i < db.films.size(); i++) {
      Cinema c = db.films.get(i);
      if (text.regionMatches(0, c.name, 0, text.length())) {
        text2 += c.name + "\n";
      }

    }
    return text2;
  }

  public String getAllInfo(int idCinema) {
    Cinema c = db.films.get(idCinema - 1);

    return String.format("%d %s %s %s",
        c.id,
        c.name,
        db.genres.get(c.genre - 1).name,
        db.prod.get(c.filmProd - 1).titleName);
  }

  Db init() {
    db = new Db();
    Cinema c1 = new Cinema(1, "Тьма", 1, 1);
    Cinema c2 = new Cinema(2, "Человек паук", 3, 2);
    Cinema c3 = new Cinema(3, "Железный человек", 3, 2);
    Cinema c4 = new Cinema(4, "Бетмен", 2, 4);
    Cinema c5 = new Cinema(4, "Бен", 2, 4);

    db.films.add(c1);
    db.films.add(c2);
    db.films.add(c3);
    db.films.add(c4);
    db.films.add(c5);

    db.genres.add(new Genre(1, "Ужасы"));
    db.genres.add(new Genre(2, "Драма"));
    db.genres.add(new Genre(3, "Комедия"));
    FilmProducerFactory pf = new FilmProducerFactory();
    db.addFilmProducer(pf.getFilmProducer("Ленфильм"));
    db.addFilmProducer(pf.getFilmProducer("Марвел"));
    db.addFilmProducer(pf.getFilmProducer("Мостфильм"));
    db.addFilmProducer(pf.getFilmProducer("DC"));

    return db;
  }
}

class Db {
  ArrayList<Cinema> films = new ArrayList<>();
  ArrayList<FilmProducer> prod = new ArrayList<>();
  ArrayList<Genre> genres = new ArrayList<>();

  public void addFilmProducer(FilmProducer producer) {
    prod.add(producer);
  }
}

class Cinema {
  int id;
  int filmProd;
  String name;
  int genre;

  public Cinema(int id, String name, int genre, int filmProd) {
    this.id = id;
    this.filmProd = filmProd;
    this.name = name;
    this.genre = genre;
  }
}

class FilmProducer {
  int id;
  String titleName;
}

class Genre {
  int id;
  String name;

  public Genre(int id, String name) {
    this.id = id;
    this.name = name;
  }
}

class FilmProducerFactory {
  int count = 1;

  public FilmProducer getFilmProducer(String name) {
    FilmProducer fp = new FilmProducer();
    fp.id = count++;
    fp.titleName = name;
    return fp;
  }
}