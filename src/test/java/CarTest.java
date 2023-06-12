import org.example.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;
    Engine engine;

    Tyres tyres;

    Manufacturer manufacturer;

    @Before
    public void before(){
        engine = new Engine(2.0, 231, 3000);
        tyres = new Tyres("Michelin", 10000);
        manufacturer = new Manufacturer("Mini","John Cooper Works", CarType.PETROL);
        car = new Car(engine, tyres,manufacturer, 32000.00, "Moonwalk Grey");
    }

    @Test
    public void carHasEngineVolume(){
        assertEquals(2.0, car.getEngine().getVolume(),0.0);
    }

    @Test
    public void carHasTyreMileage(){
        assertEquals(10000,car.getTyres().getMiles());
    }

    @Test
    public void carHasType(){
        assertEquals("Petrol", car.getManufacturer().getCarType().getCarType());

    }

    @Test
    public void carHasColour(){
        assertEquals("Moonwalk Grey", car.getColor());
    }
}
