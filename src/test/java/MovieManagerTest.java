import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MovieManagerTest {
    @Test
    public void addZeroMovies(){
        MovieManager manager = new MovieManager();
        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void addOneMovies(){
        MovieManager manager = new MovieManager();
        manager.addMovie("Бладшот");
        String[] expected = {"Бладшот"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void addFiveMovies(){
        MovieManager manager = new MovieManager();
        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек Невидимка");
        String[] expected = {"Бладшот","Вперед", "Отель Белград","Джентельмены", "Человек Невидимка"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void showLastMovies(){
        MovieManager manager = new MovieManager();
        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек Невидимка");
        String[] expected = {"Человек Невидимка","Джентельмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void showLastFourMovies(){
        MovieManager manager = new MovieManager();
        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентельмены");

        String[] expected = {"Джентельмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void showLastMoviesLimit6(){
        MovieManager manager = new MovieManager(6);
        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек Невидимка");
        manager.addMovie("Тролли");
        String[] expected = {"Тролли","Человек Невидимка","Джентельмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void tryShowLastMoviesMoreActualLimit(){
        MovieManager manager = new MovieManager();
        manager.addMovie("1");
        manager.addMovie("2");
        manager.addMovie("3");
        manager.addMovie("4");
        manager.addMovie("5");
        manager.addMovie("6");
        manager.addMovie("7");
        manager.addMovie("8");
        String[] expected = {"8","7","6","5","4",};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

}
