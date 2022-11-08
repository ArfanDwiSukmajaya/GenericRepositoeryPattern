package co.id.ms.grp.factory;

import co.id.ms.grp.model.Country;
import co.id.ms.grp.model.Region;
import co.id.ms.grp.repository.RegionRepository;
import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Component
public class SimpleDataLoader implements CommandLineRunner {
    private final RegionRepository regionRepository;
    private final Faker faker;

    public SimpleDataLoader(RegionRepository regionRepository, Faker faker) {
        this.regionRepository = regionRepository;
        this.faker = faker;
    }

    @Override
    public void run(String... args) throws Exception {
//        add data to region

//        for (int i = 1; i <= 10; i++){
//            Region region = new Region();
//            region.setName(faker.country().name());
//            regionRepository.save(region);
//        }

//        List<Country> country = new ArrayList<>();

        List<Region> region = IntStream.rangeClosed(1, 100)
                .mapToObj(i -> new Region(
                        faker.name().firstName()
//                        country
                )).collect(Collectors.toList());
        regionRepository.saveAll(region);
    }
}
