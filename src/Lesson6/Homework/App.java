package Lesson6.Homework;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Добавить метод(ы) в class Infrastructure позволяющий осуществлять поиск по части имени фильма
 * <p>
 * Пример вызова ArrayList<String> result = infrastructure.findAll("особ");
 */

public class App {
    public static void main(String[] args) throws IOException {
        Infrastructure infrastructure = new Infrastructure();
        Input inp = new Input();
        String search = inp.setSearch();
        System.out.println(infrastructure.findAll(search));
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

    /**
     * Метод поиска наличия в базе данных части введенного в поиск названия
     * Сначала получаем id фильма, если поиск дал результат, потом отдаем в результирующий список строк, для
     * более удобного вывода на печать.
     *
     * @param search строка, по которой ищем соответствия в базе данных фильма
     * @return Лист Строк, если поиск даст несколько совпадений
     */
    public ArrayList<String> findAll(String search) {
        ArrayList<Integer> idOfFilm = new ArrayList<>();
        for (int i = 0; i < db.films.size(); i++) {
            if (db.films.get(i).name.toLowerCase().contains(search.toLowerCase())) {
                idOfFilm.add(db.films.get(i).id);
            }
        }
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < idOfFilm.size(); i++) {
            result.add(getAllInfo(idOfFilm.get(i)));
        }
        if (result.size() == 0) {
            System.out.println("Film doesn't exist in DB.");
        }
        return result;
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
        Cinema c2 = new Cinema(2, "Свет", 1, 2);
        Cinema c3 = new Cinema(3, "Особенности охоты...", 3, 4);
        Cinema c4 = new Cinema(4, "Человек паук", 3, 2);
        Cinema c5 = new Cinema(5, "Человек паук: Возвращение", 3, 2);

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
        db.addFilmProducer(pf.getFilmProducer("Мосфильм"));
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