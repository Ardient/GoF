package experiment.test_1;

/**
 * @Author Ardien
 * @Date 5/27/2020 9:35 AM
 * @Email ardien@126.com
 * @Version 1.0
 **/
public class DellFactory implements Factory {
    @Override
    public Laptop create() {
        return new DellLaptop();
    }
}
