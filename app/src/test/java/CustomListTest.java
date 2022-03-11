import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    @Before
    public void createList() {
        list = new CustomList(null, new ArrayList<City>());

    }

    /*
    @Test
    public void countCitiesTest() {
        int listSize = list.getCount();
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }
    @Test
    public void addCityTest() {
        int listSize = list.getCount();
        list.addCity(new City("Edmonton", "AB"));
        assertEquals(list.getCount(), listSize+1);
    }

    @Test
    public void deleteCityTest() {
        int listSize = list.getCount();
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        assertEquals(list.getCount(), listSize+1);
        list.deleteCity(city);
        assertEquals(list.getCount(), listSize);
    }
*/
    @Test
    public void getCountTest() {
        assertEquals(list.getCount(), 0);
        City city = new City("Edmonton", "AB");
        list.add(city);
        assertEquals(list.getCount(), 1);


    }






}
