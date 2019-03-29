package streamtest;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import streamtest.dao.InMemoryWorldDao;

public class MyStream{

	public static void highestPopulatedCityInCountry(){
            //highest populated city in each country
            InMemoryWorldDao world= InMemoryWorldDao.getInstance();
            List <Country> countries =world.findAllCountries();
            countries.stream().forEach((c)-> 
            {
                Optional<City> maxCity =c.getCities().stream().max(City::compareTo);
                if(maxCity.isPresent())
                    System.out.println(maxCity.get());
            }
            );
        }
           
            //the most populated city of each continent
        
        public static List<City> getCitesInContient(String contient)
        {
        return InMemoryWorldDao.getInstance().findCountriesByContinent(contient).stream().map(Country::getCities).flatMap(List::stream).collect(Collectors.toList());
        }
        public static void highestPopulatedCityInEachContinent(){
        InMemoryWorldDao world= InMemoryWorldDao.getInstance();
        world.getAllContinents().stream().map(MyStream::getCitesInContient).filter(l -> !l.isEmpty()).map((l)-> Collections.max(l,City::compareTo)).forEach(System.out::println);
    }
        
        public static void highestPopulatedCapitalCity(){
            //the highest populated capital city
        InMemoryWorldDao world= InMemoryWorldDao.getInstance();
        List <Country> countries =world.findAllCountries();
        Optional<City> maxCity=countries.stream().map(Country::getCapital).map(world::findCityById).filter(Objects::nonNull).max(City::compareTo);
            if(maxCity.isPresent())
                    System.out.println(maxCity.get());
}
        public static void main(String args[]){
        System.out.println("highest populated city in each country:"); 
        MyStream.highestPopulatedCityInCountry();
        System.out.println("the highest populated capital city:");
        MyStream.highestPopulatedCapitalCity();
        System.out.println("the highest populated city in each continent:");
        MyStream.highestPopulatedCityInEachContinent();
        }
}