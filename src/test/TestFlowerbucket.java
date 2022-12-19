import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.flowerstoreweb.models.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlowerBucketTest {
    private FlowerBucket flowerBucket;

    @BeforeEach
    public void init() {
        Flower flower = new Rose();
        flower.setPrice(10);
        FlowerPack flowerPack = new FlowerPack(flower, 10);
        flowerBucket = new FlowerBucket();
        flowerBucket.addFlowerPack(flowerPack);
    }

    @Test
        true
}
